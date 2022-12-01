create table Studentinfo(studentid varchar(6) primary key,studentname varchar(40),gender char,city varchar(20));
create table course(courseid int primary key, coursename varchar(40),noofdays int);
create table registration(registerid int primary key, studentid varchar(6) references Studentinfo(studentid),courseid int references course(courseid),fee numeric,regdate date);


insert into Studentinfo values('S101','Xavier','M','Chennai');
insert into Studentinfo values('S102','Nancy','F','Hyderabad');
insert into Studentinfo values('S103','John','M','Pune');
insert into Studentinfo values('S104','Isabelle','F','Hyderabad');
insert into Studentinfo values('S105','Rahim','M','Pune');
insert into Studentinfo values('S106','Kevin','M','Chennai');

insert into course values(906,'Advanced Python',6);
insert into course values(905,'Software Engineering',2);
insert into course values(904,'Basics of Networking',4);
insert into course values(903,'DBMS Basics',3);
insert into course values(902,'Cyber Security',5);
insert into course values(901,'Introduction to Data Science',5);

insert into registration values(801,'S102',906,1200,'2017-03-11');
insert into registration values(802,'S103',901,2500,'2017-09-20');
insert into registration values(803,'S101',902,3000,'2016-12-25');
insert into registration values(804,'S102',901,2500,'2017-08-27');
insert into registration values(805,'S103',903,1000,'2017-08-25');
insert into registration values(806,'S104',905,1000,'2017-08-16');

select * from Studentinfo;
select * from course;
select * from registration;

select studentid as id, studentname, gender from studentinfo where (studentname like '%i%' or '%I%') and city = 'Hyderabad' or city = 'Chennai' order by studentname;
select concat(courseid,'-',noofdays) as coursedetails, noofdays from course where char_length(coursename)>12 and noofdays>3;
select studentid, case when fee>2500 then 'A'
when fee>1500 and fee<=2500 then 'B'
when fee<1500 then 'C'
end as Class from registration
order by fee asc, regdate desc;

select courseid from registration where fee>=1200 and month(regdate) = 8;
select courseid from registration where fee<2500;
select studentid,
avg(fee) as avgfee from registration
 group by studentid having avg(fee)<1800 and count(courseid)>1;
 
UPDATE course 
SET noofdays = noofdays + 1 
WHERE coursename LIKE "%Security%" OR coursename LIKE "%Networking%";

DELETE student FROM Studentinfo
LEFT JOIN registration
ON Studentinfo.studentid = registration.studentid
WHERE registration.registerid IS NULL;

SELECT * FROM Studentinfo;

SELECT ROUND(562.626, 2) AS VALUE1;
SELECT CEIL(562.626) AS VALUE2;
SELECT TRUNCATE(562.626, 0) AS VALUE3;