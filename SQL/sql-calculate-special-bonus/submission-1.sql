-- Write your query below

select employee_id,
     CASE
      when employee_id % 2 = 1
      AND
      name not like 'M%'
      THEN salary
      else 0

      end as bonus from employees order by employee_id;
