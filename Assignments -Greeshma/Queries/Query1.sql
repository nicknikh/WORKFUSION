SELECT substr(studentid, 2) AS ID, studentname, gender FROM student
WHERE studentname LIKE "%i%" AND (city IN ("Hyderabad", "Chennai"))
ORDER BY studentname;


-- i have to change the code want only the numeric part in the student id