CREATE TABLE Departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

INSERT INTO Departments VALUES
(101, 'HR'),
(102, 'IT'),
(103, 'Finance'),
(104, 'Marketing'),
(105, 'Sales'),
(106, 'Support');

CREATE TABLE Employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary INT,
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Departments(dept_id)
);

INSERT INTO Employees VALUES
(1, 'Arun', 35000, 101),
(2, 'Bala', 45000, 102),
(3, 'Charan', 30000, 102),
(4, 'Divya', 50000, 103),
(5, 'Ezhil', 40000, 101),
(6, 'Gokul', 55000, 106),
(7, 'Hari', 32000, NULL);

CREATE TABLE Employee_Manager (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    manager_id INT
);

INSERT INTO Employee_Manager VALUES
(1, 'Arun', NULL),
(2, 'Bala', 1),
(3, 'Charan', 1),
(4, 'Divya', 2),
(5, 'Ezhil', 2),
(6, 'Gokul', 3),
(7, 'Hari', 3);

CREATE TABLE Projects (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(100)
);

INSERT INTO Projects VALUES
(201, 'Banking App'),
(202, 'E-Commerce'),
(203, 'Student Portal');

CREATE TABLE Employee_Projects (
    emp_id INT,
    project_id INT,
    PRIMARY KEY (emp_id, project_id),
    FOREIGN KEY (emp_id) REFERENCES Employees(emp_id),
    FOREIGN KEY (project_id) REFERENCES Projects(project_id)
);

INSERT INTO Employee_Projects VALUES
(1, 201),
(2, 202),
(3, 203),
(4, 201),
(5, 202);

-- INNER JOIN--
SELECT 
    e.emp_id,
    e.emp_name,
    e.salary,
    d.dept_name
FROM Employees e
INNER JOIN Departments d
ON e.dept_id = d.dept_id;

-- LEFT JOIN--
SELECT 
    e.emp_id,
    e.emp_name,
    e.salary,
    d.dept_name
FROM Employees e
LEFT JOIN Departments d
ON e.dept_id = d.dept_id;

-- RIGHT JOIN--
SELECT 
    d.dept_id,
    d.dept_name,
    e.emp_id,
    e.emp_name,
    e.salary
FROM Employees e
RIGHT JOIN Departments d
ON e.dept_id = d.dept_id;