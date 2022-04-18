REM   Script: Activity5
REM   Activity5 - UPDATE  the table salesman

SELECT * FROM salesman;

CREATE TABLE salesman ( 
	salesman_id int, 
	salesman_name varchar2(32), 
	salesman_city varchar2(32), 
    	commission int 
);

INSERT ALL  
	INTO salesman VALUES(5001,'James Hoog','New York',15) 
	INTO salesman VALUES(5002,'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005,'Pit Alex','London',11) 
	INTO salesman VALUES(5006,'McLyon','Paris',14) 
	INTO salesman VALUES(5007,'Paul Adam','Rome',13) 
	INTO salesman VALUES(5003,'Lauson Hen','San Jose',12) 
SELECT 1 FROM DUAL;

ALTER TABLE salesman  ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

SELECT * FROM salesman WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

SELECT * FROM salesman WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman WHERE salesman_name='Pierre';

