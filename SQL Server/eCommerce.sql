GO
CREATE TABLE users (
  id int not null PRIMARY KEY IDENTITY(1,1),
  first_name NVARCHAR(50),
  last_name NVARCHAR(50)
);
GO
CREATE TABLE products (
  id int not null PRIMARY KEY IDENTITY(1,1),
  p_name NVARCHAR(50),
  department NVARCHAR(50),
  price INT,
  weights INT
);
GO
CREATE TABLE orders (
  id int not null PRIMARY KEY IDENTITY(1,1),
  users_id int,
  product_id int,
  paid bit,
  foreign key (users_id) REFERENCES users(id),
  foreign key (product_id) REFERENCES products(id)
);
GO

INSERT INTO users (first_name, last_name) 
VALUES 
  ('Iva', 'Lindgren'),
	('Ignatius', 'Johns'),
	('Jannie', 'Boehm'),
	('Neal', 'Wehner'),
	('Mikayla', 'Casper'),
	('Patience', 'Stracke'),
	('Josianne', 'Gerhold'),
	('Kailee', 'Jacobson'),
	('Marlen', 'Hickle'),
	('Pansy', 'Daugherty'),
	('Vinnie', 'Feest'),
	('Cierra', 'Johns'),
	('Violette', 'Heathcote'),
	('Stan', 'Rath'),
	('Neha', 'Hyatt'),
	('Kaylah', 'Gleason'),
	('Jacky', 'Hegmann'),
	('Duane', 'Lockman'),
	('Sonya', 'Marquardt'),
	('Brenden', 'Streich'),
	('Laurianne', 'Douglas'),
	('Orlando', 'Kerluke'),
	('Irma', 'Wintheiser'),
	('Cletus', 'Schultz'),
	('Jermaine', 'Langosh'),
	('Alexanne', 'Dickens'),
	('Garret', 'Williamson'),
	('Max', 'Goodwin'),
	('Tad', 'Wilderman'),
	('Lindsay', 'Yost'),
	('Elliot', 'Oberbrunner'),
	('Brendan', 'Thompson'),
	('Brennan', 'Auer'),
	('Luigi', 'Johnston'),
	('Garth', 'McLaughlin'),
	('Ressie', 'Nikolaus'),
	('Ruby', 'Turner'),
	('Caden', 'Turcotte'),
	('Armand', 'Kshlerin'),
	('Albertha', 'Yundt'),
	('Kathryn', 'Mueller'),
	('Arely', 'McGlynn'),
	('Lawrence', 'Casper'),
	('Johathan', 'Kirlin'),
	('Clara', 'Gerhold'),
	('Miller', 'Feil'),
	('Rosendo', 'Sawayn'),
	('Sally', 'Mann'),
	('Kennith', 'Hettinger'),
	('Mathilde', 'Eichmann');

GO

