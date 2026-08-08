-- Write your query below

select u.name,
    case
     when r.total is null then 0
     else r.total
     end as travelled_distance from users u left join

       (select user_id,sum(distance) as total from rides group by user_id) r 
       on u.id = r.user_id order by travelled_distance desc, name asc;
