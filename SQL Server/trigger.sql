ALTER trigger recordTimeOfUpdate2
on post_messages
after update, insert
as
BEGIN
    DECLARE @input varchar(50)
    DECLARE @msgId int

    IF UPDATE(userInput)
    BEGIN
        SELECT @msgId = id, @input = userInput from inserted
        INSERT INTO messages_edit(msgId, userInput, changedDate)
        VALUES(@msgId, @input, GETDATE())
    END
END

CREATE TRIGGER copy_data_trigger
ON post_messages
AFTER INSERT
AS
BEGIN
    INSERT INTO messages_edit (msgId, userInput, changedDate)
    SELECT msgId, userInput, changedDate
    FROM messages_edit;
END;

