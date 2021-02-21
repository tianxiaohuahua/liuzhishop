# 金城街道二手交易平台制作日志

### 21.1.17

在制作之前首先可以确定的是想要制作的是商城。制作的过程围绕用户思维。根据商城一般有的用户界面，二手商品交易界面、和后台管理界面实现。

首先安装的JAVA版本是jdk8，安装eclipse、tomcat7、MySQL、tomcat

需要用到前端和后端的各种编程语言：java、HTML、JavaScript、CSS、。。

一、先从用户模块开始

1、制作用户表的增删改查，创建数据库

首先编辑数据库的一个用户表，起名字为64shop_user；

|     字段名称ID     |     类型     |                  约束                  | 描述                            |
| :----------------: | :----------: | :------------------------------------: | ------------------------------- |
|      USER_ID       | varchar(32)  |          NOT NULL PIRMARY KEY          | 用户的ID                        |
|     USER_NAME      | varchar(20)  |                NOT NULL                | 用户的名字                      |
|   USER_PASSWORD    | varchar(20)  |                NOT NULL                | 用户的密码                      |
|      USER_SEX      |  varchar(1)  |                NOT NULL                | 用户的性别T/F                   |
|   USER_BIRTHDAY    |   datatime   | (如果不存的话缺省值就是空)DEFAULT null | 出生日期                        |
| USER_IDE NITY_CODE | varchar(60)  |              DEFAULT null              | 拓展资料                        |
|     USER_EMAIL     | varchar(60)  |              DEFAULT null              | 邮箱                            |
|     USER_MOBEL     | varchar(11)  |              DEFAULT null              | 电话                            |
|    EUSR_ADDRESS    | varchar(200) |                NOT NULL                | 地址                            |
|    USER_STATUS     | varchar(6,0) |                NOT NULL                | 用户或管理员登陆状态1/2(管理员) |

接下来在数据库内新建这个设计好的数据库表，打开navicat，选择新建数据库：

![1-新建数据库表-数据库表的名字设置魏64shop](A:\Project\0-NOTE\1-新建数据库表-数据库表的名字设置魏64shop.PNG)

使用命令行的方式新建数据库表并赋值数据

![2-使用命令行的方式新建数据库表](A:\Project\0-NOTE\2-使用命令行的方式新建数据库表.PNG)

在命令行中执行如下命令：

```c
drop table if exists `64shop_user`;

create table `64shop_user`(
	user_ID varchar(32) not null,
	user_NAME varchar(20) not null,
	user_PASSWORD varchar(20) not null,
	user_SEX varchar(1) not null,
	user_BIRTHDAY datetime default null,
	user_IDENITY_CODE varchar(60) default null,
	user_EMAIL varchar(60) default null,
	user_MOBEL varchar(11) default null,
	user_ADDRESS varchar(200) not null,
	user_STATUS decimal(6,0) not null,
	primary key(`user_ID`)
)ENGINE=innD8 default charset=utf8;
```

在命令行内执行上面的代码以后，如下图：

![3-64shop_USER库表新建成功](A:\Project\0-NOTE\3-64shop_USER库表新建成功.PNG)

建立好数据表以后使用命令查看自己新建好的数据库：

```c
desc 64shop_user
```

查看结果：

![4-查看建立好的数据库表](A:\Project\0-NOTE\4-查看建立好的数据库表.PNG)

![4-查看建立好的数据库表](A:\Project\0-NOTE\4-查看建立好的数据库表.PNG)