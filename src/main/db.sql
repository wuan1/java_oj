create database if not exists java_oj;
use java_oj;
drop table if exists oj_table;
create table oj_table(
     id int primary key auto_increment,
     title varchar(50),
     level varchar(50),
     description varchar(4096),
     template varchar(4096),
     testCode varchar(4096)
);