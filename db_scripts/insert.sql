
INSERT INTO users (email, login, password, role) values ('wmilczarek@future-processing.com', 'test', 'test', 'masterAdmin');
INSERT INTO users(
            id, email, login, password, role)
    VALUES ( 1 ,'test@test.pl', 'test', 'test', 'user');

INSERT INTO shouts (is_active, date_time, shout_comment) values ( TRUE, clock_timestamp(), 'comment 1');
INSERT INTO shouts (is_active, date_time, shout_comment) values ( TRUE, clock_timestamp(), 'comment 2');
INSERT INTO shouts (is_active, date_time, shout_comment) values ( TRUE, date '2001-09-28' + time '03:00', 'old one active 3');
INSERT INTO shouts (is_active, date_time, shout_comment) values ( FALSE , clock_timestamp(), 'comment inactive 4');
INSERT INTO shouts (is_active, date_time, shout_comment) values ( FALSE, date '2001-09-28' + time '07:00', 'old one inactive');

commit;

