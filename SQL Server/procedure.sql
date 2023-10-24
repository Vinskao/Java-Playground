CREATE TABLE users (
    user_id INT IDENTITY(1,1) PRIMARY KEY,
    first_name NVARCHAR(50),
    last_name NVARCHAR(50)
);

create TABLE products (
    id INT IDENTITY(1, 1) PRIMARY KEY,
    department NVARCHAR(100),
    product_name NVARCHAR(100),
    price DECIMAL(10, 2),
    description NVARCHAR(255)
);



create procedure addUsers2
@firstName nvarchar(50),
@lastName nvarchar(50)
as
insert into users (first_name, last_name)
values(@firstName,@lastName)

execute addUsers2 'jerry', 'TTT'

select * from users;

create proc productId_department2
@productId int, @dept varchar(50) out
as
select @dept = department from products where id = @productId


declare @o_dept varchar(50)
exec productId_department2 20,@o_dept out

select * from products where department = @o_dept


