--選擇電影院
SELECT [name] FROM Theater;
--選擇電影
SELECT [name] FROM Movie;

--Example 1
--2.台中ＯＯ影城
--6.神隱少女
--12/10~12/14
SELECT Show.id,Cinema.room,show_time
  FROM SHOW
  JOIN Cinema
	ON cinema_id=Cinema.id
  JOIN Theater
    ON theater_id=Theater.id
  JOIN Movie 
    ON movie_id=Movie.id
 WHERE Theater.[name]='台中ＯＯ影城'
   AND Movie.[name]='神隱少女'
   AND show_time BETWEEN '2023-12-10' AND '2023-12-15'
 ORDER BY show_time;


 --Example 2.1
--1.台北ＯＯ影城
--12/10
 SELECT Show.id,Movie.[name],Cinema.room,show_time
  FROM Show
  JOIN Cinema
	ON cinema_id=Cinema.id
  JOIN Movie
	ON movie_id=Movie.id 
  JOIN Theater
    ON theater_id=Theater.id
 WHERE theater.[name]='台北ＯＯ影城'
   AND show_time BETWEEN '2023-12-10' AND '2023-12-11'
 ORDER BY show_time;



/*
測試樣本:
電影院:3座分別含有6廳,5廳,4廳
廳:3種(7列20排,5列8排,16列18排)
電影:20部
場次:2325場(12/1~12/31)
*/


DECLARE @show_id int;
SET @show_id=2325;
--訂票查詢:O為可選擇的座位,X為不可選擇的座位
EXEC showResult @show_id;
--查詢本場次已被選購的座位
SELECT * FROM [Order] WHERE @show_id=show_id;

 

