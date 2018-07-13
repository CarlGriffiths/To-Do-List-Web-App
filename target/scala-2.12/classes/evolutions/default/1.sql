# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table item (
  id                            integer auto_increment not null,
  message                       varchar(255),
  completed                     boolean,
  constraint pk_item primary key (id)
);


# --- !Downs

drop table if exists item;

