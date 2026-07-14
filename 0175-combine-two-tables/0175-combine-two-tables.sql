# Write your MySQL query statement below
select pt.firstName, pt.lastName, at.city, at.state
from person as pt left join address as at
on pt.personId = at.personId;