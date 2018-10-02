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
  date_completed                timestamp,
  category_id                   integer,
  user_email                    varchar(255),
  constraint pk_item primary key (id)
);

create table user (
  email                         varchar(255) not null,
  pass                          varchar(255),
  city                          varchar(255),
  points                        integer not null,
  completed                     integer not null,
  constraint pk_user primary key (email)
);

alter table item add constraint fk_item_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_item_category_id on item (category_id);

alter table item add constraint fk_item_user_email foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_item_user_email on item (user_email);


# --- !Downs

alter table item drop constraint if exists fk_item_category_id;
drop index if exists ix_item_category_id;

alter table item drop constraint if exists fk_item_user_email;
drop index if exists ix_item_user_email;

drop table if exists category;

drop table if exists item;

drop table if exists user;

