use spring5;

select now() from dual;

CREATE TABLE tbl_person (
	id INT(6) PRIMARY KEY,
    person_name VARCHAR(255) NOT NULL,
    person_age INT(3)
);

SELECT * FROM tbl_person
ORDER BY id DESC;

INSERT INTO tbl_person
VALUES (888, '호호', 11);

drop table tbl_dancer;
CREATE TABLE tbl_dancer (
	id INT(8) PRIMARY KEY auto_increment,
    name VARCHAR(255),
    crew_name VARCHAR(255),
    dance_level VARCHAR(50)
);

SELECT * FROM tbl_dancer;
