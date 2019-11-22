create database RESTSERVICE;
USE RESTSERVICE;

CREATE TABLE employee(
id int(10) not NULL AUTO_INCREMENT,
name varchar (150) not null, 
department varchar(150) not null,
salary double not null, 
primary key(id));

insert into employee values(1001,'Jose','Technology',40000.99);
insert into employee values(1002,'John','HR',20000.54);
insert into employee values(1003,'Jane','Delivery',80000.25);