-- Write your query below

select student_id,min(exam_id) as exam_id,score from exam_results e join (
select student_id as student,max(score) as score1 from exam_results group by student_id) as a

on e.student_id = a.student AND e.score = a.score1

group by student_id,score

order by student_id;

