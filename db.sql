/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - ssmxynp9
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssmxynp9` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssmxynp9`;

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/ssmxynp9/upload/1618412361473.jpg'),(2,'picture2','http://localhost:8080/ssmxynp9/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmxynp9/upload/1618412369578.jpg'),(6,'picture4','http://localhost:8080/ssmxynp9/upload/1618412392377.jpg');

/*Table structure for table `discussjiankangjihua` */

DROP TABLE IF EXISTS `discussjiankangjihua`;

CREATE TABLE `discussjiankangjihua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='健康计划评论表';

/*Data for the table `discussjiankangjihua` */

insert  into `discussjiankangjihua`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (101,'2021-04-14 22:52:59',1,1,'用户名1','评论内容1','回复内容1'),(102,'2021-04-14 22:52:59',2,2,'用户名2','评论内容2','回复内容2'),(103,'2021-04-14 22:52:59',3,3,'用户名3','评论内容3','回复内容3'),(104,'2021-04-14 22:52:59',4,4,'用户名4','评论内容4','回复内容4'),(105,'2021-04-14 22:52:59',5,5,'用户名5','评论内容5','回复内容5'),(106,'2021-04-14 22:52:59',6,6,'用户名6','评论内容6','回复内容6');

/*Table structure for table `discussjiankangxinxigongxiang` */

DROP TABLE IF EXISTS `discussjiankangxinxigongxiang`;

CREATE TABLE `discussjiankangxinxigongxiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412145282 DEFAULT CHARSET=utf8 COMMENT='健康信息共享评论表';

/*Data for the table `discussjiankangxinxigongxiang` */

insert  into `discussjiankangxinxigongxiang`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (91,'2021-04-14 22:52:59',1,1,'用户名1','评论内容1','回复内容1'),(92,'2021-04-14 22:52:59',2,2,'用户名2','评论内容2','回复内容2'),(93,'2021-04-14 22:52:59',3,3,'用户名3','评论内容3','回复内容3'),(94,'2021-04-14 22:52:59',4,4,'用户名4','评论内容4','回复内容4'),(95,'2021-04-14 22:52:59',5,5,'用户名5','评论内容5','回复内容5'),(96,'2021-04-14 22:52:59',6,6,'用户名6','评论内容6','回复内容6'),(1618412145281,'2021-04-14 22:55:44',1618412136461,1618412085653,'12','12','');

/*Table structure for table `discusszhishikepu` */

DROP TABLE IF EXISTS `discusszhishikepu`;

CREATE TABLE `discusszhishikepu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='知识科普评论表';

/*Data for the table `discusszhishikepu` */

insert  into `discusszhishikepu`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (81,'2021-04-14 22:52:59',1,1,'用户名1','评论内容1','回复内容1'),(82,'2021-04-14 22:52:59',2,2,'用户名2','评论内容2','回复内容2'),(83,'2021-04-14 22:52:59',3,3,'用户名3','评论内容3','回复内容3'),(84,'2021-04-14 22:52:59',4,4,'用户名4','评论内容4','回复内容4'),(85,'2021-04-14 22:52:59',5,5,'用户名5','评论内容5','回复内容5'),(86,'2021-04-14 22:52:59',6,6,'用户名6','评论内容6','回复内容6');

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412190783 DEFAULT CHARSET=utf8 COMMENT='交流区';

/*Data for the table `forum` */

insert  into `forum`(`id`,`addtime`,`title`,`content`,`parentid`,`userid`,`username`,`isdone`) values (71,'2021-04-14 22:52:59','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(72,'2021-04-14 22:52:59','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(73,'2021-04-14 22:52:59','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(74,'2021-04-14 22:52:59','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(75,'2021-04-14 22:52:59','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(76,'2021-04-14 22:52:59','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1618412181179,'2021-04-14 22:56:20','12','12',0,1618412085653,'12','关闭'),(1618412186853,'2021-04-14 22:56:25',NULL,'12',1618412181179,1618412085653,'12',NULL),(1618412190782,'2021-04-14 22:56:29',NULL,'12',1618412186853,1618412085653,'12',NULL);

/*Table structure for table `jiankangjihua` */

DROP TABLE IF EXISTS `jiankangjihua`;

CREATE TABLE `jiankangjihua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `tizhong` varchar(200) NOT NULL COMMENT '体重',
  `nianling` varchar(200) NOT NULL COMMENT '年龄',
  `shengao` varchar(200) NOT NULL COMMENT '身高',
  `yinshijianyi` varchar(200) NOT NULL COMMENT '饮食建议',
  `yundongjianyi` varchar(200) NOT NULL COMMENT '运动建议',
  `beizhu` longtext COMMENT '备注',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412328614 DEFAULT CHARSET=utf8 COMMENT='健康计划';

