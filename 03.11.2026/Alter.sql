CREATE DATABASE AlterDB;
USE AlterDB;

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

ALTER TABLE employee
ADD email VARCHAR(100);

ALTER TABLE employee
MODIFY name VARCHAR(100);

ALTER TABLE employee
RENAME COLUMN age TO employee_age;

ALTER TABLE employee
DROP COLUMN email;

ALTER TABLE employee
RENAME TO staff;