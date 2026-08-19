-- Problem Name: Game Play Analysis I
-- Topic: GROUP BY, MIN(), Aggregate Functions
-- Difficulty: Easy
-- LeetCode: 511

SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;