/*Data for the table `jiankangjihua` */

insert  into `jiankangjihua`(`id`,`addtime`,`biaoti`,`tizhong`,`nianling`,`shengao`,`yinshijianyi`,`yundongjianyi`,`beizhu`,`fengmian`,`thumbsupnum`,`crazilynum`,`clicknum`) values (41,'2021-04-14 22:52:59','标题1','体重1','年龄1','身高1','饮食建议1','运动建议1','备注1','http://localhost:8080/ssmxynp9/upload/jiankangjihua_fengmian1.jpg',1,1,1),(42,'2021-04-14 22:52:59','标题2','体重2','年龄2','身高2','饮食建议2','运动建议2','备注2','http://localhost:8080/ssmxynp9/upload/jiankangjihua_fengmian2.jpg',2,2,2),(43,'2021-04-14 22:52:59','标题3','体重3','年龄3','身高3','饮食建议3','运动建议3','备注3','http://localhost:8080/ssmxynp9/upload/jiankangjihua_fengmian3.jpg',3,3,3),(44,'2021-04-14 22:52:59','标题4','体重4','年龄4','身高4','饮食建议4','运动建议4','备注4','http://localhost:8080/ssmxynp9/upload/jiankangjihua_fengmian4.jpg',4,4,4),(45,'2021-04-14 22:52:59','标题5','体重5','年龄5','身高5','饮食建议5','运动建议5','备注5','http://localhost:8080/ssmxynp9/upload/jiankangjihua_fengmian5.jpg',5,5,5),(46,'2021-04-14 22:52:59','标题6','体重6','年龄6','身高6','饮食建议6','运动建议6','备注6','http://localhost:8080/ssmxynp9/upload/jiankangjihua_fengmian6.jpg',6,6,6),(1618412328613,'2021-04-14 22:58:48','测试计划','12','122','1222','12','12','12','http://localhost:8080/ssmxynp9/upload/1618412321709.jpg',0,0,0);

/*Table structure for table `jiankangshuju` */

DROP TABLE IF EXISTS `jiankangshuju`;

CREATE TABLE `jiankangshuju` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) NOT NULL COMMENT '编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `gerentouxiang` varchar(200) DEFAULT NULL COMMENT '个人头像',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shengao` varchar(200) DEFAULT NULL COMMENT '身高',
  `tizhong` varchar(200) DEFAULT NULL COMMENT '体重',
  `yinshixiguan` longtext COMMENT '饮食习惯',
  `yundongxiguan` longtext COMMENT '运动习惯',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412168113 DEFAULT CHARSET=utf8 COMMENT='健康数据';

/*Data for the table `jiankangshuju` */