INSERT INTO products (p_name, department, price, weights)
VALUES
  ('Practical Fresh Shirt', 'Toys', 876.00, 3),
	('Gorgeous Steel Towels', 'Outdoors', 412.00, 16),
	('Rustic Plastic Bacon', 'Movies', 10.00, 6),
	('Tasty Wooden Ball', 'Industrial', 796.00, 23),
	('Fantastic Soft Fish', 'Tools', 10.00, 10),
	('Gorgeous Concrete Towels', 'Grocery', 328.00, 11),
	('Incredible Granite Mouse', 'Home', 989.00, 2),
	('Gorgeous Rubber Ball', 'Books', 801.00, 4),
	('Generic Fresh Computer', 'Toys', 926.00, 11),
	('Unbranded Cotton Shoes', 'Sports', 298.00, 29),
	('Fantastic Metal Chair', 'Home', 887.00, 9),
	('Ergonomic Metal Pizza', 'Jewelery', 463.00, 16),
	('Ergonomic Steel Car', 'Outdoors', 53.00, 20),
	('Licensed Steel Car', 'Movies', 664.00, 10),
	('Tasty Metal Cheese', 'Beauty', 650.00, 17),
	('Handcrafted Rubber Towels', 'Baby', 945.00, 6),
	('Intelligent Metal Mouse', 'Music', 509.00, 7),
	('Awesome Cotton Salad', 'Shoes', 211.00, 16),
	('Unbranded Plastic Pizza', 'Industrial', 72.00, 9),
	('Practical Concrete Sausages', 'Industrial', 408.00, 9),
	('Handcrafted Frozen Chair', 'Garden', 411.00, 16),
	('Generic Cotton Pizza', 'Home', 555.00, 4),
	('Intelligent Cotton Chips', 'Books', 280.00, 21),
	('Small Plastic Soap', 'Beauty', 345.00, 1),
	('Small Wooden Pizza', 'Garden', 307.00, 7),
	('Rustic Rubber Soap', 'Beauty', 127.00, 2),
	('Handmade Plastic Gloves', 'Sports', 301.00, 10),
	('Unbranded Cotton Tuna', 'Jewelery', 633.00, 10),
	('Practical Plastic Towels', 'Games', 379.00, 20),
	('Practical Wooden Shoes', 'Computers', 112.00, 20),
	('Sleek Granite Towels', 'Toys', 797.00, 30),
	('Practical Rubber Mouse', 'Garden', 948.00, 15),
	('Handcrafted Concrete Bike', 'Toys', 748.00, 10),
	('Rustic Granite Chair', 'Electronics', 76.00, 8),
	('Unbranded Wooden Ball', 'Sports', 384.00, 2),
	('Licensed Frozen Chair', 'Books', 417.00, 9),
	('Handmade Rubber Chicken', 'Movies', 959.00, 22),
	('Awesome Fresh Keyboard', 'Home', 982.00, 30),
	('Generic Fresh Hat', 'Baby', 791.00, 25),
	('Licensed Plastic Keyboard', 'Garden', 433.00, 17),
	('Fantastic Steel Chicken', 'Computers', 472.00, 17),
	('Tasty Rubber Soap', 'Tools', 823.00, 6),
	('Refined Wooden Mouse', 'Music', 842.00, 15),
	('Gorgeous Steel Cheese', 'Movies', 548.00, 9),
	('Fantastic Fresh Sausages', 'Industrial', 360.00, 26),
	('Incredible Granite Bacon', 'Music', 982.00, 9),
	('Handcrafted Fresh Sausages', 'Games', 231.00, 21),
	('Intelligent Fresh Ball', 'Home', 619.00, 9),
	('Handmade Plastic Fish', 'Games', 312.00, 23),
	('Handcrafted Cotton Bacon', 'Kids', 480.00, 12),
	('Sleek Rubber Shoes', 'Jewelery', 597.00, 6),
	('Handmade Granite Fish', 'Electronics', 166.00, 14),
	('Practical Wooden Chips', 'Toys', 707.00, 4),
	('Handmade Rubber Salad', 'Outdoors', 232.00, 13),
	('Unbranded Granite Shirt', 'Music', 519.00, 13),
	('Gorgeous Plastic Sausages', 'Movies', 556.00, 2),
	('Awesome Steel Mouse', 'Clothing', 175.00, 5),
	('Licensed Steel Towels', 'Industrial', 939.00, 23),
	('Handcrafted Fresh Bacon', 'Sports', 387.00, 29),
	('Fantastic Cotton Shirt', 'Health', 496.00, 24),
	('Licensed Cotton Sausages', 'Sports', 751.00, 27),
	('Ergonomic Fresh Pants', 'Baby', 638.00, 30),
	('Handcrafted Frozen Shoes', 'Sports', 84.00, 1),
	('Small Concrete Pants', 'Health', 487.00, 19),
	('Intelligent Plastic Car', 'Shoes', 628.00, 13),
	('Intelligent Cotton Chips', 'Baby', 521.00, 22),
	('Licensed Steel Towels', 'Health', 132.00, 11),
	('Sleek Soft Computer', 'Movies', 619.00, 7),
	('Fantastic Fresh Shirt', 'Tools', 643.00, 17),
	('Generic Fresh Shoes', 'Kids', 628.00, 29),
	('Sleek Fresh Gloves', 'Clothing', 919.00, 15),
	('Gorgeous Rubber Keyboard', 'Baby', 32.00, 8),
	('Handcrafted Soft Chicken', 'Kids', 720.00, 8),
	('Small Metal Mouse', 'Baby', 60.00, 6),
	('Fantastic Fresh Chips', 'Home', 966.00, 14),
	('Awesome Metal Pants', 'Shoes', 460.00, 8),
	('Handcrafted Frozen Chips', 'Shoes', 564.00, 19),
	('Gorgeous Plastic Gloves', 'Movies', 341.00, 14),
	('Rustic Metal Salad', 'Health', 240.00, 12),
	('Small Fresh Gloves', 'Garden', 991.00, 8),
	('Small Fresh Bacon', 'Baby', 473.00, 10),
	('Refined Rubber Tuna', 'Garden', 1.00, 21),
	('Small Metal Chips', 'Home', 161.00, 27),
	('Unbranded Fresh Tuna', 'Home', 657.00, 9),
	('Refined Metal Hat', 'Industrial', 309.00, 21),
	('Refined Concrete Pants', 'Sports', 724.00, 2),
	('Licensed Plastic Salad', 'Beauty', 834.00, 5),
	('Licensed Soft Chicken', 'Toys', 425.00, 13),
	('Fantastic Granite Soap', 'Home', 666.00, 29),
	('Awesome Steel Towels', 'Baby', 552.00, 10),
	('Ergonomic Wooden Tuna', 'Garden', 778.00, 29),
	('Fantastic Wooden Chair', 'Jewelery', 145.00, 26),
	('Tasty Granite Chips', 'Home', 37.00, 9),
	('Tasty Rubber Table', 'Computers', 525.00, 29),
	('Ergonomic Granite Shoes', 'Beauty', 48.00, 12),
	('Refined Metal Tuna', 'Jewelery', 708.00, 23),
	('Intelligent Rubber Chicken', 'Industrial', 1.00, 11),
	('Practical Steel Shoes', 'Toys', 947.00, 14),
	('Handcrafted Rubber Shoes', 'Sports', 275.00, 6),
	('Intelligent Cotton Gloves', 'Home', 447.00, 29);

