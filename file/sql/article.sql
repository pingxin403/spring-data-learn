-- 准备数据库,创建一张文章表备用
CREATE TABLE `article` (
`aid` int(11) NOT NULL auto_increment COMMENT '主键',
`author` varchar(255) default NULL COMMENT '作者',
`createTime` datetime default NULL COMMENT '创建时间',
`title` varchar(255) default NULL COMMENT '标题',
PRIMARY KEY
(`aid`)
);

insert into `article` values(1,'平心','2020-01-01','论永动机的可行性');