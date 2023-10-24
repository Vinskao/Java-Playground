use testTrigger;
create table account(
    id int primary key not null IDENTITY(1,1),
    username varchar(50) not null,
    pwd varchar(50) not null
)

create table user_accountlog(
    userId int not null,
    userPwd varchar(50) not null,
    changeDate datetime not null
)

create trigger userPwdUpdate
on account
after update
as
BEGIN
    if update(pwd)
        BEGIN
            declare @userID int
            declare @userPwd varchar(50)
            select @userID = id, @userPwd = pwd from deleted --从 deleted 伪表中获取数据
            insert into user_accountlog(userId, userPwd, changeDate)
            values(@userID, @userPwd, getDate())
        END
END

insert into account(username,pwd)
values ('Sorane', '123')

update account set pwd = '321' where id = 1

select * from user_accountlog;

select * from account;


-- 紀錄修改訊息
create table post_messages(
 id int primary key not null identity(1,1),
 userInput varchar(50) not null,
 first_date datetime not null default getDate()
)

create table messages_edit(
 msgId int not null,
 userInput varchar(50) not null,
 changedDate datetime not null
)

create trigger recordTimeOfUpdate2
on post_messages
after update, insert
as
BEGIN
    IF UPDATE(userInput)
        BEGIN
            declare @input varchar(50)
            declare @msgId int
            select @msgId = id, @input = userInput from inserted
            insert into messages_edit(msgId, userInput, changedDate)
            values(@msgId, @input, getDate())
        END
END

insert into post_messages(id, userInput, first_date)
values ()

update messages_edit set userInput = 'bibibi' where msgId = 1;

select * from messages_edit;

select * from post_messages;

