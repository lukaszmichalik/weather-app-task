CREATE TABLE requests(
    id serial not null ,
    latitude numeric,
    longitude numeric,
    time timestamp,
    primary key (id)
);
