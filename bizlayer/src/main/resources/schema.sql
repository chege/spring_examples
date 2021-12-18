create table review(
    id integer not null AUTO_INCREMENT,
    brewery_id VARCHAR(64) not null,
    comment CHARACTER VARYING not null,
    PRIMARY key(id)
);