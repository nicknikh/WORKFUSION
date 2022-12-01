DELETE student FROM student
LEFT JOIN registration
ON student.studentid = registration.studentid
WHERE registration.registerid IS NULL;

SELECT * FROM student;