--assigning grades based on marks
DECLARE
    marks NUMBER := 85;  -- by changing this we can test different marks
BEGIN
    CASE 
        WHEN marks >= 90 THEN
            DBMS_OUTPUT.PUT_LINE('Grade: A');
        WHEN marks >= 75 THEN
            DBMS_OUTPUT.PUT_LINE('Grade: B');
        WHEN marks >= 60 THEN
            DBMS_OUTPUT.PUT_LINE('Grade: C');
        ELSE
            DBMS_OUTPUT.PUT_LINE('Grade: F');
    END CASE;
END;
/
