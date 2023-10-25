select p_name ,department, max(price) over (partition by department) from products


select * from products

create table product_part (
    id int PRIMARY key not null,
    productName varchar(50),
    price int
)

--select into
insert into [product_part](id, productName, price)
select id, p_name, price from products

select * from product_part;
