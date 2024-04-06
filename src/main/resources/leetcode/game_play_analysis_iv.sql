--lets create the table
CREATE TABLE activity
(
    player_id    BIGINT    NOT NULL,
    device_id    BIGINT    NOT NULL,
    event_date   TIMESTAMP NOT NULL,
    games_player BIGINT    NOT NULL

);
--lets add some data
INSERT INTO public.activity(player_id, device_id, event_date, games_player)
VALUES (1, 2, '2016-03-01', 5);
INSERT INTO public.activity(player_id, device_id, event_date, games_player)
VALUES (1, 2, '2016-03-02', 6);
INSERT INTO public.activity(player_id, device_id, event_date, games_player)
VALUES (2, 3, '2017-06-25', 1);
INSERT INTO public.activity(player_id, device_id, event_date, games_player)
VALUES (3, 1, '2016-03-02', 0);
INSERT INTO public.activity(player_id, device_id, event_date, games_player)
VALUES (3, 1, '2016-03-03', 1);
INSERT INTO public.activity(player_id, device_id, event_date, games_player)
VALUES (3, 4, '2018-07-03', 5);
--trial of some
SELECT a.event_date::date
from activity a;


--query to find the player that logged in next day
--not working yet
select round((SELECT count(DISTINCT a.player_id)
              from activity a
                       inner join public.activity a2 on a.player_id = a2.player_id
              where (a.player_id = a2.player_id
                         and
                     (a.event_date::date - a2.event_date::date = 1 or a.event_date::date - a2.event_date::date = -1))) /
             count(distinct a0.player_id)::numeric, 2) fraction
from activity a0;





