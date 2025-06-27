-- calculating the factorial of a number using a WHILE loop
--here factorial of 5 is calculated
DECLARE
    num NUMBER := 5; 
    fact NUMBER := 1;
    i NUMBER := 1;
BEGIN
    WHILE i <= num LOOP
        fact := fact * i;
        i := i + 1;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Factorial: ' || fact);
END;
/
