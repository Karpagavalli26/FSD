CREATE DATABASE AggregateDB;
USE AggregateDB;
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT
);
INSERT INTO employee VALUES
(1, 'Arun', 20000),
(2, 'Priya', 25000),
(3, 'Kumar', 30000),
(4, 'Divya', 35000);
SELECT COUNT(*) AS Total_Employees
FROM employee;
SELECT SUM(salary) AS Total_Salary
FROM employee;
SELECT AVG(salary) AS Average_Salary
FROM employee;
SELECT MAX(salary) AS Maximum_Salary
FROM employee;
SELECT MIN(salary) AS Minimum_Salary
FROM employee;