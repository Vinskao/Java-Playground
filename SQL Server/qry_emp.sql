IF OBJECT_ID ( 'qry_emp', 'P' ) IS NOT NULL 
    DROP PROCEDURE qry_emp;
GO
CREATE PROCEDURE qry_emp (
	@empno		decimal(4),
	@ename		varchar(30)		OUT,
	@salary		int				OUT
) AS
BEGIN
	SELECT @ename = ename, @salary = salary FROM employee WHERE empno = @empno
END
GO