insert  into `jiankangshuju`(`id`,`addtime`,`bianhao`,`yonghuzhanghao`,`yonghuming`,`lianxidianhua`,`gerentouxiang`,`nianling`,`shengao`,`tizhong`,`yinshixiguan`,`yundongxiguan`,`beizhu`,`fabushijian`,`userid`) values (51,'2021-04-14 22:52:59','编号1','用户账号1','用户名1','联系电话1','http://localhost:8080/ssmxynp9/upload/jiankangshuju_gerentouxiang1.jpg',1,'身高1','体重1','饮食习惯1','运动习惯1','备注1','2021-04-14 22:52:59',1),(52,'2021-04-14 22:52:59','编号2','用户账号2','用户名2','联系电话2','http://localhost:8080/ssmxynp9/upload/jiankangshuju_gerentouxiang2.jpg',2,'身高2','体重2','饮食习惯2','运动习惯2','备注2','2021-04-14 22:52:59',2),(53,'2021-04-14 22:52:59','编号3','用户账号3','用户名3','联系电话3','http://localhost:8080/ssmxynp9/upload/jiankangshuju_gerentouxiang3.jpg',3,'身高3','体重3','饮食习惯3','运动习惯3','备注3','2021-04-14 22:52:59',3),(54,'2021-04-14 22:52:59','编号4','用户账号4','用户名4','联系电话4','http://localhost:8080/ssmxynp9/upload/jiankangshuju_gerentouxiang4.jpg',4,'身高4','体重4','饮食习惯4','运动习惯4','备注4','2021-04-14 22:52:59',4),(55,'2021-04-14 22:52:59','编号5','用户账号5','用户名5','联系电话5','http://localhost:8080/ssmxynp9/upload/jiankangshuju_gerentouxiang5.jpg',5,'身高5','体重5','饮食习惯5','运动习惯5','备注5','2021-04-14 22:52:59',5),(56,'2021-04-14 22:52:59','编号6','用户账号6','用户名6','联系电话6','http://localhost:8080/ssmxynp9/upload/jiankangshuju_gerentouxiang6.jpg',6,'身高6','体重6','饮食习惯6','运动习惯6','备注6','2021-04-14 22:52:59',6),(1618412168112,'2021-04-14 22:56:07','1618412158953','12','12','13226308706','http://localhost:8080/ssmxynp9/upload/1618412163427.jpg',12,'12','12','12','12','21','2021-04-14 22:55:58',1618412085653);

/*Table structure for table `jiankangxinxigongxiang` */

DROP TABLE IF EXISTS `jiankangxinxigongxiang`;

CREATE TABLE `jiankangxinxigongxiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `gerentouxiang` varchar(200) DEFAULT NULL COMMENT '个人头像',
  `nianling` int(11) NOT NULL COMMENT '年龄',
  `shengao` varchar(200) NOT NULL COMMENT '身高',
  `tizhong` varchar(200) NOT NULL COMMENT '体重',
  `yinshixiguan` varchar(200) NOT NULL COMMENT '饮食习惯',
  `yundongxiguan` varchar(200) NOT NULL COMMENT '运动习惯',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412136462 DEFAULT CHARSET=utf8 COMMENT='健康信息共享';

/*Data for the table `jiankangxinxigongxiang` */

insert  into `jiankangxinxigongxiang`(`id`,`addtime`,`yonghuzhanghao`,`yonghuming`,`xingbie`,`gerentouxiang`,`nianling`,`shengao`,`tizhong`,`yinshixiguan`,`yundongxiguan`,`beizhu`,`sfsh`,`shhf`,`thumbsupnum`,`crazilynum`,`clicktime`,`clicknum`) values (31,'2021-04-14 22:52:59','用户账号1','用户名1','性别1','http://localhost:8080/ssmxynp9/upload/jiankangxinxigongxiang_gerentouxiang1.jpg',1,'身高1','体重1','饮食习惯1','从不','备注1','是','',1,1,'2021-04-14 22:52:59',1),(32,'2021-04-14 22:52:59','用户账号2','用户名2','性别2','http://localhost:8080/ssmxynp9/upload/jiankangxinxigongxiang_gerentouxiang2.jpg',2,'身高2','体重2','饮食习惯2','从不','备注2','是','',2,2,'2021-04-14 22:52:59',2),(33,'2021-04-14 22:52:59','用户账号3','用户名3','性别3','http://localhost:8080/ssmxynp9/upload/jiankangxinxigongxiang_gerentouxiang3.jpg',3,'身高3','体重3','饮食习惯3','从不','备注3','是','',3,3,'2021-04-14 22:52:59',3),(34,'2021-04-14 22:52:59','用户账号4','用户名4','性别4','http://localhost:8080/ssmxynp9/upload/jiankangxinxigongxiang_gerentouxiang4.jpg',4,'身高4','体重4','饮食习惯4','从不','备注4','是','',4,4,'2021-04-14 22:52:59',4),(35,'2021-04-14 22:52:59','用户账号5','用户名5','性别5','http://localhost:8080/ssmxynp9/upload/jiankangxinxigongxiang_gerentouxiang5.jpg',5,'身高5','体重5','饮食习惯5','从不','备注5','是','',5,5,'2021-04-14 22:52:59',5),(36,'2021-04-14 22:52:59','用户账号6','用户名6','性别6','http://localhost:8080/ssmxynp9/upload/jiankangxinxigongxiang_gerentouxiang6.jpg',6,'身高6','体重6','饮食习惯6','从不','备注6','是','',6,6,'2021-04-14 22:54:59',7),(1618412136461,'2021-04-14 22:55:35','12','12','女','http://localhost:8080/ssmxynp9/upload/1618412126802.jpg',22,'12','12','12','经常','12','是','',1,0,'2021-04-14 23:00:31',4);

/*Table structure for table `shujufenxi` */

DROP TABLE IF EXISTS `shujufenxi`;

CREATE TABLE `shujufenxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `fabushijian` varchar(200) DEFAULT NULL COMMENT '发布时间',
  `fenxijieguo` varchar(200) DEFAULT NULL COMMENT '分析结果',
  `jiankangjianyi` longtext COMMENT '健康建议',
  `keguantuxiang` varchar(200) DEFAULT NULL COMMENT '客观图像',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412344654 DEFAULT CHARSET=utf8 COMMENT='数据分析';

