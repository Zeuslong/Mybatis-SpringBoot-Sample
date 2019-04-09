create database if not exists `demo_user` default character set utf8 collate utf8_general_ci;

use demo_user;

create table if not exists user (
    id bigint not null primary key auto_increment comment '账号的唯一标识，在整个平台与接入这个平台的系统当中都可以唯一的标识一个用户',
    user_name varchar(255) not null unique comment '俗称的用户名，这一项不能为空就算是第一次注册的时候，用户没有填写也由算法自动生成，要求具有唯一性，唯一一个用户名能标识唯一一个账号，账号当中只能包含字母与数字的组合'
) engine = INNODB
    comment '账号主体表，此表当中只存放与登陆相关的信息，与用户本身信息相关的信息解耦';

insert into user (id, user_name)
    value (1, 'test');