CREATE TABLE course (
    code VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255),
    subject VARCHAR(255),
    num VARCHAR(63),
    credits INT,
    prof VARCHAR(255),
    genEd VARCHAR(255),
    repeat VARCHAR(255),
    quarters VARCHAR(255),
    preqs VARCHAR(255),
    preqstr VARCHAR(1023)
);
