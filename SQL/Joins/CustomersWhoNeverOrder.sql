-- Problem Name: Customers Who Never Order
-- Topic: LEFT JOIN, IS NULL
-- Difficulty: Easy
-- LeetCode: 183

SELECT c.name AS Customers
FROM Customers AS c
LEFT JOIN Orders AS o
ON c.id = o.customerId
WHERE o.customerId IS NULL;