/*Data for the table `shujufenxi` */

insert  into `shujufenxi`(`id`,`addtime`,`bianhao`,`yonghuzhanghao`,`yonghuming`,`fabushijian`,`fenxijieguo`,`jiankangjianyi`,`keguantuxiang`,`userid`) values (61,'2021-04-14 22:52:59','编号1','用户账号1','用户名1','发布时间1','较差','健康建议1','http://localhost:8080/ssmxynp9/upload/shujufenxi_keguantuxiang1.jpg',1),(62,'2021-04-14 22:52:59','编号2','用户账号2','用户名2','发布时间2','较差','健康建议2','http://localhost:8080/ssmxynp9/upload/shujufenxi_keguantuxiang2.jpg',2),(63,'2021-04-14 22:52:59','编号3','用户账号3','用户名3','发布时间3','较差','健康建议3','http://localhost:8080/ssmxynp9/upload/shujufenxi_keguantuxiang3.jpg',3),(64,'2021-04-14 22:52:59','编号4','用户账号4','用户名4','发布时间4','较差','健康建议4','http://localhost:8080/ssmxynp9/upload/shujufenxi_keguantuxiang4.jpg',4),(65,'2021-04-14 22:52:59','编号5','用户账号5','用户名5','发布时间5','较差','健康建议5','http://localhost:8080/ssmxynp9/upload/shujufenxi_keguantuxiang5.jpg',5),(66,'2021-04-14 22:52:59','编号6','用户账号6','用户名6','发布时间6','较差','健康建议6','http://localhost:8080/ssmxynp9/upload/shujufenxi_keguantuxiang6.jpg',6),(1618412344653,'2021-04-14 22:59:04','1618412158953','12','12','2021-04-14 22:55:58','普通','<p>12</p>','http://localhost:8080/ssmxynp9/upload/1618412342604.jpg',1618412085653);

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1618412085653,'12','yonghu','用户','4cqclvqzghkwe1v3p0fo7ib9oftf4kd4','2021-04-14 22:54:51','2021-04-14 23:54:52'),(2,1,'abo','users','管理员','fia07hine909fw5yan9wt7ntkc803f3j','2021-04-14 22:57:13','2021-04-14 23:57:14');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'abo','abo','管理员','2021-04-14 22:52:59');

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `gerentouxiang` varchar(200) DEFAULT NULL COMMENT '个人头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412085654 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`addtime`,`yonghuzhanghao`,`mima`,`yonghuming`,`xingbie`,`lianxidianhua`,`gerentouxiang`) values (11,'2021-04-14 22:52:59','用户1','123456','用户名1','男','13823888881','http://localhost:8080/ssmxynp9/upload/yonghu_gerentouxiang1.jpg'),(12,'2021-04-14 22:52:59','用户2','123456','用户名2','男','13823888882','http://localhost:8080/ssmxynp9/upload/yonghu_gerentouxiang2.jpg'),(13,'2021-04-14 22:52:59','用户3','123456','用户名3','男','13823888883','http://localhost:8080/ssmxynp9/upload/yonghu_gerentouxiang3.jpg'),(14,'2021-04-14 22:52:59','用户4','123456','用户名4','男','13823888884','http://localhost:8080/ssmxynp9/upload/yonghu_gerentouxiang4.jpg'),(15,'2021-04-14 22:52:59','用户5','123456','用户名5','男','13823888885','http://localhost:8080/ssmxynp9/upload/yonghu_gerentouxiang5.jpg'),(16,'2021-04-14 22:52:59','用户6','123456','用户名6','男','13823888886','http://localhost:8080/ssmxynp9/upload/yonghu_gerentouxiang6.jpg'),(1618412085653,'2021-04-14 22:54:45','12','12','12','女','13226308706','http://localhost:8080/ssmxynp9/upload/1618412245666.jpg');

