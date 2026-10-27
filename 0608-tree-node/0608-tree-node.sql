# Write your MySQL query statement below
select id,
CASE 
WHEN p_id IS NULL THEN 'Root'
WHEN id IN (SELECT p_id from tree) THEN 'Inner'
ELSE 'Leaf' 
END AS type
FROM tree;