CREATE PROCEDURE showResult
 @show_id int
 AS
 BEGIN
	DECLARE @row_num int,@column_num int,@i int,@j int,@str varchar(8000);
 
	 SELECT @row_num=row_num,@column_num=column_num 
	   FROM RoomType
	   JOIN Cinema 
			ON roomtype_id=RoomType.id
	   JOIN Show   
			ON cinema_id=Cinema.id
	  WHERE @show_id=Show.id;

		SET @i=1;
	  WHILE(@i<=@row_num)
	  BEGIN
		SET @str='';
		SET @j=1;
		WHILE(@j<=@column_num)
		BEGIN
			IF((SELECT id FROM [Order] WHERE @i=row_num AND @j=column_num AND @show_id=show_id) IS NOT Null)
				SET @str+='X';
			ELSE
				SET @str+='O';
			SET @j+=1;
		END
		PRINT(@str);
		SET @i+=1;
	  END
 END
GO