create table products(
    id int primary key IDENTITY(1,1),
    p_name varchar(50),
    deaprtment varchar(50),
    remark varchar(50)
)

TRUNCATE table products;

set nocount ON
declare @counter int =1
while(@counter <= 50000)
begin
  declare @name varchar(50) = 'nnn' + convert(varchar(10) , @counter)
  declare @department varchar(50) = 'dept' + convert(varchar(10) , @counter)
  declare @remark varchar(50) = 'rrr' + convert(varchar(10) , @counter)

  insert into products values(@name,@department,@remark)

  set @counter = @counter + 1
end

select top(100)
select * from products where remark = 'rrr40000';

select * from products where id = 40000;
