SELECT CONCAT(studentid, " - ", AVG(fee)) AS AVGFEE FROM registration
GROUP BY studentid
HAVING AVG(fee) < 1800 AND COUNT(studentid) > 1;