show databases;
drop database crud;
show databases;
create database crud;
use crud;
show tables;
create table user(
	id int(10) primary key auto_increment,
	fname varchar(15) not null,
	lname varchar(15) not null,
	username varchar(15) not null,
	password varchar(15) not null
	);
show tables;
insert into user(fname, lname, username, password) values
	('admin', 'admin', 'admin', 'admin'),
	('user', 'user', 'user', 'user'),
	('shihab', 'sharar', 'shihab', 'shihab'),
	('shamim', 'sarker', 'shamim', 'shamim');
select * from user;

