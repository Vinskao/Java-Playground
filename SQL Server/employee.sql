create table employee(
 emp_id int not null primary key identity(1,1),
 emp_name nvarchar(50),
 emp_department nvarchar(50),
 emp_age int,
);


insert into employee(emp_name, emp_department, emp_age)
values('Tony','HR', 35),
('Amy','RD', 30),('Jenny', 'Sells',28),
('Tom','RD',22),('Betty','HR',25),
('John','Account',36),('Mary','Sells', 22);

create view nonage as
select emp_id, emp_name, emp_department from employee
where emp_age > 30;

select * from employee;

alter view nonage as
select emp_id, emp_name, emp_department from employee
where emp_age >= 30;

create view nonage2
with encryption
as
select emp_id, emp_name, emp_department from employee
where emp_age > 30;

select * from nonage3;

create view nonage3
with encryption
as
select emp_id, emp_name, emp_department, emp_age
from employee
where emp_age > 30
with check option;

insert into nonage3
values('Molly', 'HR', 33);

insert into nonage3
values('Nancy', 'HR', 18);

DELETE FROM employee
WHERE emp_name = 'HR' AND emp_department = 'Molly' AND emp_age = 33;

