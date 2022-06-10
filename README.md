# SpringRememberOption
Spring Security is providing two approaches for implementing remember-me -

Hash-Based Token Approach and  Persistent Token Approach.

In our example, we are taking Persistent Token Approach in which a a database or other persistent storage mechanism is used
MySQL Scripts
use geeksforgeeks;  -- Use the appropriate database
-- users
create table users(
	username varchar(50) not null primary key,
	password varchar(100) not null,
	enabled boolean not null
);
-- authorities 
create table authorities(
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on geekAuthorities (username,authority);


create table persistent_logins(
	username varchar(50) not null,
	series varchar(64) primary key,
	token varchar(64) not null,
	last_used timestamp not null
);
