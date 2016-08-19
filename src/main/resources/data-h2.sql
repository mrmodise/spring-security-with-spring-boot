-- add sample test users
insert into users values (30, 'admin@gmail.com', 'test','modise', '$2a$10$b/BDoXdv8oRdtYY8rU/A7.3NPmVQeGWsSSulPnF0lxTyg6G2VO47S');
insert into users values (1, 'nonadmin@gmail.com', 'test','modise', '$2a$10$lDB0aH2lyZznSi8JogjPqOP.ycqvnCJtaXFbK2Mzeg8HZMZmKbG6q');


-- define roles ADMIN and USER
insert into roles values (3, 'ROLE_USER');
insert into roles values (2, 'ROLE_ADMIN');

-- link users to their respective roles
insert into user_roles values (30, 2);
insert into user_roles values (1, 3);