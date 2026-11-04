CREATE DATABASE ConstraintDB;
USE ConstraintDB;
CREATE TABLE Department (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(50) NOT NULL
);
INSERT INTO Department VALUES
(101, 'Computer Science'),
(102, 'Commerce'),
(103, 'Mathematics');
SELECT * FROM Department;
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL,
    Email VARCHAR(100) UNIQUE,
    Age INT CHECK (Age >= 18),
    City VARCHAR(50) DEFAULT 'Erode',
    DeptID INT,
    FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);
INSERT INTO Student VALUES
(1, 'Arun', 'arun@gmail.com', 20, 'Erode', 101),
(2, 'Priya', 'priya@gmail.com', 21, 'Chennai', 102),
(3, 'Kumar', 'kumar@gmail.com', 22, DEFAULT, 103),
(4, 'Divya', 'divya@gmail.com', 19, 'Coimbatore', 101),
(5, 'Ravi', 'ravi@gmail.com', 23, DEFAULT, 102);
SELECT * FROM Student;
INSERT INTO Student VALUES (1, 'Ram', 'ram@gmail.com', 20, 'Erode', 101);
INSERT INTO Student (StudentID, Name) VALUES (6, NULL);
INSERT INTO Student VALUES (6, 'Sam', 'arun@gmail.com', 20, 'Erode', 101);
INSERT INTO Student VALUES (6, 'Sam', 'sam@gmail.com', 15, 'Erode', 101);
INSERT INTO Student (StudentID, Name, Email, Age, DeptID)
VALUES (6, 'Sam', 'sam@gmail.com', 20, 101);