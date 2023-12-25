127.0.0.1/willow/persons/		http://localhost/phpmyadmin/index.php?route=/database/sql&db=willow

   MySQL returned an empty result set (i.e. zero rows). (Query took 0.0002 seconds.)



   Showing rows 0 -  2 (3 total, Query took 0.0002 seconds.)


USE willow;


SELECT SUBSTR(empname,2,2) AS substrings FROM persons;


substrings	
hi	
ag	
av	
