个人开发的一个博客框架，正在不断完善各项功能<br>
前端使用的themleft+bootstrap<br>
后端开发用的springboot<br>
数据库是mysql<br>
数据框用的是Editor.md<br>
做这个框架大概用了一个多星期<br>
基本能踩得坑都踩了<br>
后续还会不断持续开发其他功能<br>

截图
![Image text](https://raw.githubusercontent.com/bklyyds/boke/master/1.jpg)
![Image text](https://raw.githubusercontent.com/bklyyds/boke/master/3.jpg)
![Image text](https://raw.githubusercontent.com/bklyyds/boke/master/4.jpg)
![Image text](https://raw.githubusercontent.com/bklyyds/boke/master/5.jpg)

sql语句如下
```aidl
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT  PRIMARY KEY ,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `token` varchar(45) NOT NULL
);

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `token` varchar(45) NOT NULL,
  `headpic` varchar(1024) NOT NULL DEFAULT 'https://img2.woyaogexing.com/2021/08/09/d99048e6061b4d85ad403813d3aabaa4!400x400.jpeg',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8user;
```
```aidl
CREATE TABLE `question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `createid` int(11) NOT NULL,
  `comment_count` int(11) NOT NULL DEFAULT '0',
  `view_count` int(11) NOT NULL DEFAULT '0',
  `like_count` int(11) NOT NULL DEFAULT '0',
  `tag` varchar(250) NOT NULL,
  `createtime` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
```

```aidl
CREATE TABLE `notification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notifier` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `outerid` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `createtime` bigint(20) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
DROP TABLE notification;
```
```aidl
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `commentor` int(11) DEFAULT NULL,
  `createtime` bigint(20) DEFAULT NULL,
  `like_count` int(11) DEFAULT '0',
  `content` varchar(200) NOT NULL,
  `commentcount` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

```