/*
 Navicat Premium Data Transfer

 Source Server         : 122.51.36.247
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : 122.51.36.247:3306
 Source Schema         : yuehe_led

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 21/02/2021 20:38:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for led_ip_info
-- ----------------------------
DROP TABLE IF EXISTS `led_ip_info`;
CREATE TABLE `led_ip_info`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `modify_time` datetime(0) NOT NULL COMMENT '修改时间',
  `device_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备id',
  `device_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备名称',
  `ip` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'ip，服务端的',
  `port` int(255) NOT NULL COMMENT '端口，服务端的',
  `status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'led状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
