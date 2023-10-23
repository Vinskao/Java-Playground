use AdventureWorks2019;
SELECT * from HumanResources.Department;

SELECT BusinessEntityID, JobTitle, LoginID 
FROM HumanResources.Department
WHERE JobTitle = 'Research and Development Engineer';

SELECT BusinessEntityID, FirstName,MiddleName, LastName, ModifiedDate 
FROM Person.Person
WHERE ModifiedDate > '2013-12-29';

SELECT BusinessEntityID, FirstName,MiddleName, LastName, ModifiedDate 
FROM Person.Person
WHERE ModifiedDate not like '%2013%';

SELECT BusinessEntityID, FirstName,MiddleName, LastName, ModifiedDate 
FROM Person.Person
WHERE ModifiedDate < '2013-12-29' and ModifiedDate > '2013-01-01';

select ProductID, Name from Production.Product where name like 'Chain%';

select ProductID, Name from Production.Product where name like '%helmet%';
select ProductID, Name from Production.Product where name not like '%helmet%';

select SalesOrderID,OrderDate,TotalDue from Sales.salesorderheader 
where OrderDate between '2011-09-01' and '2011-09-30'
and TotalDue > '3950';

select productID, name, color from Production.Product
where color is null;

select BusinessEntityID, LastName, FirstName, MiddleName from Person.Person
order by LastName, FirstName, MiddleName;

select CustomerID, StoreID, TerritoryID, FirstName, MiddleName, LastName from Person.Person
left join Sales.Customer on Person.person.BusinessEntityID = sales.Customer.PersonID;


select C.CustomerID, StoreID, FirstName, MiddleName, LastName
from sales.Customer as C
join person.Person as P on C.PersonID = P.BusinessEntityID
join Sales.SalesOrderHeader as S on C.CustomerID = S.CustomerID;

select SalesOrderID, SalesPersonID, SalesYTD from sales.SalesPerson as sp
join sales.SalesOrderHeader as soh on sp.BusinessEntityID = soh.SalesPersonID;

select ProductID, Name from Production.Product
where ProductID in (select ProductID from sales.SalesOrderDetail)

select productID, sum(OrderQty) as SumQty from Sales.SalesOrderDetail
GROUP by ProductID
order by SumQty asc;

select ProductLine, count(*) as productQ from Production.Product
group by ProductLine;

alter VIEW vw_Products AS
SELECT name, color, size, weight, pp.StandardCost
FROM production.product AS pp
JOIN production.ProductCostHistory AS ppch ON pp.ProductID = ppch.ProductID;

select * from vw_Products;

DECLARE @product VARCHAR(50)
SET @product = 'i15'

DECLARE @product2 VARCHAR(50)
SET @product2 = 'i14'
SELECT @product2, @product;

declare @num INT
set @num = 4
if @num < 8
    BEGIN
        print 'right'
    END
ELSE
    BEGIN
        print 'wrong answer'
    end



use ecommerce
declare @myID INT, @name varchar(50)
set @myID = 0
while @myID <=3
    BEGIN
        select @name = p_name from products where id = @myID
        set @myID = @myID + 1
        print @name
    END