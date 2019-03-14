/*
Navicat MySQL Data Transfer

Source Server         : LR
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : mylibrary

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-03-14 20:10:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `BNO` char(20) NOT NULL,
  `BKNO` char(20) DEFAULT NULL,
  `BNAME` varchar(20) NOT NULL,
  `AUTHOR` char(30) NOT NULL,
  `PUB` char(30) DEFAULT NULL,
  `PRICE` float(8,2) DEFAULT NULL,
  `PIC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`BNO`),
  KEY `FK_include` (`BKNO`),
  CONSTRAINT `FK_include` FOREIGN KEY (`BKNO`) REFERENCES `bookkind` (`BKNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('9787115179043', 'TP312.7', 'Excel高效办公', '盛澄华', '机械工业出版社', '49.00', null);
INSERT INTO `book` VALUES ('9787115219619', 'TP312.7', 'office办公高手', '沈丽', '清华大学出版社', '1239.00', null);
INSERT INTO `book` VALUES ('9787115220578', 'TP312.7', '让你的PPT会说话', '周洲', '清华大学出版社', '89.00', null);
INSERT INTO `book` VALUES ('9787115221674', 'TP316.2', '精通Linux', '陈华亭', '机械工业出版社', '48.00', null);
INSERT INTO `book` VALUES ('9787115222817', 'TP312.7', 'spass统计分析', '江铠同', '机械工业出版社', '49.00', null);
INSERT INTO `book` VALUES ('9787115223104', 'TP312.7', 'office2016办公应用', '蒋健', '清华大学出版社', '32.00', null);
INSERT INTO `book` VALUES ('9787115223883', 'TP302.7', '软件测试技术', '于丹', '机械工业出版社', '79.00', null);
INSERT INTO `book` VALUES ('9787115224132', 'TP316.2', '苹果MacOS', '陈婷芳', '清华大学出版社', '24.00', null);
INSERT INTO `book` VALUES ('9787115224262', 'O411', '电路基础', '王辉', '华中科技大学出版社', '22.00', null);
INSERT INTO `book` VALUES ('9787115224996', 'O412', '模拟电子技术', '陈晨', '华中科技大学出版社', '25.00', null);
INSERT INTO `book` VALUES ('9787115225184', 'O411', '电子技术基础与技能', '张震', '中国商务出版社', '24.00', null);
INSERT INTO `book` VALUES ('9787115225481', 'TP312.7', 'Java程序设计', '杨启申', '清华大学出版社', '32.00', null);
INSERT INTO `book` VALUES ('9787115226075', 'TP312', '电工基础', '余万里', '科学出版社', '24.00', null);
INSERT INTO `book` VALUES ('9787115226334', 'O412', '常用工具软件', '陈中标', '中国农业出版社', '32.00', null);
INSERT INTO `book` VALUES ('9787115226662', 'TP319', '计算机主板维修', '李大力', '安徽科学技术出版社', '39.00', null);
INSERT INTO `book` VALUES ('9787115226846', 'TP301', '深入Linux', '徐燕', '中国农业出版社', '149.00', null);
INSERT INTO `book` VALUES ('9787115227430', 'TP316.2', '数据库应用', '陈登', '清华大学出版社', '59.00', null);
INSERT INTO `book` VALUES ('9787115227478', 'TP312.7', '软件导论', '杨万华', '清华大学出版社', '35.00', null);
INSERT INTO `book` VALUES ('9787115227607', 'TP312.7', 'photoshopcc2017', '李丽萨', '清华大学出版社', '39.00', null);
INSERT INTO `book` VALUES ('9787115227874', 'TP319', '从零开始CC2018', '李丽萨', '安徽科学技术出版社', '29.00', null);
INSERT INTO `book` VALUES ('9787115227898', 'O411', '3ds Max2010中文版', '于聪三', '安徽科学技术出版社', '42.00', null);
INSERT INTO `book` VALUES ('9787115228505', 'TP392', '电路分析基础', '刘娃妮', '高等教育出版社', '27.00', null);
INSERT INTO `book` VALUES ('9787115229946', 'TP312', 'SQL Server2008', '李航', '清华大学出版社', '69.00', null);
INSERT INTO `book` VALUES ('9787115230294', 'TP312', 'Shell脚本专家', '玛莎莉', '人民出版社', '39.00', null);
INSERT INTO `book` VALUES ('9787115230805', 'TP312', 'C语言从入门到精通', '袁世华', '安徽科学技术出版社', '59.00', null);
INSERT INTO `book` VALUES ('9787115231048', 'TP301', '大学计算机基础', '肖云峰', '华中科技大学出版社', '29.50', null);
INSERT INTO `book` VALUES ('9787115231086', 'TP312', '数字逻辑', '崔晓雪', '中国商务出版社', '65.00', null);

-- ----------------------------
-- Table structure for `bookkind`
-- ----------------------------
DROP TABLE IF EXISTS `bookkind`;
CREATE TABLE `bookkind` (
  `BKNO` char(20) NOT NULL,
  `BKNAME` char(20) NOT NULL,
  `BKD` varchar(50) NOT NULL,
  PRIMARY KEY (`BKNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookkind
-- ----------------------------
INSERT INTO `bookkind` VALUES ('O411', '电子类-电工技术', '电子类图书');
INSERT INTO `bookkind` VALUES ('O412', '电子类-自动控制', '电子类图书');
INSERT INTO `bookkind` VALUES ('TP301', '电子类-家电维修', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP302.7', '计算机类-其他', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP312', '计算机类-软件开发', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP312.7', '计算机类-办公软件', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP316.2', '计算机类-操作系统', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP317.2', '计算机类-平面设计', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP319', '计算机类-办公软件', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP392', '计算机类-数据库', '电子类的家电控制');
INSERT INTO `bookkind` VALUES ('TP393', '计算机类-网络技术', '电子类的家电控制');

-- ----------------------------
-- Table structure for `jy`
-- ----------------------------
DROP TABLE IF EXISTS `jy`;
CREATE TABLE `jy` (
  `RNO` char(15) NOT NULL,
  `BNO` char(20) NOT NULL,
  `JDATE` datetime NOT NULL,
  `RDATE` datetime NOT NULL,
  `GHDATE` datetime DEFAULT NULL,
  `FINE` float(8,2) DEFAULT NULL,
  PRIMARY KEY (`RNO`,`BNO`),
  KEY `FK_JY2` (`BNO`),
  CONSTRAINT `FK_JY` FOREIGN KEY (`RNO`) REFERENCES `reader` (`RNO`),
  CONSTRAINT `FK_JY2` FOREIGN KEY (`BNO`) REFERENCES `book` (`BNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jy
-- ----------------------------
INSERT INTO `jy` VALUES ('H201621001', '9787115225184', '2018-05-18 00:00:00', '2018-06-18 00:00:00', '0000-00-00 00:00:00', '0.00');
INSERT INTO `jy` VALUES ('H201621002', '9787115227430', '2018-06-04 00:00:00', '2018-07-04 00:00:00', '0000-00-00 00:00:00', '0.00');
INSERT INTO `jy` VALUES ('H201621004', '9787115225184', '2017-07-10 00:00:00', '2017-08-10 00:00:00', '2017-09-10 00:00:00', '1.00');
INSERT INTO `jy` VALUES ('H201621006', '9787115227898', '2017-08-15 00:00:00', '2017-09-15 00:00:00', '2017-09-17 00:00:00', '0.20');
INSERT INTO `jy` VALUES ('J201602001', '9787115179043', '2018-04-06 00:00:00', '2018-05-06 00:00:00', '2018-05-10 00:00:00', '0.40');
INSERT INTO `jy` VALUES ('J201602005', '9787115227898', '2017-11-02 00:00:00', '2018-12-02 00:00:00', '2018-12-02 00:00:00', '0.00');
INSERT INTO `jy` VALUES ('J201602006', '9787115221674', '2018-04-05 00:00:00', '2018-05-05 00:00:00', '2018-05-08 00:00:00', '0.30');
INSERT INTO `jy` VALUES ('J201602006', '9787115224996', '2017-09-01 00:00:00', '2017-10-01 00:00:00', '2017-10-05 00:00:00', '0.20');
INSERT INTO `jy` VALUES ('J201602006', '9787115226334', '2017-06-01 00:00:00', '2017-07-01 00:00:00', '2017-07-06 00:00:00', '0.50');
INSERT INTO `jy` VALUES ('J201602006', '9787115226846', '2017-06-25 00:00:00', '2017-07-25 00:00:00', '2017-08-01 00:00:00', '0.50');
INSERT INTO `jy` VALUES ('J201602006', '9787115227478', '2017-03-28 00:00:00', '2017-04-28 00:00:00', '2017-04-30 00:00:00', '0.20');
INSERT INTO `jy` VALUES ('J201602006', '9787115228505', '2017-06-05 00:00:00', '2017-07-05 00:00:00', '2017-07-05 00:00:00', '0.00');
INSERT INTO `jy` VALUES ('J201602006', '9787115230294', '2017-04-06 00:00:00', '2017-05-06 00:00:00', '2017-06-06 00:00:00', '1.00');
INSERT INTO `jy` VALUES ('J201602007', '9787115222817', '2018-05-28 00:00:00', '2018-06-28 00:00:00', '0000-00-00 00:00:00', '0.00');
INSERT INTO `jy` VALUES ('J201602007', '9787115227607', '2017-07-10 00:00:00', '2017-08-10 00:00:00', '2017-08-10 00:00:00', '0.00');

-- ----------------------------
-- Table structure for `reader`
-- ----------------------------
DROP TABLE IF EXISTS `reader`;
CREATE TABLE `reader` (
  `RNO` char(15) NOT NULL,
  `RNAME` char(20) NOT NULL,
  `RSTATE` char(10) NOT NULL,
  `TEL` char(11) NOT NULL,
  `PIC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reader
-- ----------------------------
INSERT INTO `reader` VALUES ('H201621001', '王铭', '可用', '18900000000', null);
INSERT INTO `reader` VALUES ('H201621002', '王莉', '可用', '17900000000', null);
INSERT INTO `reader` VALUES ('H201621004', '王力', '可用', '15300000111', '1c3f2710-8534-450d-8e59-a5c9795add57.jpg');
INSERT INTO `reader` VALUES ('H201621006', '李红', '可用', '14200000000', null);
INSERT INTO `reader` VALUES ('H201621008', 'leeray', '有效', '15789896753', null);
INSERT INTO `reader` VALUES ('H201621009', '李丽', '可用', '17500000000', null);
INSERT INTO `reader` VALUES ('H201621010', '李璐', '可用', '16500000000', null);
INSERT INTO `reader` VALUES ('H201621090', '王栋', '有效', '18571126867', null);
INSERT INTO `reader` VALUES ('H201621111', '王良', '可用', '02712129090', null);
INSERT INTO `reader` VALUES ('J201602001', '张数', '失效', '19800000000', null);
INSERT INTO `reader` VALUES ('J201602002', '张希', '可用', '11200000000', null);
INSERT INTO `reader` VALUES ('J201602003', '张宏', '失效', '11400000000', null);
INSERT INTO `reader` VALUES ('J201602005', '彭丽', '可用', '13600000000', null);
INSERT INTO `reader` VALUES ('J201602006', '彭静', '可用', '16100000001', 'cbf03a53-48d3-4cf0-b9c0-101725b3bfec.jpg');
INSERT INTO `reader` VALUES ('J201602007', '马伟', '可用', '18300000000', null);
INSERT INTO `reader` VALUES ('J201602900', '阿朱', '可用', '02701213209', null);
