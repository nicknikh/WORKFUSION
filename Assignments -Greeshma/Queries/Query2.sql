SELECT CONCAT(courseid, " - ",coursename) AS COURSEDETAILS FROM course
WHERE LENGTH(coursename) > 12 AND noofdays > 3;