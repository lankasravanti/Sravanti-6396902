-- This program prints a countdown from 5 using a simple LOOP and EXIT
DECLARE
    i NUMBER := 5;
BEGIN
    LOOP
        EXIT WHEN i = 0;
        DBMS_OUTPUT.PUT_LINE('Countdown: ' || i);
        i := i - 1;
    END LOOP;
END;
/
