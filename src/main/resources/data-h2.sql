insert into users values (30, 'test@gmail.com', 'test','modise', 'test123');
insert into roles values (3, 'ROLE_USER');
insert into roles values (2, 'ROLE_ADMIN');
insert into user_roles values (30, 3);
insert into user_roles values (30, 2);