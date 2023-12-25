127.0.0.1/willow/persons/		http://localhost/phpmyadmin/index.php?route=/database/sql&db=willow

   MySQL returned an empty result set (i.e. zero rows). (Query took 0.0004 seconds.)



   3 rows inserted. (Query took 0.0080 seconds.)



   Showing rows 0 -  5 (6 total, Query took 0.0004 seconds.)


USE willow;


INSERT INTO persons VALUES(103,'Rohit Sharma'),(104,'Rishab Pant'),(105,'Maxwell');


SELECT SUBSTR(empname,5,6) AS substrings FROM persons;


substrings	
nash K	
l Gupt	
ndra J	
t Shar	
ab Pan	
ell	
