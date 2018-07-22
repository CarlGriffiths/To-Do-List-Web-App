# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            integer auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table item (
  id                            integer auto_increment not null,
  message                       varchar(255),
  date                          timestamp,
  completed                     boolean,
  constraint pk_item primary key (id)
);


# --- !Downs

drop table if exists category;

drop table if exists item;

