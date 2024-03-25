--first lets create the sequence
CREATE SEQUENCE person_id_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
-- then create the table
CREATE TABLE person
(
    id    BIGINT NOT NULL DEFAULT 'person_id_seq'::regclass,
    email TEXT   NOT NULL,
    CONSTRAINT person_id_pk PRIMARY KEY (id)
);
-- insert 1 row in person
INSERT INTO public.person(id, email)
VALUES (nextval('person_id_seq'::regclass), 'a@b.com');
--select it
SELECT *
FROM person;
--insert more
INSERT INTO public.person(id, email)
VALUES (nextval('person_id_seq'::regclass), 'c@d.com');
INSERT INTO public.person(id, email)
VALUES (nextval('person_id_seq'::regclass), 'a@b.com');
-- query to find all duplicate emails
select email
from person
group by email
having count(email) > 1;
--insert more values
INSERT INTO public.person(id, email)
VALUES (nextval('person_id_seq'::regclass), 'aa@b.com');
INSERT INTO public.person(id, email)
VALUES (nextval('person_id_seq'::regclass), 'aa@b.com');
--final result
select email "Email"
from person
group by email
having count(email) > 1;
--another solution, faster
select distinct p1.email
from person p1,
     person p2
where p1.id <> p2.id
  and p1.email = p2.email;
--another solution, the fastest
SELECT DISTINCT(p1.email)
from Person p1
         JOIN Person p2 ON
    p1.email = p2.email AND p1.id <> p2.id;