/*Table structure for table `zhishikepu` */

DROP TABLE IF EXISTS `zhishikepu`;

CREATE TABLE `zhishikepu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `shipinjieshao` varchar(200) DEFAULT NULL COMMENT '视频介绍',
  `xiangxineirong` longtext COMMENT '详细内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `gengxinshijian` datetime DEFAULT NULL COMMENT '更新时间',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1618412268746 DEFAULT CHARSET=utf8 COMMENT='知识科普';

/*Data for the table `zhishikepu` */

insert  into `zhishikepu`(`id`,`addtime`,`biaoti`,`fengmian`,`shipinjieshao`,`xiangxineirong`,`fabushijian`,`gengxinshijian`,`thumbsupnum`,`crazilynum`,`clicktime`,`clicknum`) values (21,'2021-04-14 22:52:59','标题1','http://localhost:8080/ssmxynp9/upload/zhishikepu_fengmian1.jpg','','详细内容1','2021-04-14 22:52:59','2021-04-14 22:52:59',1,1,'2021-04-14 22:52:59',1),(22,'2021-04-14 22:52:59','标题2','http://localhost:8080/ssmxynp9/upload/zhishikepu_fengmian2.jpg','','详细内容2','2021-04-14 22:52:59','2021-04-14 22:52:59',2,2,'2021-04-14 22:52:59',2),(23,'2021-04-14 22:52:59','标题3','http://localhost:8080/ssmxynp9/upload/zhishikepu_fengmian3.jpg','','详细内容3','2021-04-14 22:52:59','2021-04-14 22:52:59',3,3,'2021-04-14 22:52:59',3),(24,'2021-04-14 22:52:59','标题4','http://localhost:8080/ssmxynp9/upload/zhishikepu_fengmian4.jpg','','详细内容4','2021-04-14 22:52:59','2021-04-14 22:52:59',4,4,'2021-04-14 22:55:04',5),(25,'2021-04-14 22:52:59','标题5','http://localhost:8080/ssmxynp9/upload/zhishikepu_fengmian5.jpg','','详细内容5','2021-04-14 22:52:59','2021-04-14 22:52:59',5,5,'2021-04-14 22:52:59',5),(26,'2021-04-14 22:52:59','标题6','http://localhost:8080/ssmxynp9/upload/zhishikepu_fengmian6.jpg','','详细内容6','2021-04-14 22:52:59','2021-04-14 22:52:59',6,6,'2021-04-14 22:54:56',7),(1618412268745,'2021-04-14 22:57:48','测试科普','http://localhost:8080/ssmxynp9/upload/1618412258492.jpg','http://localhost:8080/ssmxynp9/upload/1618412263981.mp4','<p>12</p>','2021-04-14 22:57:46','2021-04-14 22:57:31',1,0,'2021-04-14 23:00:37',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
