SELECT CONCAT(studentid, " - ", 
CASE WHEN fee > 2500 THEN "CLASS A" 
	WHEN fee BETWEEN 1500 AND 2500 THEN "CLASS B"
    ELSE "CLASS C"
    END) AS CLASS
    FROM registration
    ORDER BY fee, regdate DESC;