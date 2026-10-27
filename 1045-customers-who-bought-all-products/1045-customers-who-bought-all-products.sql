# Write your MySQL query statement below
select customer_id
from customer 
left join product
on customer.product_key = product.product_key
group by customer_id
having COUNT(DISTINCT customer.product_key) = (select COUNT(*) from product);