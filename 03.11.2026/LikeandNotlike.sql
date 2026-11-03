CREATE DATABASE LikeDB;
USE LikeDB;
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    salary INT
);
INSERT INTO employee VALUES
(1, 'Arun', 22, 20000),
(2, 'Priya', 25, 25000),
(3, 'Kumar', 28, 30000),
(4, 'Divya', 30, 35000),
(5, 'Ravi', 24, 22000);
-- LIKE OPERATIONS

SELECT * FROM employee WHERE name LIKE 'A%';
SELECT * FROM employee WHERE name LIKE '%a';
SELECT * FROM employee WHERE name LIKE '%u%';
SELECT * FROM employee WHERE name LIKE '____';
SELECT * FROM employee WHERE name LIKE 'P%';

-- NOT LIKE OPERATIONS

SELECT * FROM employee WHERE name NOT LIKE 'A%';
SELECT * FROM employee WHERE name NOT LIKE '%a';
SELECT * FROM employee WHERE name NOT LIKE '%u%';
SELECT * FROM employee WHERE name NOT LIKE '____';
SELECT * FROM employee WHERE name NOT LIKE 'P%';