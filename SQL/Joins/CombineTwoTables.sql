-- Problem Name: Combine Two Tables
-- Topic: LEFT JOIN
-- Difficulty: Easy
-- LeetCode: 175

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person AS p
LEFT JOIN Address AS a
ON p.personId = a.personId;