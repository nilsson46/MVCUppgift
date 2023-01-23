DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id int AUTO_INCREMENT primary key,
                       username varchar(255),
                       created_at date,
                       password varchar(32)
);


INSERT INTO users (username, created_at, password) VALUES ("Mats", now(), "mats");
INSERT INTO users (username, created_at, password) VALUES ("Alva", now(), "alva");
INSERT INTO users (username, created_at, password) VALUES ("Akar", now(), "akar");
INSERT INTO users (username, created_at, password) VALUES ("Isak", now(), "isak");
