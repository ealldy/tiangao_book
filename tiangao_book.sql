/*
 Navicat Premium Data Transfer

 Source Server         : 云服务器
 Source Server Type    : MySQL
 Source Server Version : 50173
 Source Host           : 106.12.85.83:3306
 Source Schema         : tiangao_book

 Target Server Type    : MySQL
 Target Server Version : 50173
 File Encoding         : 65001

 Date: 28/07/2020 10:40:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `no` int(11) NOT NULL AUTO_INCREMENT COMMENT '图书编号',
  `type_no` int(11) NOT NULL COMMENT '分类编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '图书名字',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '价格',
  `pub_time` date NULL DEFAULT NULL COMMENT '出版日期',
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '作者',
  `pub_company` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '出版社',
  PRIMARY KEY (`no`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 1, '走进猎户座', 29.00, '2009-06-01', '张三', '天文社');
INSERT INTO `book` VALUES (2, 2, '一万个为什么', 39.98, '2020-03-18', '李四', '科学社');
INSERT INTO `book` VALUES (3, 1, '撒哈拉的形成', 19.88, '2006-07-01', '王五', '地质大学出版社');

-- ----------------------------
-- Table structure for booktype
-- ----------------------------
DROP TABLE IF EXISTS `booktype`;
CREATE TABLE `booktype`  (
  `no` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`no`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of booktype
-- ----------------------------
INSERT INTO `booktype` VALUES (1, '天文地理');
INSERT INTO `booktype` VALUES (2, '历史科学');

SET FOREIGN_KEY_CHECKS = 1;
