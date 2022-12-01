SELECT courseid FROM registration
WHERE fee >= 1200 AND MONTH(regdate)  = "08";