GO

INSERT INTO orders (users_id, product_id, paid)
VALUES
  (41, 100, 1),
	(27, 99, 0),
	(50, 72, 0),
	(24, 81, 1),
	(24, 54, 1),
	(1, 6, 1),
	(17, 25, 0),
	(8, 5, 1),
	(34, 3, 1),
	(41, 19, 1),
	(15, 23, 1),
	(23, 60, 1),
	(31, 44, 1),
	(46, 34, 0),
	(11, 76, 0),
	(44, 74, 1),
	(18, 58, 1),
	(40, 1, 0),
	(41, 22, 1),
	(10, 20, 0),
	(50, 49, 0),
	(14, 30, 1),
	(4, 38, 0),
	(42, 34, 1),
	(22, 16, 0),
	(4, 89, 1),
	(49, 18, 1),
	(35, 30, 1),
	(7, 59, 0),
	(31, 25, 1),
	(43, 16, 0),
	(18, 27, 0),
	(47, 91, 1),
	(32, 22, 0),
	(5, 11, 0),
	(14, 68, 0),
	(19, 8, 0),
	(43, 74, 1),
	(29, 1, 0),
	(7, 6, 1),
	(16, 3, 1),
	(29, 15, 0),
	(25, 80, 1),
	(5, 15, 1),
	(23, 9, 1),
	(20, 28, 0),
	(18, 21, 1),
	(34, 27, 0),
	(33, 44, 1),
	(26, 18, 0),
	(10, 42, 0),
	(49, 47, 1),
	(4, 87, 1),
	(8, 82, 1),
	(32, 96, 1),
	(3, 88, 1),
	(2, 8, 1),
	(49, 25, 0),
	(3, 34, 1),
	(38, 81, 0),
	(41, 69, 1),
	(50, 19, 1),
	(44, 44, 0),
	(20, 52, 0),
	(16, 44, 0),
	(50, 62, 0),
	(47, 4, 0),
	(4, 2, 1),
	(36, 56, 1),
	(49, 18, 1),
	(20, 63, 1),
	(18, 44, 1),
	(30, 69, 1),
	(33, 52, 1),
	(18, 1, 1),
	(39, 94, 1),
	(39, 53, 1),
	(31, 75, 1),
	(39, 64, 0),
	(33, 46, 0),
	(16, 43, 0),
	(41, 41, 0),
	(33, 77, 1),
	(8, 95, 0),
	(16, 75, 0),
	(4, 12, 0),
	(14, 4, 1),
	(31, 90, 1),
	(30, 77, 1),
	(44, 53, 0),
	(34, 70, 1),
	(23, 76, 0),
	(22, 87, 0),
	(45, 15, 1),
	(14, 15, 1),
	(6, 11, 1),
	(3, 84, 0),
	(25, 89, 1),
	(5, 66, 1),
	(40, 70, 0),
	(10, 95, 1),
	(22, 39, 1),
	(13, 13, 0),
	(12, 46, 0),
	(28, 77, 0),
	(14, 67, 0),
	(11, 52, 0),
	(11, 6, 0),
	(32, 17, 1),
	(40, 79, 1),
	(5, 84, 1),
	(38, 67, 0),
	(45, 8, 0),
	(21, 90, 1),
	(38, 9, 1),
	(23, 33, 0),
	(14, 32, 0),
	(47, 71, 0),
	(15, 63, 1),
	(12, 13, 1),
	(32, 76, 1),
	(17, 23, 1),
	(48, 20, 0),
	(25, 29, 1),
	(20, 18, 1),
	(49, 6, 1),
	(28, 97, 0),
	(2, 29, 1),
	(36, 96, 0),
	(13, 99, 0),
	(36, 70, 0),
	(34, 38, 1),
	(15, 11, 0),
	(19, 17, 0),
	(32, 73, 1),
	(45, 27, 1),
	(34, 86, 0),
	(27, 68, 1),
	(49, 90, 0),
	(10, 60, 1),
	(31, 84, 0),
	(35, 83, 0),
	(28, 43, 0),
	(39, 95, 0),
	(11, 53, 1),
	(8, 89, 1),
	(23, 7, 1),
	(39, 42, 0),
	(41, 60, 0),
	(25, 18, 1),
	(38, 88, 0),
	(47, 69, 1),
	(15, 13, 1),
	(37, 35, 0),
	(37, 52, 1),
	(12, 80, 0),
	(39, 40, 1),
	(28, 23, 0),
	(3, 58, 0),
	(33, 92, 0),
	(38, 51, 1),
	(18, 15, 0),
	(25, 57, 0),
	(46, 28, 0),
	(42, 49, 1),
	(31, 5, 1),
	(37, 29, 0),
	(4, 64, 1),
	(23, 12, 0),
	(37, 93, 1),
	(13, 46, 1),
	(4, 95, 0),
	(44, 59, 1),
	(39, 72, 0),
	(28, 44, 1),
	(3, 55, 0),
	(17, 36, 0),
	(7, 40, 0),
	(4, 69, 1),
	(39, 22, 1),
	(25, 2, 0),
	(21, 88, 0),
	(13, 1, 1),
	(34, 76, 0),
	(9, 19, 1),
	(43, 95, 0),
	(42, 16, 0),
	(50, 35, 0),
	(7, 61, 0),
	(16, 17, 1),
	(45, 25, 1),
	(36, 53, 1),
	(5, 85, 0),
	(1, 27, 1),
	(29, 29, 1),
	(14, 41, 1),
	(1, 95, 1),
	(2, 1, 1),
	(43, 63, 1),
	(6, 36, 1),
	(34, 26, 1),
	(35, 52, 0),
	(14, 92, 1),
	(18, 100, 1),
	(13, 17, 1),
	(25, 69, 0),
	(45, 3, 0),
	(37, 85, 0),
	(44, 87, 0),
	(36, 1, 1),
	(15, 68, 0),
	(12, 30, 1),
	(22, 41, 0),
	(16, 26, 1),
	(34, 46, 0),
	(33, 33, 0),
	(31, 31, 0),
	(41, 75, 1),
	(32, 66, 0),
	(11, 30, 1),
	(29, 20, 0),
	(16, 13, 0),
	(39, 79, 0),
	(45, 94, 0),
	(9, 96, 0),
	(36, 47, 0),
	(2, 34, 1),
	(43, 38, 1),
	(27, 6, 1),
	(19, 55, 1),
	(29, 48, 0),
	(45, 85, 0),
	(18, 38, 0),
	(1, 15, 1),
	(13, 25, 0),
	(14, 10, 0),
	(31, 28, 0),
	(20, 85, 0),
	(18, 88, 1),
	(8, 8, 0),
	(24, 58, 0),
	(24, 48, 1),
	(24, 68, 0),
	(29, 87, 1),
	(6, 36, 1),
	(46, 51, 1),
	(20, 21, 0),
	(18, 40, 1),
	(36, 12, 0),
	(22, 54, 1),
	(22, 10, 1),
	(20, 13, 0),
	(2, 33, 1),
	(20, 46, 1),
	(48, 37, 1),
	(41, 2, 0),
	(2, 53, 1),
	(45, 87, 0),
	(5, 35, 0),
	(28, 46, 0),
	(42, 79, 1),
	(27, 45, 0),
	(11, 21, 0),
	(36, 96, 0),
	(35, 59, 1),
	(30, 92, 1),
	(17, 28, 0),
	(28, 28, 1),
	(23, 43, 1),
	(44, 24, 0),
	(26, 98, 0),
	(36, 51, 0),
	(1, 66, 0),
	(47, 92, 0),
	(1, 36, 0),
	(9, 8, 0),
	(42, 97, 1),
	(32, 38, 0),
	(17, 60, 1),
	(14, 24, 1),
	(43, 14, 1),
	(47, 21, 1),
	(38, 46, 1),
	(22, 75, 0),
	(19, 47, 1),
	(10, 37, 1),
	(9, 11, 1),
	(44, 56, 1),
	(50, 6, 1),
	(21, 99, 0),
	(34, 4, 1),
	(5, 37, 0),
	(8, 11, 0),
	(12, 66, 0),
	(21, 74, 1),
	(38, 53, 0),
	(24, 54, 0),
	(33, 85, 1),
	(9, 57, 0),
	(20, 71, 1),
	(21, 4, 0),
	(38, 96, 0),
	(35, 50, 0),
	(16, 89, 0),
	(45, 95, 1),
	(33, 92, 0),
	(41, 87, 0),
	(25, 15, 0),
	(42, 86, 0),
	(2, 68, 0),
	(5, 85, 1),
	(42, 43, 0),
	(15, 8, 1),
	(13, 3, 1),
	(24, 86, 0),
	(34, 66, 0),
	(35, 98, 0),
	(48, 90, 0),
	(34, 97, 0),
	(48, 36, 1),
	(21, 31, 0),
	(40, 93, 0),
	(26, 89, 1),
	(47, 15, 1),
	(27, 24, 1),
	(30, 34, 0),
	(44, 23, 1),
	(17, 54, 1),
	(31, 42, 0),
	(42, 32, 0),
	(20, 55, 1),
	(2, 80, 1),
	(30, 70, 1),
	(24, 18, 1),
	(5, 96, 0),
	(50, 31, 0),
	(35, 98, 1),
	(41, 30, 0),
	(48, 22, 1),
	(19, 31, 0),
	(34, 33, 0),
	(19, 58, 0),
	(26, 72, 0),
	(34, 59, 1),
	(8, 39, 1),
	(40, 73, 0),
	(44, 56, 0),
	(36, 91, 1),
	(33, 56, 0),
	(36, 90, 1),
	(28, 22, 0),
	(49, 70, 1),
	(19, 14, 1),
	(39, 59, 0),
	(17, 39, 0),
	(40, 72, 1),
	(21, 96, 0),
	(3, 66, 1),
	(23, 6, 1),
	(6, 6, 0),
	(18, 52, 1),
	(48, 87, 1),
	(40, 83, 1),
	(23, 10, 1),
	(21, 6, 0),
	(24, 63, 1),
	(18, 67, 0),
	(35, 47, 0),
	(26, 62, 0),
	(14, 37, 0),
	(9, 51, 0),
	(1, 51, 1),
	(35, 29, 0),
	(49, 66, 1),
	(45, 47, 0),
	(26, 52, 0),
	(31, 60, 0),
	(4, 89, 0),
	(43, 46, 1),
	(16, 23, 0),
	(37, 97, 1),
	(47, 70, 0),
	(22, 88, 0),
	(21, 45, 1),
	(46, 25, 1),
	(36, 80, 1),
	(42, 20, 1),
	(14, 5, 0),
	(10, 65, 0),
	(14, 30, 0),
	(1, 37, 0),
	(2, 22, 1),
	(41, 3, 1),
	(47, 17, 1),
	(34, 50, 1),
	(23, 60, 0),
	(13, 29, 1),
	(18, 16, 1),
	(23, 91, 1),
	(46, 68, 0),
	(3, 87, 0),
	(31, 52, 0),
	(49, 23, 0),
	(50, 75, 1),
	(20, 43, 1),
	(13, 100, 0),
	(14, 6, 0),
	(19, 99, 1),
	(45, 82, 1),
	(41, 66, 1),
	(9, 39, 1),
	(18, 41, 1),
	(47, 17, 0),
	(25, 100, 1),
	(49, 57, 0),
	(41, 15, 0),
	(22, 41, 0),
	(15, 1, 1),
	(29, 96, 1),
	(2, 78, 1),
	(4, 87, 1),
	(22, 99, 1),
	(41, 7, 0),
	(6, 98, 1),
	(41, 20, 0),
	(25, 17, 0),
	(21, 54, 1),
	(48, 64, 1),
	(4, 29, 0),
	(46, 98, 1),
	(23, 66, 1),
	(35, 64, 1),
	(37, 98, 0),
	(30, 84, 0),
	(8, 24, 0),
	(12, 56, 1),
	(7, 23, 1),
	(25, 31, 1),
	(25, 46, 0),
	(49, 80, 0),
	(29, 97, 0),
	(30, 60, 1),
	(50, 37, 1),
	(42, 48, 0),
	(44, 24, 1),
	(34, 93, 1),
	(7, 44, 1),
	(34, 13, 1),
	(37, 47, 0),
	(40, 12, 0),
	(43, 76, 1),
	(41, 2, 0),
	(12, 22, 1),
	(2, 75, 1),
	(19, 18, 0),
	(31, 39, 1),
	(20, 72, 1),
	(25, 15, 0),
	(42, 34, 0),
	(33, 13, 0),
	(40, 8, 1),
	(5, 33, 1),
	(44, 28, 1),
	(29, 5, 1),
	(37, 88, 0),
	(44, 61, 0),
	(1, 57, 0),
	(39, 28, 1),
	(25, 88, 0),
	(47, 52, 0),
	(1, 42, 0),
	(26, 97, 1),
	(29, 24, 0),
	(19, 48, 1),
	(5, 60, 1),
	(45, 74, 1),
	(25, 97, 1),
	(37, 71, 0),
	(30, 18, 0),
	(7, 6, 1),
	(38, 9, 1),
	(36, 56, 1),
	(34, 17, 1),
	(19, 90, 1),
	(7, 16, 1),
	(6, 43, 1),
	(15, 22, 0),
	(1, 60, 1),
	(9, 65, 1),
	(35, 21, 1),
	(18, 62, 0),
	(1, 36, 0),
	(30, 26, 0),
	(12, 82, 0),
	(34, 30, 0),
	(18, 86, 1),
	(12, 77, 1),
	(12, 37, 0),
	(31, 12, 0),
	(6, 28, 0),
	(13, 68, 0),
	(41, 81, 1),
	(6, 87, 0),
	(21, 10, 0),
	(28, 53, 1),
	(30, 22, 0),
	(47, 24, 0),
	(22, 84, 0),
	(21, 88, 0),
	(39, 81, 1),
	(42, 15, 0),
	(25, 31, 1),
	(1, 6, 0),
	(11, 82, 1),
	(8, 64, 0),
	(50, 16, 1),
	(17, 9, 0),
	(41, 36, 1),
	(23, 18, 1),
	(32, 64, 1),
	(2, 73, 1),
	(24, 52, 1),
	(22, 12, 1),
	(17, 32, 1),
	(32, 76, 1),
	(20, 95, 0),
	(36, 33, 1),
	(18, 52, 0),
	(24, 34, 1),
	(21, 48, 0),
	(9, 65, 0),
	(7, 67, 1),
	(22, 54, 0),
	(18, 40, 0),
	(6, 11, 1),
	(29, 34, 1),
	(39, 11, 1),
	(16, 60, 0),
	(19, 11, 0),
	(31, 38, 0),
	(18, 58, 1),
	(7, 16, 0),
	(12, 85, 0),
	(32, 95, 0),
	(24, 45, 0),
	(50, 80, 0),
	(5, 66, 1),
	(27, 56, 0),
	(36, 95, 0),
	(3, 32, 1);


