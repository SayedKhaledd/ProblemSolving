--make sure the employee table is created, if not, run the queries in
-- the 'second-highest-salary.sql' to create the table, sequence, and insert values
DROP FUNCTION nthhighestsalary(INT);

CREATE OR REPLACE FUNCTION NthHighestSalary(N INT)
    RETURNS TABLE
            (
                Salary bigint
            )
AS
$$
BEGIN
    IF N < 1 THEN
        RETURN QUERY SELECT NULL::bigint AS Salary;
    ELSE
        RETURN
            QUERY (SELECT (SELECT distinct e.salary
                           from employee e
                           order by e.salary desc
                           limit 1 offset n - 1) "SecondHighestSalary");
    END IF;
END;
$$ LANGUAGE plpgsql;
-- test cases
-- case 1
select *
from NthHighestSalary(1);
-- case 2
select *
from NthHighestSalary(12);
-- case 3
select *
from NthHighestSalary(-1);