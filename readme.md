sql
```springdataql
CREATE DATABASE `mybatis_plus` ;
use `mybatis_plus`;

/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : mybatis_plus

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 15/10/2023 15:03:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `status` int DEFAULT NULL,
  `create_time` int DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `deleted` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'Jone', 18, 'test1@baomidou.com', NULL, NULL, '2023-10-15', NULL);
INSERT INTO `user` VALUES (2, 'Jack', 20, 'test2@baomidou.com', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (3, 'Tom', 28, 'test3@baomidou.com', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (4, 'Sandy', 21, 'test4@baomidou.com', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (5, 'Billie', 24, 'test5@baomidou.com', NULL, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

————————————————
