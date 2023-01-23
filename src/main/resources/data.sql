DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id int AUTO_INCREMENT priamry key,
    username varchar(255),
    password varchar(255)
)

INSERT INTO users (username, password ) VALUES ("Mats", "123");
INSERT INTO users (username, password ) VALUES ("Alva", "123");
INSERT INTO users (username, password ) VALUES ("Akar", "123");
INSERT INTO users (username, password ) VALUES ("Isak", "123");

