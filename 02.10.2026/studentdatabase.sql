CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);
SHOW TABLES;
DESC student;
INSERT INTO student VALUES
(1, 'Arun', 20),
(2, 'Priya', 21),
(3, 'Kumar', 22);
SELECT * FROM student;