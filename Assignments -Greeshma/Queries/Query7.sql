UPDATE course 
SET noofdays = noofdays + 1 
WHERE coursename LIKE "%Security%" OR coursename LIKE "%Networking%";