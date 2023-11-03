--��ܹq�v�|
SELECT [name] FROM Theater;
--��ܹq�v
SELECT [name] FROM Movie;

--Example 1
--2.�x���ݢݼv��
--6.�����֤k
--12/10~12/14
SELECT Show.id,Cinema.room,show_time
  FROM SHOW
  JOIN Cinema
	ON cinema_id=Cinema.id
  JOIN Theater
    ON theater_id=Theater.id
  JOIN Movie 
    ON movie_id=Movie.id
 WHERE Theater.[name]='�x���ݢݼv��'
   AND Movie.[name]='�����֤k'
   AND show_time BETWEEN '2023-12-10' AND '2023-12-15'
 ORDER BY show_time;


 --Example 2.1
--1.�x�_�ݢݼv��
--12/10
 SELECT Show.id,Movie.[name],Cinema.room,show_time
  FROM Show
  JOIN Cinema
	ON cinema_id=Cinema.id
  JOIN Movie
	ON movie_id=Movie.id 
  JOIN Theater
    ON theater_id=Theater.id
 WHERE theater.[name]='�x�_�ݢݼv��'
   AND show_time BETWEEN '2023-12-10' AND '2023-12-11'
 ORDER BY show_time;



/*
���ռ˥�:
�q�v�|:3�y���O�t��6�U,5�U,4�U
�U:3��(7�C20��,5�C8��,16�C18��)
�q�v:20��
����:2325��(12/1~12/31)
*/


DECLARE @show_id int;
SET @show_id=2325;
--�q���d��:O���i��ܪ��y��,X�����i��ܪ��y��
EXEC showResult @show_id;
--�d�ߥ������w�Q���ʪ��y��
SELECT * FROM [Order] WHERE @show_id=show_id;

 

