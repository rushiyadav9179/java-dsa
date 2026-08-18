-- Problem Name: Employee Bonus
-- Topic: LEFT JOIN, WHERE, NULL
-- Difficulty: Easy
-- LeetCode: 577

SELECT e.name, b.bonus
FROM Employee AS e
LEFT JOIN Bonus AS b
ON e.empId = b.empId
WHERE b.bonus < 1000
   OR b.bonus IS NULL;