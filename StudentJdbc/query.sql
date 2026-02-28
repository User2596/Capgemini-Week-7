CREATE SCHEMA testschema; 
USE testschema;

DROP TABLE student;
CREATE TABLE student (
	id INT PRIMARY KEY,
    name VARCHAR(50),
    marks DOUBLE
);

INSERT INTO student VALUES
(1, "Abc", 50),
(2, "Pqr", 60),
(3, "Xyz", 35.79);

SELECT * FROM student;