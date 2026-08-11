-- Problem Name: Customer Who Visited but Did Not Make Any Transactions
-- Topic: LEFT JOIN, WHERE, COUNT, GROUP BY
-- Difficulty: Easy
-- LeetCode: 1581

SELECT v.customer_id, COUNT(v.customer_id) AS count_no_trans
FROM Visits AS v
LEFT JOIN Transactions AS t
ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL
GROUP BY v.customer_id;