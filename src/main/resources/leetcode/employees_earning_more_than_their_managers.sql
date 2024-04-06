--first let's delete the table of the employee if exists
DROP TABLE IF EXISTS employee;
--second let's delete the sequence of the previous employee (if exists)
DROP SEQUENCE IF EXISTS employee_id_seq;
--let's create the new sequence
CREATE SEQUENCE employee_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
--let's create the new table
CREATE TABLE employee
(
    id         BIGINT NOT NULL DEFAULT nextval('employee_id_sequence'::regclass),
    name       TEXT   NOT NULL,
    salary     BIGINT NOT NULL,
    manager_id BIGINT NOT NULL,
    CONSTRAINT employee_id_pk PRIMARY KEY (id),
    CONSTRAINT employee_manager_id_fk FOREIGN KEY (manager_id) REFERENCES employee (id)
);
--Alter table to drop not null in manager id
ALTER TABLE employee
    ALTER COLUMN manager_id DROP NOT NULL;
--let's insert some data
INSERT INTO public.employee(id, name, salary)
VALUES (nextval('employee_id_sequence'::regclass), 'Joe', 70000);
INSERT INTO public.employee(id, name, salary)
VALUES (nextval('employee_id_sequence'::regclass), 'Henry', 80000);
INSERT INTO public.employee(id, name, salary)
VALUES (nextval('employee_id_sequence'::regclass), 'Sam', 60000);
INSERT INTO public.employee(id, name, salary)
VALUES (nextval('employee_id_sequence'::regclass), 'Max', 90000);
--add manager ids
UPDATE public.employee
SET manager_id=3
where id = 1;
UPDATE public.employee
SET manager_id=4
where id = 2;
--select all from the database
SELECT *
FROM public.employee;
--query to find the employees with salaries more than their managers
SELECT e.name as Employee
from employee e
         INNER JOIN public.employee e2 on e.manager_id = e2.id
WHERE e.salary > e2.salary;
