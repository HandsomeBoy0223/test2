/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50605
Source Host           : localhost:3306
Source Database       : keshe

Target Server Type    : MYSQL
Target Server Version : 50605
File Encoding         : 65001

Date: 2017-10-17 22:29:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for carinfo
-- ----------------------------
DROP TABLE IF EXISTS `carinfo`;
CREATE TABLE `carinfo` (
  `carId` int(11) NOT NULL AUTO_INCREMENT,
  `shoptime` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `sale` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`carId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carinfo
-- ----------------------------
INSERT INTO `carinfo` VALUES ('1', '2017.7.10', 'A1', '101', '否', '120');
INSERT INTO `carinfo` VALUES ('2', '2017.7.11', 'A2', '200', '否', '120');
INSERT INTO `carinfo` VALUES ('3', '2017.7.12', 'A3', '300', '否', '100');
INSERT INTO `carinfo` VALUES ('4', '2017.1.1', 'X6', '400', '是', '22');
INSERT INTO `carinfo` VALUES ('8', '2017.1.1', 'X5', '500', '是', '98');
INSERT INTO `carinfo` VALUES ('18', '2017.7.12', 'X4', '600', '否', '77');
INSERT INTO `carinfo` VALUES ('22', '2017.2.1', 'X1', '11', '否', '11');

-- ----------------------------
-- Table structure for caropt
-- ----------------------------
DROP TABLE IF EXISTS `caropt`;
CREATE TABLE `caropt` (
  `carId` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `opt` varchar(255) DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`carId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of caropt
-- ----------------------------
INSERT INTO `caropt` VALUES ('1', 'A5', '增加：16俩', '买入');
INSERT INTO `caropt` VALUES ('3', 'X1', '增加：2俩', '买入');
INSERT INTO `caropt` VALUES ('4', 'X3', '增加：3俩', '买入');
INSERT INTO `caropt` VALUES ('5', 'X4', '增加：16俩', '买入');
INSERT INTO `caropt` VALUES ('6', 'X5', '减少：1俩', '耗损');
INSERT INTO `caropt` VALUES ('7', 'A3', '增加：100俩', '买入');
INSERT INTO `caropt` VALUES ('8', 'A1', '减少：11辆', '出售');
INSERT INTO `caropt` VALUES ('9', 'A2', '减少：8俩', '出售');
INSERT INTO `caropt` VALUES ('10', 'A1', '减少：3辆', '销售');
INSERT INTO `caropt` VALUES ('11', 'A1', '增加：10俩', '购买');
INSERT INTO `caropt` VALUES ('12', 'A1', '减少：10辆', '卖出');
INSERT INTO `caropt` VALUES ('13', 'A2', '减少：3辆', '损3');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `userId` int(25) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `tel` varchar(22) DEFAULT NULL,
  `sfz` varchar(22) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` varchar(255) DEFAULT NULL,
  `stu_name` varchar(255) DEFAULT NULL,
  `stu_major` varchar(255) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('123', '999', '999', '999', '999');
INSERT INTO `student` VALUES ('789', '333', '231', '23', '23');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `identity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '111', 'manager');
INSERT INTO `user` VALUES ('2', 'zhangsan', 'zhangsan', 'user');
INSERT INTO `user` VALUES ('3', '111', '111', 'user');
INSERT INTO `user` VALUES ('4', '123', '1', 'manager');
