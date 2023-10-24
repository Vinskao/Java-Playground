use ig_app;
--1
select top 5 *
from users
order by created_at;
--2
select top 1 with ties datename(weekday,created_at) as Weekday, count(*) as count
from users
group by datename(weekday,created_at)
order by count desc;

SELECT DISTINCT
    datename(weekday, created_at) AS Weekday,
    COUNT(*) OVER (PARTITION BY datename(weekday, created_at)) AS count
FROM users

--怎麼用window f
select week from
(select datename(WEEKDAY,created_at) as week,
		rank() over(order by count(*) desc) as r 
from users
group by datename(WEEKDAY,created_at)) as temp_table
where r=1;

--3
select users.id,username
from photos
right join users on users.id = photos.user_id
where photos.user_id is null
order by users.id;

--4
--如何把人名加上？
select photo_id
from likes
group by photo_id
having count(photo_id) =(
    select max(likecount) 
    from (select photo_id, count(photo_id) likecount 
            from likes
            group by photo_id) as Allcounts
)

select top 1 photo_id
from likes
where photo_id =(
    select top 1 photo_id
    from likes 
    group by photo_id
    order by count(*) desc
)

select photos.id, username
from photos
join users
on photos.user_id = users.id
where photos.id = 
(select top(1) photo_id from likes
group by photo_id
order by count(*) desc)


select photos.id as photo_id, username
from photos
join users
on photos.user_id = users.id
where photos.id = (
select top(1) photo_id from likes
group by photo_id
order by count(*) desc)
--可以直接order by count 不用select count
select top(20) photo_id from likes
group by photo_id
order by count(*) desc
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

SELECT top 10 with ties pt.tag_id, COUNT(pt.tag_id) AS count, tags.tag_name
FROM photo_tags AS pt
JOIN tags ON pt.tag_id = tags.id
GROUP BY pt.tag_id, tags.tag_name
ORDER BY count(pt.tag_id) desc;


-7
select user_id, count(user_id) likeCount from likes
group by user_id
having count(user_id) = 257
order by count(user_id);


select * from photos 
select * from likes order by photo_id desc



