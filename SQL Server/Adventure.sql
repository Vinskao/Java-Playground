use AdventureWorks2022;
SELECT BusinessEntityID, JobTitle, LoginID 
FROM HumanResources.Employee
WHERE JobTitle = 'Research and Development Engineer';

SELECT BusinessEntityID, FirstName,MiddleName, LastName, ModifiedDate 
FROM Person.Person
WHERE ModifiedDate > '2013-12-29';

SELECT BusinessEntityID, FirstName,MiddleName, LastName, ModifiedDate 
FROM Person.Person
WHERE ModifiedDate < '2013-12-29' and ModifiedDate > '2013-01-01';

