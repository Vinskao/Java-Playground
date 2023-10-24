use ig_app;
--1
select top 5 *
from users
order by created_at;
--2
select top 2 datename(weekday,created_at) as Weekday, count(*) as count
from users
group by datename(weekday,created_at)
order by count desc;

--3
select users.id
from photos
right join users on users.id = photos.user_id
where photos.user_id is null
order by users.id;

--4
select photo_id, count(photo_id) count 
from likes
group by photo_id
having count(photo_id) =(
    select max(likecount) 
    from (select photo_id, count(photo_id) likecount 
            from likes
            group by photo_id) as Allcounts
);

--5

create procedure most_popular_photo
as
BEGIN
    select photo_id, count(photo_id) count 
    from likes
    group by photo_id
    having count(photo_id) =(
        select max(likecount) 
        from (select photo_id, count(photo_id) likecount 
                from likes
                group by photo_id) as Allcounts
    )
END

exec most_popular_photo

-6

SELECT top 10 pt.tag_id, COUNT(pt.tag_id) AS count, tags.tag_name
FROM photo_tags AS pt
JOIN tags ON pt.tag_id = tags.id
GROUP BY pt.tag_id, tags.tag_name
ORDER BY count(pt.tag_id) desc;


-7
select user_id, count(user_id) likeCount from likes
group by user_id
having count(user_id) = 257;
order by count(user_id);



