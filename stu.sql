create table stu(id bigint primary key 
not null GENERATED BY DEFAULT AS IDENTITY,
username varchar(200),
pass varchar(50),
os decimal,java decimal,math decimal)
delete from stu
insert into stu(username,pass,os,java,math) values('zhangsan','123',100,86,90)
insert into stu(username,pass,os,java,math) values('lisi','123',100,86,90)
insert into stu(username,pass,os,java,math) values('wangwu','123',100,86,90)
insert into stu(username,pass,os,java,math) values('liuliu','123',100,86,90)