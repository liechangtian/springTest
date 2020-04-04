create table black_apps
(
  id     bigint    not null auto_increment,
  appid  char(100) not null,
  locale char(10)  not null,
  primary key (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

insert into black_apps(appid, locale)
values ('43532', 'IN'),
       ('89734', 'IN'),
       ('46736', 'IN'),
       ('43532', 'ID'),
       ('87493', 'RU');
