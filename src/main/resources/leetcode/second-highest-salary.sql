-- first create the sequence
CREATE SEQUENCE employee_id_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 9223372036854775807
    MINVALUE 1
    CACHE 1;
-- then create the table
CREATE TABLE employee
(
    id     bigint NOT NULL DEFAULT nextval('employee_id_seq'::regclass),
    salary bigint NOT NULL,
    constraint employee_pkey primary key (id)
);
-- then insert some values
INSERT INTO employee (id, salary)
VALUES (nextval('employee_id_seq'::regclass), 100);
-- retrieve the value to make sure it was inserted
SELECT *
FROM employee;
-- now insert multiple values
INSERT INTO employee (id, salary)
VALUES (nextval('employee_id_seq'::regclass), 200),
       (nextval('employee_id_seq'::regclass), 300);
-- retrieve the values to make sure they were inserted
SELECT *
FROM employee;
-- now insert multiple values (a lot !!!!)
INSERT INTO employee (id, salary)
SELECT nextval('employee_id_seq'::regclass), generate_series(400, 1000);
-- retrieve the values to make sure they were inserted
SELECT *
FROM employee;
-- now lets find the second highest salary
-- lets try with different cases
-- case 1: found (trivial case) -> passes
SELECT coalesce((SELECT e.salary
                 from employee e
                 order by e.salary desc
                 limit 1 offset 1), null) "SecondHighestSalary";
-- case 2: when there is only 1 number in the database -> passes
with test_case as (select *
                   from employee e
                   where e.salary = 100)
SELECT coalesce((SELECT e.salary
                 from test_case e
                 order by e.salary desc
                 limit 1 offset 1), null) "SecondHighestSalary";
-- case 3: there are only 2 rows with the same value -> fails, added 'distinct to pass'
INSERT INTO public.employee (id, salary)
VALUES (nextval('employee_id_seq'::regclass), 100);
with test_case as (select *
                   from employee e
                   where e.salary = 100)
SELECT coalesce((SELECT distinct e.salary
                 from test_case e
                 order by e.salary desc
                 limit 1 offset 1), null) "SecondHighestSalary";
--final solution:
SELECT coalesce((SELECT distinct e.salary
                 from employee e
                 order by e.salary desc
                 limit 1 offset 1), null) "SecondHighestSalary";
-- enhancement
SELECT (SELECT distinct e.salary
        from employee e
        order by e.salary desc
        limit 1 offset 1) "SecondHighestSalary";

