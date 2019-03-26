create table if not exists
  github(
    login varchar(20) primary key ,
    token varchar(30) not null ,
    email varchar(30),
    name varchar(30)
  );

drop table github;