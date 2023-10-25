drop SEQUENCE mySeq

create SEQUENCE mySeq
AS INT
START WITH 1
INCREMENT BY -1
MINVALUE -100
MAXVALUE 10000;

create table companyBooks(
    id int not null,
    bookTitle NVARCHAR(50),
    create_date datetime not null default getDate()
)

create table homeBooks(
    id int not null,
    bookTitle NVARCHAR(50),
    create_date datetime not null default getDate()
)

insert into companyBooks(id, bookTitle)
values(next value for mySeq, 'book1')
insert into homeBooks(id, bookTitle)
values(next value for mySeq, 'book2')
insert into homeBooks(id, bookTitle)
values(next value for mySeq, 'book3')
insert into companyBooks(id, bookTitle)
values(next value for mySeq, 'book4')

select * from homeBooks
select * from companyBooks

select next value for mySeq
select current_value from sys.sequences where name = 'mySeq'