DECLARE @myID INT, @name VARCHAR(50)
SET @myID = 1

WHILE @myID <= 100
BEGIN
    SELECT @name = p_name FROM products WHERE id = @myID
    PRINT CONCAT(@myID, ' ', @name)
    SET @myID = @myID + 1
    PRINT @name
END


DECLARE @myID INT, @name VARCHAR(50)
SET @myID = 1

CREATE TABLE #Result (Name VARCHAR(50), Count INT)

WHILE @myID <= 10
BEGIN
    SELECT @name = p_name FROM products WHERE id = @myID

    IF EXISTS (SELECT 1 FROM #Result WHERE Name = @name)
    BEGIN
        UPDATE #Result SET Count = Count + 1 WHERE Name = @name
    END
    ELSE
    BEGIN
        INSERT INTO #Result (Name, Count) VALUES (@name, 1)
    END

    SET @myID = @myID + 1
END

SELECT Name, Count
FROM #Result

DROP TABLE #Result

------------------

DECLARE @myID INT, @name VARCHAR(50)
SET @myID = 1
WHILE @myID <= 7
BEGIN
    SELECT @name = p_name FROM products WHERE id = @myID
    PRINT CONCAT(@myID, ' ', @name)
    SET @myID = @myID + 1
    if @myID = 4
        break
    PRINT @name
END
------------
DECLARE @myID INT, @name VARCHAR(50)
SET @myID = 1

WHILE @myID <= 20
BEGIN
    IF @myID <= 2
    BEGIN
        SET @myID = @myID + 1
        CONTINUE --CONTINUE 被執行就會跳出迴圈

    END

    SELECT @name = p_name FROM products WHERE id = @myID
    PRINT CONCAT(@myID, ' ', @name)
    
    SET @myID = @myID + 1
END

-------------------------
CREATE PROCEDURE paidexe
AS
BEGIN
    SELECT paid, COUNT(*) AS countQ
    FROM orders
    GROUP BY paid
END;

EXEC paidexe;
-----------

alter proc product_department
@productID int
AS
select department from products where id = @productID

exec product_department 30;


alter proc productPrice_less_than
@pricelessthan int
AS
select p_name, department, price from products where price < @pricelessthan;

exec productPrice_less_than 800;


alter trigger inform
on users
after INSERT
as
print 'added the fuck day'

select * from users;

INSERT INTO users (first_name, last_name)
VALUES ('TY', 'Sorane');

update users set last_name = 'Sorane' where id = 3

insert into users(first_name,last_name)
values('T','Y')

select *,
case
when price > 700 then 'expensive'
when price < 300 then 'cheap'
else 'normal'
end as 'merchandise'
from products;