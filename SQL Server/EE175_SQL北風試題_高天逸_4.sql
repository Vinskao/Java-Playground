use northwind;
--1
select OrderID, CustomerID, ShipCountry from orders
where ShipCountry = 'Germany' OR ShipCountry = 'Canada';
--2
select LastName, FirstName, datediff(year,BirthDate,getDate()) Age from Employees 
group by LastName, FirstName ,BirthDate
order by datediff(year,BirthDate,getDate()) desc
--2
select LastName, FirstName, datediff(year,BirthDate,getDate()) Age, SUBSTRING(convert(varchar(50), BirthDate), 1, 10) DOB 
from Employees
group by LastName, FirstName ,BirthDate
order by datediff(year,BirthDate,getDate()) desc
--3
select concat(LastName, ' ' , FirstName) fullName
from Employees
--4
select OrderID, ProductID, UnitPrice, Quantity, UnitPrice * Quantity as value
from [Order Details]
order by OrderID, ProductID
--5
select count(CustomerID) as totalClients
from Customers
--6
select top 1 orderDate as firstOrderDate from orders;
--7
select country from customers
group by country
--8
select p.ProductName, s.CompanyName from products as p
join Suppliers as s on p.SupplierID = s.SupplierID
--9
select OrderID,OrderDate, s.CompanyName from orders o
join Shippers s on s.ShipperID = o.ShipVia
where OrderID <= 10300
--10
select count(productID) as totalProducts, c.CategoryName 
from Products p
join categories c on c.CategoryID = p.CategoryID
group by c.CategoryID,c.CategoryName
order by count(productID) desc
--11
select Country, city, count(customerID) howManyClients from customers
group by Country, city
--12
select ProductID ,ProductName ,UnitsInStock ,ReorderLevel 
from Products 
where UnitsInStock < ReorderLevel
order by ProductID
--13
select ProductID,ProductName ,UnitsInStock, UnitsOnOrder ,ReorderLevel, Discontinued 
from Products 
where Discontinued = 0 and (UnitsInStock + UnitsOnOrder) < ReorderLevel
--14
select top 3 ShipCountry, avg(freight) avgFreight from Orders 
group by ShipCountry
order by avg(freight) desc
--15
select * from Orders
select top 3 ShipCountry, avg(freight) avgFreight, OrderDate from Orders
where OrderDate like '%1998%'
group by ShipCountry, OrderDate
order by avg(freight) desc
--16
select c.CustomerID, c.CompanyName from customers c
left join orders o on c.customerID = o.customerID
where o.customerID is null;