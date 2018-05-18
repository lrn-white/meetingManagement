/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : meetingmanagement

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-18 17:30:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for meeting_room
-- ----------------------------
DROP TABLE IF EXISTS `meeting_room`;
CREATE TABLE `meeting_room` (
  `roomID` int(11) NOT NULL AUTO_INCREMENT COMMENT '??????id',
  `roomName` varchar(60) NOT NULL COMMENT '????????',
  `roomCapacity` int(11) NOT NULL COMMENT '??????????',
  `roomLocation` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`roomID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting_room
-- ----------------------------
INSERT INTO `meeting_room` VALUES ('1', '研发会议室', '30', '201');
INSERT INTO `meeting_room` VALUES ('2', '长桌会议室', '30', '202');
INSERT INTO `meeting_room` VALUES ('3', '活动会议室', '100', '304');
INSERT INTO `meeting_room` VALUES ('4', '团购中心会议室', '10', '305');
INSERT INTO `meeting_room` VALUES ('5', '销售中心会议室', '10', '306');
INSERT INTO `meeting_room` VALUES ('6', '开发会议室1', '20', '401');
INSERT INTO `meeting_room` VALUES ('7', '开发会议室2', '20', '402');
INSERT INTO `meeting_room` VALUES ('8', '开发会议室3', '20', '403');
INSERT INTO `meeting_room` VALUES ('9', '开发会议室4', '20', '404');
INSERT INTO `meeting_room` VALUES ('10', '开发会议室5', '20', '405');
INSERT INTO `meeting_room` VALUES ('11', '开发会议时6', '20', '406');
INSERT INTO `meeting_room` VALUES ('17', '开发会议室7', '20', '407');
INSERT INTO `meeting_room` VALUES ('21', '研发会议室19', '20', '405');
INSERT INTO `meeting_room` VALUES ('26', '1', '1', '1');
INSERT INTO `meeting_room` VALUES ('27', '2', '2', '2');
INSERT INTO `meeting_room` VALUES ('28', '3', '3', '3');
INSERT INTO `meeting_room` VALUES ('29', '6', '6', '6');

-- ----------------------------
-- Table structure for meeting_room_time
-- ----------------------------
DROP TABLE IF EXISTS `meeting_room_time`;
CREATE TABLE `meeting_room_time` (
  `timeID` int(11) NOT NULL AUTO_INCREMENT COMMENT '开放时间id',
  `weekTime` varchar(20) NOT NULL COMMENT '周时间',
  `dayTime` varchar(30) NOT NULL COMMENT '天时间',
  PRIMARY KEY (`timeID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting_room_time
-- ----------------------------
INSERT INTO `meeting_room_time` VALUES ('1', 'monday', '9:30~10:30');
INSERT INTO `meeting_room_time` VALUES ('2', 'monday', '10:30~11:30');
INSERT INTO `meeting_room_time` VALUES ('3', 'monday', '13:30~14:30');
INSERT INTO `meeting_room_time` VALUES ('4', 'monday', '14:30~15:30');
INSERT INTO `meeting_room_time` VALUES ('5', 'monday', '15:30~16:30');
INSERT INTO `meeting_room_time` VALUES ('6', 'monday', '16:30~17:30');
INSERT INTO `meeting_room_time` VALUES ('7', 'Tuesday', '9:30~10:30');
INSERT INTO `meeting_room_time` VALUES ('8', 'Tuesday', '10:30~11:30');
INSERT INTO `meeting_room_time` VALUES ('9', 'Tuesday', '13:30~14:30');
INSERT INTO `meeting_room_time` VALUES ('10', 'Tuesday', '14:30~15:30');
INSERT INTO `meeting_room_time` VALUES ('11', 'Tuesday', '15:30~16:30');
INSERT INTO `meeting_room_time` VALUES ('12', 'Tuesday', '16:30~17:30');
INSERT INTO `meeting_room_time` VALUES ('13', 'Wednesday', '9:30~10:30');
INSERT INTO `meeting_room_time` VALUES ('14', 'Wednesday', '10:30~11:30');
INSERT INTO `meeting_room_time` VALUES ('15', 'Wednesday', '13:30~14:30');
INSERT INTO `meeting_room_time` VALUES ('16', 'Wednesday', '14:30~15:30');
INSERT INTO `meeting_room_time` VALUES ('17', 'Wednesday', '15:30~16:30');
INSERT INTO `meeting_room_time` VALUES ('18', 'Wednesday', '16:30~17:30');
INSERT INTO `meeting_room_time` VALUES ('19', 'Thursday', '9:30~10:30');
INSERT INTO `meeting_room_time` VALUES ('20', 'Thursday', '10:30~11:30');
INSERT INTO `meeting_room_time` VALUES ('21', 'Thursday', '13:30~14:30');
INSERT INTO `meeting_room_time` VALUES ('22', 'Thursday', '14:30~15:30');
INSERT INTO `meeting_room_time` VALUES ('23', 'Thursday', '15:30~16:30');
INSERT INTO `meeting_room_time` VALUES ('24', 'Thursday', '16:30~17:30');
INSERT INTO `meeting_room_time` VALUES ('25', 'Friday', '9:30~10:30');
INSERT INTO `meeting_room_time` VALUES ('26', 'Friday', '10:30~11:30');
INSERT INTO `meeting_room_time` VALUES ('27', 'Friday', '13:30~14:30');
INSERT INTO `meeting_room_time` VALUES ('28', 'Friday', '14:30~15:30');
INSERT INTO `meeting_room_time` VALUES ('29', 'Friday', '15:30~16:30');
INSERT INTO `meeting_room_time` VALUES ('30', 'Friday', '16:30~17:30');

-- ----------------------------
-- Table structure for meeting_room_use_record
-- ----------------------------
DROP TABLE IF EXISTS `meeting_room_use_record`;
CREATE TABLE `meeting_room_use_record` (
  `recordID` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录id',
  `applicantName` varchar(20) NOT NULL COMMENT '申请人姓名',
  `participantName` varchar(20) NOT NULL COMMENT '参会人员姓名',
  `openWeekTime` varchar(60) NOT NULL COMMENT '开会周时间',
  `openDayTime` varchar(60) NOT NULL COMMENT '开会日时间',
  `meetingRoomName` varchar(60) NOT NULL COMMENT '会议室名',
  `openDateTime` varchar(60) NOT NULL COMMENT '开会日期',
  PRIMARY KEY (`recordID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting_room_use_record
-- ----------------------------

-- ----------------------------
-- Table structure for sys_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_resources`;
CREATE TABLE `sys_resources` (
  `resourceID` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `resourceName` varchar(60) DEFAULT NULL COMMENT '资源名',
  `resourceUrl` varchar(60) DEFAULT NULL COMMENT '资源路径',
  PRIMARY KEY (`resourceID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resources
-- ----------------------------
INSERT INTO `sys_resources` VALUES ('1', '查看所有会议室', '/meetingroom/getAllMeetingRoom');
INSERT INTO `sys_resources` VALUES ('2', '测试1', '/test1');
INSERT INTO `sys_resources` VALUES ('3', '测试2', '/test');
INSERT INTO `sys_resources` VALUES ('4', '测试3', '/test3');
INSERT INTO `sys_resources` VALUES ('5', '测试4', '/test3');
INSERT INTO `sys_resources` VALUES ('6', '用户管理', '/usersPage');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `roleID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `roleName` varchar(60) DEFAULT NULL COMMENT '角色名',
  PRIMARY KEY (`roleID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'admin');
INSERT INTO `sys_role` VALUES ('2', 'ordinary');

-- ----------------------------
-- Table structure for sys_role_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resources`;
CREATE TABLE `sys_role_resources` (
  `roleID` int(11) DEFAULT NULL COMMENT '角色ID',
  `resourceID` int(11) DEFAULT NULL COMMENT '资源ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_resources
-- ----------------------------
INSERT INTO `sys_role_resources` VALUES ('1', '1');
INSERT INTO `sys_role_resources` VALUES ('1', '2');
INSERT INTO `sys_role_resources` VALUES ('1', '3');
INSERT INTO `sys_role_resources` VALUES ('1', '4');
INSERT INTO `sys_role_resources` VALUES ('1', '5');
INSERT INTO `sys_role_resources` VALUES ('1', '6');
INSERT INTO `sys_role_resources` VALUES ('2', '2');
INSERT INTO `sys_role_resources` VALUES ('2', '3');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT COMMENT '?û?id',
  `userName` varchar(60) NOT NULL COMMENT '?û???',
  `password` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin');
INSERT INTO `sys_user` VALUES ('2', 'user1', 'user1');
INSERT INTO `sys_user` VALUES ('3', 'user2', 'user2');
INSERT INTO `sys_user` VALUES ('4', 'user3', 'user3');
INSERT INTO `sys_user` VALUES ('5', 'user4', 'user4');
INSERT INTO `sys_user` VALUES ('6', 'user5', 'user5');
INSERT INTO `sys_user` VALUES ('7', 'user6', 'user6');
INSERT INTO `sys_user` VALUES ('8', 'user7', 'user7');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `userID` int(11) DEFAULT NULL COMMENT '用户ID',
  `roleID` int(11) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2');
INSERT INTO `sys_user_role` VALUES ('3', '2');
INSERT INTO `sys_user_role` VALUES ('4', '2');
INSERT INTO `sys_user_role` VALUES ('5', '2');
