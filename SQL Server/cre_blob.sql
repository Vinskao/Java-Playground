DROP TABLE blobtest;

CREATE TABLE blobtest (
	name		varchar(30)		PRIMARY KEY, 
	photo		varbinary(max)	NOT NULL
);

