SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[lunch](
	[Date] [nvarchar](20) NOT NULL,
	[Shop] [nvarchar](20) NOT NULL,
	[Meal] [nvarchar](50) NOT NULL,
	[Price] [int] NULL,
	[Comment] [nvarchar](200) NULL
) ON [PRIMARY]
GO

INSERT INTO [dbo].[lunch] ([Date], [Shop], [Meal], [Price], [Comment])
VALUES 
('Oct 2, 2023', 'Bento', 'Kung Pao Chicken', 80, 'Spicy'),
('Oct 3, 2023', 'Home-made', 'Chicken Healthy Option', 100, 'Healthy'),
('Oct 4, 2023', 'Home-made', 'Potato Pie and Rice', 100, 'Asian and Mediterranean Fusion Flavor'),
('Oct 5, 2023', 'Home-made', 'Beef in Thick Gravy with Spinach and Rice', 100, 'Yummy'),
('Oct 6, 2023', 'Happy Dumpling', 'Dry Noodles with Everything', 120, 'Small Portion of Spicy Sichuan Minced Meat Dry Noodles, Upgraded Version of "8 way" Noodles'),
('Oct 11, 2023', 'Home-made', 'Kung Fu Beef', 100, 'Not OK'),
('Oct 12, 2023', 'Home-made', 'Dumpling lovers', 60, 'Pork is good'),
('Oct 13, 2023', 'Home-made', 'Sailer Made Spagetti', 100, 'Not Italian'),
('Oct 16, 2023', 'Home-made', 'Rice and Veges', 100, 'Normal'),
('Oct 17, 2023', 'Home-made', 'Kung Pao Chicken', 100, 'Spicy'),
('Oct 18, 2023', 'Home-made', 'Kung Pao Chicken', 100, 'Spicy'),
('Oct 19, 2023', 'Home-made', 'Rice and Veges', 100, 'Flavored'),
('Oct 20, 2023', 'Home-made', 'Kung Pao Chicken', 100, 'Spicy');