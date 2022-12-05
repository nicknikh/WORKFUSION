create database HariDB;
use HariDB;
create table student(studentid varchar(6) primary key,studentname varchar(40),gender char(1),city varchar(20));
create table course(courseid integer primary key,coursename varchar(40),noofdays integer);
create table registration(registerid integer,studentid varchar(6) references student(studentid),courseid integer references course(courseid),fee integer,regdate date);
insert into student values('S101','Xavier','M','Chennai');
insert into student values('S102','Nancy','F','Hyderabad');
insert into student values('S103','John','M','Pune');
insert into student values('S104','Isabelle','F','Hyderabad');
insert into student values('S105','Rahim','M','Pune');
insert into student values('S106','Kevin','M','Chennai');
delete from student where studentid='S106';
insert into student values('S106','Kevin','M','Chennai');
select * from student;
insert into course values(906,'Advanced Python',6);
insert into course values(905,'Software Engineering',2);
insert into course values(904,'Basics of Networking',4);
insert into course values(903,'DBMS Basics',3);
insert into course values(902,'Cyber Security',5);
insert into course values(901,'Introduction to Data Science',5);
insert into registration values(801,'S102',906,1200,'2017-08-11');
insert into registration values(802,'S103',901,2500,'2017-08-14');
insert into registration values(803,'S101',902,3000,'2017-06-18');
insert into registration values(804,'S102',901,2500,'2017-08-21');
insert into registration values(805,'S103',903,1000,'2017-06-04');
insert into registration values(806,'S104',905,1000,'2017-08-16');
select * from student;
select * from course;
select * from registration;
use HariDB;
select substr(studentid,2) as studentid,studentname,gender from student where (city = 'Hyderabad' or city ='Chennai') and (locate('i',studentname) or locate('I',studentname)) order by studentname;
select CONCAT(courseid,"-",coursename) as COURSEDETAILS from course where (length(coursename)>12 and noofdays>3);
select studentid,case when fee >= 2500 then 'Class A'
					when fee >=1500 and fee < 2500 then 'Class B'
                    when fee < 1500 then 'Class C'
				end as CLASS
 from registration order by studentid;
 
 select month(regdate) from registration;
select courseid from registration where month(regdate)=8 group by courseid having sum(fee)>1200;
select courseid from registration group by courseid having avg(fee)<2500;
select concat(studentid," ",avg(fee)) as  AVGFEE from registration group by studentid having avg(fee)<1800 and count(studentid)>1;
update course set noofdays=noofdays+1 where coursename='Basics of Networking' or coursename='Cyber Security';
-- select studentid from student group by courseid having count(courseid)=0;

select su.studentid,su.studentname,su.gender,su.city from student as su left join registration on su.studentid = registration.studentid where registration.registerid is NULL;
SELECT ROUND(562.626, 2);
select ceil(562.626);
SELECT TRUNCATE(562.626, 0) as VALUE3;