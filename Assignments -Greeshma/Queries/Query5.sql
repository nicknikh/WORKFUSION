SELECT courseid FROM registration
GROUP BY courseid
HAVING AVG(fee) < 2500;

-- have doubts in the question DONE BUT CROSS CHECK