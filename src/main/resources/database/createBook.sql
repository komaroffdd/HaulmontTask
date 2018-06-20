CREATE TABLE book
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name_book varchar(30) NOT NULL,
    author int(30) NOT NULL,
    genre int(30) NOT NULL,
    publisher varchar(30) NOT NULL,
    city varchar(30) NOT NULL
);
