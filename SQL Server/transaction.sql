create table accounts(
    id int PRIMARY key not null identity(1,1),
    username varchar(50) not null unique,
    balance bigint check (balance >= 0)
)

insert into accounts( username, balance)
values ('TY', 1000), ('Sorane', 1000)

select * from accounts

TRUNCATE table accounts;

begin TRANSACTION;
update accounts set balance = balance - 50 where username = 'TY';
--unplug

ROLLBACK TRANSACTION;
update accounts set balance = balance + 50 where username = 'Sorane';
--unplug 不使用commit時最後一行會在斷電後從記憶體Ram消失而沒有被紀錄
commit TRANSACTION;

select * from accounts

begin try
    begin transaction
    update accounts set balance = balance + 2000 where username = 'TY';
    update accounts set balance = balance - 2000 where username = 'Sorane';
    commit TRANSACTION
end try
begin CATCH
    ROLLBACK TRANSACTION
    print 'rollback insufficient fund' --只要觸發，兩個update都會消失
end CATCH

set implicit_transactions on;
BEGIN TRANSACTION;
update accounts set balance = balance -50 where username = 'TY';
update accounts set balance = balance +200 where username = 'Sorane';
COMMIT; --沒有commit則斷電後完全不會update
update accounts set balance = balance -50 where username = 'TY'; --這行會被記憶

-- 聯集
set implicit_transactions off;

create table TPShop(
    id int primary key IDENTITY(1,1) not null,
    phoneName varchar(50)
)

create table KSShop(
    id int primary key IDENTITY(1,1) not null,
    phoneName varchar(50)
)

TRUNCATE table ksshop

insert into TPShop(phoneName)
values('i8'),('i9'),('i10'),('i11'),('i12')

insert into KSShop(phoneName)
values('i8'),('i9'),('i15'),('i16'),('i17')
--垂直整合
select phoneName from tpshop
UNION all
select phoneName from ksshop

select phoneName from tpshop
UNION 
select phoneName from ksshop

select phoneName from tpshop
except
select phoneName from ksshop
--上下相同
select * --台北-高雄
from tpshop as tp
left join ksshop as ks on tp.phoneName = ks.phoneName
where ks.phoneName is null;

select * --高雄-台北
from tpshop as tp
right join ksshop as ks on tp.phoneName = ks.phoneName
where tp.phoneName is null;


select * --交集或聯集
from TPShop tp
full join KSShop kh
on tp.phoneName = kh.phoneName


select phoneName from tpshop
except
select phoneName from ksshop
union (
select phoneName from ksshop
except
select phoneName from tpshop)

select tp.phoneName
from tpshop as tp
left join ksshop as ks on tp.phoneName = ks.phoneName
union
select ks.phoneName
from tpshop as tp
right join ksshop as ks on tp.phoneName = ks.phoneName

