-- Problem Name: Delete Duplicate Emails
-- Topic: DELETE, Self JOIN
-- Difficulty: Easy
-- LeetCode: 196

DELETE p2
FROM Person AS p1
JOIN Person AS p2
ON p1.email = p2.email
AND p1.id < p2.id;