drop table tb_user;
create table tb_user (uid serial NOT NULL,account varchar(50) not null, nick varchar(20), status int,create_at timestamp, update_at timestamp);

insert into tb_user (account,nick,status,create_at,update_at)values('admin','管理员',0,current_timestamp,current_timestamp);
insert into tb_user (account,nick,status,create_at,update_at)values('qq','腾讯',0,current_timestamp,current_timestamp);
insert into tb_user (account,nick,status,create_at,update_at)values('baidu','百度',0,current_timestamp,current_timestamp);
insert into tb_user (account,nick,status,create_at,update_at)values('taobao','阿里',0,current_timestamp,current_timestamp);