REM   Script: Activity2
REM   Activity2 - inserted data into salesman

INSERT INTO salesman 
	VALUES(5001,"James Hoog","New York",15), 
	VALUES(5002,"Nail Knite","Paris",13), 
	VALUES(5005,"Pit Alex","London",11), 
	VALUES(5006,"McLyon","Paris",14), 
	VALUES(5007,"Paul Adam","Rome",13), 
	VALUES(5003,"Lauson Hen","San Jose",12);

INSERT INTO salesman 
	(VALUES(5001,"James Hoog","New York",15), 
	VALUES(5002,"Nail Knite","Paris",13), 
	VALUES(5005,"Pit Alex","London",11), 
	VALUES(5006,"McLyon","Paris",14), 
	VALUES(5007,"Paul Adam","Rome",13), 
	VALUES(5003,"Lauson Hen","San Jose",12));

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15, 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
	INTO saleasman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15) 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
	INTO saleasman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15) 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
	INTO saleasman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15) 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
	INTO saleasman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15) 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
	INTO saleasman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15) 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO salesman VALUES(5001,"James Hoog","New York",15) 
	INTO salesman VALUES(5002,"Nail Knite","Paris",13) 
	INTO salesman VALUES(5005,"Pit Alex","London",11) 
	INTO salesman VALUES(5006,"McLyon","Paris",14) 
	INTO salesman VALUES(5007,"Paul Adam","Rome",13) 
	INTO salesman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO salesman VALUES(5001,"James Hoog","New York",15) 
	INTO salesman VALUES(5002,"Nail Knite","Paris",13) 
	INTO salesman VALUES(5005,"Pit Alex","London",11) 
	INTO salesman VALUES(5006,"McLyon","Paris",14) 
	INTO salesman VALUES(5007,"Paul Adam","Rome",13) 
	INTO salesman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

DESC salesman


CREATE TABLE salesman ( 
	salesman_id int, 
	salesman_name varchar2(32), 
	salesman_city varchar2(32), 
    	commission int 
);

INSERT ALL  
	INTO saleasman VALUES(5001,"James Hoog","New York",15) 
	INTO saleasman VALUES(5002,"Nail Knite","Paris",13) 
	INTO saleasman VALUES(5005,"Pit Alex","London",11) 
	INTO saleasman VALUES(5006,"McLyon","Paris",14) 
	INTO saleasman VALUES(5007,"Paul Adam","Rome",13) 
	INTO saleasman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
	salesman_id int, 
	salesman_name varchar2(32), 
	salesman_city varchar2(32), 
    	commission int 
);

INSERT ALL  
	INTO salesman VALUES(5001,"James Hoog","New York",15) 
	INTO salesman VALUES(5002,"Nail Knite","Paris",13) 
	INTO salesman VALUES(5005,"Pit Alex","London",11) 
	INTO salesman VALUES(5006,"McLyon","Paris",14) 
	INTO salesman VALUES(5007,"Paul Adam","Rome",13) 
	INTO salesman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO salesman VALUES(5001,"James Hoog","New York",15) 
	INTO salesman VALUES(5002,"Nail Knite","Paris",13) 
	INTO salesman VALUES(5005,"Pit Alex","London",11) 
	INTO salesman VALUES(5006,"McLyon","Paris",14) 
	INTO salesman VALUES(5007,"Paul Adam","Rome",13) 
	INTO salesman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

DESC salesman


INSERT ALL  
	INTO salesman VALUES(5001,"James Hoog","New York",15) 
	INTO salesman VALUES(5002,"Nail Knite","Paris",13) 
	INTO salesman VALUES(5005,"Pit Alex","London",11) 
	INTO salesman VALUES(5006,"McLyon","Paris",14) 
	INTO salesman VALUES(5007,"Paul Adam","Rome",13) 
	INTO salesman VALUES(5003,"Lauson Hen","San Jose",12) 
SELECT 1 FROM DUAL;

INSERT ALL  
	INTO salesman VALUES(5001,'James Hoog','New York',15) 
	INTO salesman VALUES(5002,'Nail Knite','Paris',13) 
	INTO salesman VALUES(5005,'Pit Alex','London',11) 
	INTO salesman VALUES(5006,'McLyon','Paris',14) 
	INTO salesman VALUES(5007,'Paul Adam','Rome',13) 
	INTO salesman VALUES(5003,'Lauson Hen','San Jose',12) 
SELECT 1 FROM DUAL;

