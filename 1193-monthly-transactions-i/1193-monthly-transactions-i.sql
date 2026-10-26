-- # Write your MySQL query statement below
-- select DATE_FORMAT(t1.trans_date, '%Y-%m') as month, t1.country, COUNT(t1.trans_date) as trans_count, COUNT(t2.state) as approved_count, SUM(t1.amount) as  trans_total_amount
-- from Transactions as t1
-- left join (SELECT * from Transactions where state = "approved" group by trans_date) as t2
-- on t1.id = t2.id
-- group by t1.trans_date;
-- SELECT *, MONTH(trans_date) AS transaction_month, COUNT(*) AS total_transactions, SUM(amount) AS total_amount
SELECT 
DATE_FORMAT(trans_date, '%Y-%m') as month,
country, 
COUNT(id) as trans_count, 
SUM(IF(state = 'approved', 1, 0)) AS approved_count,
SUM(amount) as trans_total_amount,
SUM(IF(state = 'approved', amount, 0)) AS approved_total_amount
from Transactions 
group by DATE_FORMAT(trans_date, '%Y-%m'), country