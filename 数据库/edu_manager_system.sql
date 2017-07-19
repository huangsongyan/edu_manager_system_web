/*
Navicat MySQL Data Transfer

Source Server         : abcd
Source Server Version : 50133
Source Host           : localhost:3306
Source Database       : edu_manager_system

Target Server Type    : MYSQL
Target Server Version : 50133
File Encoding         : 65001

Date: 2014-07-11 19:14:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `announcement`
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement` (
  `anc_id` int(11) NOT NULL AUTO_INCREMENT,
  `anc_title` varchar(255) DEFAULT NULL,
  `anc_content` text,
  `anc_date` date DEFAULT NULL,
  `anc_publicer` varchar(255) DEFAULT NULL,
  `anc_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`anc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES ('1', '关于十一黄几周放假', '开始的android游戏开发之旅中我们提到了按键和轨迹球... 滑动, View, TextView, 游戏开发相关帖子...诚聘!手机游戏开发 寻找做android游戏开发的你-...', '2014-07-15', '何勇军', '校内');
INSERT INTO `announcement` VALUES ('2', '汉牛杯大赛', '如图所示，自定义一个View,大图上的几张圆形头像是后面加上去的ImageView，下面的那个大圆图片是背景，现在要实现的效果是当我在这个view上滑动时，那几张圆形头像要实现转盘式滑动的效果,即沿着圆形轨迹滑动，求教高手大大！ ', '2014-07-14', '康海刚', '院内');
INSERT INTO `announcement` VALUES ('3', '移动中心', '考试的剑法哦死的念佛艾斯的佛按我都覅那是处女座们新农村，是的发生的佛i哈维偶函数的那双开的呢', '2014-07-08', '和硕县', '校内');
INSERT INTO `announcement` VALUES ('4', '奇偶敌法我', '啥地方还哦啊司机的佛i阿森纳的哦if纳斯one放哪我i恩福克斯的纳税的的', '2014-04-07', '耸了耸', '校内');
INSERT INTO `announcement` VALUES ('5', '2014放假通知', ' 本站讯（通讯员　莫通智） 7月8日上午，广州医科大学卫生职业技术学院学生工作队伍一行共40人来我校开展学生工作经验交流。', '2014-07-13', '刘伟阳', '院内');
INSERT INTO `announcement` VALUES ('6', '国内首个获思科全额奖学', '广东科学技术职业学院计算机学院孙志斌同学通过三轮严格考核，顺利获得思科网络学院“企业领导力项目”的全额奖学金及实习机会，将于2014年3月29日至4月10日赴美国硅谷思科总部实习。这样的名额每年只有两个，且都被211、985这些重点院校的本科生、研究生包揽。孙志斌是国内首个获得该奖学金的高职生。', '2014-07-09', ' 流宏伟', '校内');
INSERT INTO `announcement` VALUES ('7', '小米3抢购', '小米手机终于又要出售了，这次将发售10000台手机供大家强团购', '2014-07-01', '米粉', '院内');
INSERT INTO `announcement` VALUES ('8', '计算机学院学生喜获', '近日，计算机学院孙志斌同学通过三轮严格的考核，顺利获得了思科网络学院“企业领导力项目”的全额奖学金及实习机会，将于2014年3月29日至4月10日赴美国硅谷思科总部实习。这也是国内高职院校的学生首次获得该奖学金。', '2014-07-21', '月掉', '院内');
INSERT INTO `announcement` VALUES ('9', 'wqreqwwer', 'weqrwqe', '2014-07-10', 'werwqe', '班内');
INSERT INTO `announcement` VALUES ('10', 'qweqwe', 'wqeqw', '2014-07-10', 'qweq', '班内');
INSERT INTO `announcement` VALUES ('11', 'dasd', 'asd', '2014-07-17', 'dasd', '班内');
INSERT INTO `announcement` VALUES ('12', 'asd', 'asd', '2014-07-24', 'asdasd', '班内');
INSERT INTO `announcement` VALUES ('13', 'fasd', 'asdasf', '2014-07-23', 'asdas', '班内');
INSERT INTO `announcement` VALUES ('14', 'asd', 'asd', '2014-07-23', 'asd', '班内');
INSERT INTO `announcement` VALUES ('15', 'dasd', 'asd', '2014-07-23', 'asd', '班内');
INSERT INTO `announcement` VALUES ('16', 'dasd', 'asd', '2014-07-25', 'asd', '班内');
INSERT INTO `announcement` VALUES ('17', 'asd', 'sad', '2014-07-22', 'asd', '班内');
INSERT INTO `announcement` VALUES ('18', '电子商务对口交流', '恭贺我校电子商务对口交流支援项目组取得圆满成功', '2014-08-04', '小莫', '校内');
INSERT INTO `announcement` VALUES ('19', '移动应用开发', '广东省高职双师素质移动应用开发', '2014-07-31', '小莫', '院内');
INSERT INTO `announcement` VALUES ('20', '志愿者公益节', '今湾区志愿公益嘉年华首届', '2014-07-24', '米色', '校内');
INSERT INTO `announcement` VALUES ('21', '现代电子制造', '现代电子制造产业的狂潮已经风范', '2014-07-15', '小小', '院内');

-- ----------------------------
-- Table structure for `attendance`
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `attend_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `sub_id` int(11) DEFAULT NULL,
  `attend_date` date DEFAULT NULL,
  `attend_type` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`attend_id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance
-- ----------------------------
INSERT INTO `attendance` VALUES ('1', '1', '1', '2014-06-18', '迟到');
INSERT INTO `attendance` VALUES ('2', '1', '4', '2014-06-20', '旷课');
INSERT INTO `attendance` VALUES ('3', '1', '1', '2014-06-20', '旷课');
INSERT INTO `attendance` VALUES ('4', '1', '2', '2014-07-01', '旷课');
INSERT INTO `attendance` VALUES ('8', '1', '2', '2014-07-01', '请假');
INSERT INTO `attendance` VALUES ('9', '1', '2', '2014-07-01', '旷课');
INSERT INTO `attendance` VALUES ('11', '1', '1', '2014-07-02', '早退');
INSERT INTO `attendance` VALUES ('12', '1', '2', '2014-07-02', '旷课');
INSERT INTO `attendance` VALUES ('13', '2', '2', '2014-07-02', '迟到');
INSERT INTO `attendance` VALUES ('14', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('15', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('16', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('17', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('18', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('19', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('20', '2', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('21', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('22', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('23', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('24', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('25', '1', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('26', '2', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('27', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('28', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('29', '1', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('30', '2', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('31', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('32', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('33', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('34', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('35', '2', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('36', '2', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('37', '2', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('38', '2', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('39', '1', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('40', '1', '1', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('41', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('42', '1', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('43', '1', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('44', '1', '2', '2014-07-10', '早退');
INSERT INTO `attendance` VALUES ('45', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('46', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('47', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('48', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('49', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('50', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('51', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('52', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('53', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('54', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('55', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('56', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('57', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('58', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('59', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('60', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('61', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('62', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('63', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('64', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('65', '1', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('66', '1', '2', '2014-07-10', '迟到');
INSERT INTO `attendance` VALUES ('67', '2', '2', '2014-07-10', '旷课');
INSERT INTO `attendance` VALUES ('68', '2', '2', '2014-07-11', '旷课');
INSERT INTO `attendance` VALUES ('69', '2', '2', '2014-07-11', '旷课');
INSERT INTO `attendance` VALUES ('70', '2', '2', '2014-07-11', '旷课');

-- ----------------------------
-- Table structure for `classes`
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `cla_id` int(11) NOT NULL DEFAULT '0' COMMENT '班级 id',
  `cla_name` varchar(22) NOT NULL COMMENT '班级名称',
  `tec_id` int(11) NOT NULL COMMENT '班主任姓名',
  PRIMARY KEY (`cla_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('1', '12网编2', '1');
INSERT INTO `classes` VALUES ('2', '12网编3', '2');
INSERT INTO `classes` VALUES ('3', '12游软3', '2');
INSERT INTO `classes` VALUES ('4', 'UI1', '1');
INSERT INTO `classes` VALUES ('5', 'UI 2', '3');
INSERT INTO `classes` VALUES ('6', '13思科1', '2');
INSERT INTO `classes` VALUES ('7', '12思科2', '3');
INSERT INTO `classes` VALUES ('8', '11蓝盾1', '3');

-- ----------------------------
-- Table structure for `distribute`
-- ----------------------------
DROP TABLE IF EXISTS `distribute`;
CREATE TABLE `distribute` (
  `dis_id` int(11) NOT NULL AUTO_INCREMENT,
  `cla_id` int(11) DEFAULT NULL,
  `tec_id` int(11) DEFAULT NULL,
  `sub_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`dis_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of distribute
-- ----------------------------
INSERT INTO `distribute` VALUES ('1', '2', '1', '2');
INSERT INTO `distribute` VALUES ('2', '2', '2', '1');
INSERT INTO `distribute` VALUES ('3', '3', '1', '3');

-- ----------------------------
-- Table structure for `examinfo`
-- ----------------------------
DROP TABLE IF EXISTS `examinfo`;
CREATE TABLE `examinfo` (
  `exam_id` int(11) NOT NULL,
  `exam_time` varchar(22) DEFAULT NULL,
  `exam_place` varchar(22) DEFAULT NULL,
  `exam_type` int(11) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `sub_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examinfo
-- ----------------------------
INSERT INTO `examinfo` VALUES ('1', '2014-6-29，8:00-10:00', 'J3-204', '1', '1', '1');
INSERT INTO `examinfo` VALUES ('2', '2014-6-29，10:00-12:00', 'S3-411', '1', '1', '2');
INSERT INTO `examinfo` VALUES ('3', '2014-6-29，8:00-10:00', 'J2-104', '2', '1', '3');
INSERT INTO `examinfo` VALUES ('4', '2014-6-29，10:00-12:00', 'S2-209', '2', '1', '4');

-- ----------------------------
-- Table structure for `file`
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `file_id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(22) DEFAULT NULL,
  `file_date` date DEFAULT NULL,
  `file_url` varchar(22) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `tec_id` int(11) DEFAULT NULL,
  `file_uploader` int(11) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('10', 'pic.jpg', '2014-07-11', 'upload/pic.jpg', '1', '2', '1');
INSERT INTO `file` VALUES ('11', 'daily_zhihu.sql', '2014-07-11', 'upload/daily_zhihu.sql', '1', '2', '1');
INSERT INTO `file` VALUES ('12', 'crash.log', '2014-07-11', 'upload/crash.log', '1', '2', '1');
INSERT INTO `file` VALUES ('13', 'hello.txt', '2014-07-11', 'upload/hello.txt', '1', '2', '2');

-- ----------------------------
-- Table structure for `inform`
-- ----------------------------
DROP TABLE IF EXISTS `inform`;
CREATE TABLE `inform` (
  `inform_id` int(11) NOT NULL,
  `inform_title` varchar(22) NOT NULL,
  `inform_date` time NOT NULL,
  `inform_content` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`inform_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inform
-- ----------------------------

-- ----------------------------
-- Table structure for `major`
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `maj_id` int(11) NOT NULL COMMENT '专业 id',
  `maj_name` varchar(22) DEFAULT NULL COMMENT '专业名称',
  PRIMARY KEY (`maj_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `msg_content` varchar(22) DEFAULT NULL,
  `msg_time` datetime DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `tec_id` int(11) DEFAULT NULL,
  `msg_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '老师你好', '2014-06-25 12:10:41', '1', '2', '1');
INSERT INTO `message` VALUES ('2', '学生1你也好', '2014-06-25 15:11:59', '1', '2', '2');
INSERT INTO `message` VALUES ('3', '请问老师问题可以吗？', '2014-06-26 18:12:06', '1', '2', '1');
INSERT INTO `message` VALUES ('4', '可以呀，欢迎来问', '2014-06-27 17:12:13', '1', '2', '2');
INSERT INTO `message` VALUES ('5', '问题是', '2014-06-20 00:00:00', '2', '2', '1');
INSERT INTO `message` VALUES ('6', '哈哈，学生2你真幽默', '2014-07-03 20:05:31', '2', '2', '2');
INSERT INTO `message` VALUES ('7', '今天打老虎', '2014-07-08 09:23:19', '3', '2', '1');
INSERT INTO `message` VALUES ('14', 'dgd', '2014-07-08 15:41:45', '1', '2', '2');
INSERT INTO `message` VALUES ('15', 'sfdsfd', '2014-07-08 15:43:00', '1', '2', '2');
INSERT INTO `message` VALUES ('16', 'hjghj', '2014-07-09 11:09:42', '1', '2', '2');
INSERT INTO `message` VALUES ('17', 'sfsdf', '2014-07-09 11:10:25', '1', '2', '2');
INSERT INTO `message` VALUES ('18', 'ljlkj', '2014-07-11 17:13:56', '1', '1', '1');
INSERT INTO `message` VALUES ('19', 'jljlk', '2014-07-11 18:13:00', '1', '1', '1');
INSERT INTO `message` VALUES ('20', 'hjkkjh', '2014-07-11 18:13:06', '1', '1', '1');
INSERT INTO `message` VALUES ('21', 'hkjh', '2014-07-11 18:15:40', '3', '2', '2');
INSERT INTO `message` VALUES ('22', '576576', '2014-07-11 18:16:34', '2', '2', '2');
INSERT INTO `message` VALUES ('23', 'gjhgjhg', '2014-07-11 18:17:12', '2', '2', '2');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色 id',
  `role_name` varchar(22) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '学生');
INSERT INTO `role` VALUES ('2', '教师');
INSERT INTO `role` VALUES ('3', '管理员');

-- ----------------------------
-- Table structure for `schedule`
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `sch_id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_id` int(11) DEFAULT NULL,
  `tec_id` int(11) DEFAULT NULL,
  `cla_id` int(11) DEFAULT NULL,
  `sch_week` varchar(22) DEFAULT NULL,
  `sch_day` int(11) DEFAULT NULL,
  `sch_time` int(11) DEFAULT NULL,
  `sch_place` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`sch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schedule
-- ----------------------------
INSERT INTO `schedule` VALUES ('1', '1', '2', '2', '2-18', '1', '1', 'J3-211');
INSERT INTO `schedule` VALUES ('2', '2', '1', '2', '2-16', '1', '2', 'J3-211');
INSERT INTO `schedule` VALUES ('3', '3', '1', '2', '4-18', '1', '3', 's1-511');
INSERT INTO `schedule` VALUES ('4', '0', '0', '2', null, '1', '4', null);
INSERT INTO `schedule` VALUES ('5', '0', '0', '2', null, '1', '5', null);
INSERT INTO `schedule` VALUES ('6', '0', '0', '2', null, '1', '6', null);
INSERT INTO `schedule` VALUES ('7', '4', '2', '2', '6-15', '2', '1', 's4-241');
INSERT INTO `schedule` VALUES ('8', '0', '0', '2', null, '2', '2', null);
INSERT INTO `schedule` VALUES ('9', '2', '3', '1', '6-15', '2', '3', 'J3-308');
INSERT INTO `schedule` VALUES ('10', '0', '0', '2', null, '2', '4', null);
INSERT INTO `schedule` VALUES ('11', '0', '0', '2', null, '2', '5', null);
INSERT INTO `schedule` VALUES ('12', '0', '0', '2', null, '2', '6', null);
INSERT INTO `schedule` VALUES ('13', '1', '1', '2', '6-17', '3', '3', 'J2-409');
INSERT INTO `schedule` VALUES ('14', '0', '0', '2', null, '3', '1', null);
INSERT INTO `schedule` VALUES ('15', '0', '0', '2', null, '3', '2', null);
INSERT INTO `schedule` VALUES ('16', '0', '0', '2', null, '3', '4', null);
INSERT INTO `schedule` VALUES ('17', '0', '0', '2', null, '3', '5', null);
INSERT INTO `schedule` VALUES ('18', '3', '5', '2', '17-18', '3', '6', 'J3-208');
INSERT INTO `schedule` VALUES ('19', '0', '0', '2', null, '4', '1', null);
INSERT INTO `schedule` VALUES ('20', '0', '0', '2', null, '4', '2', null);
INSERT INTO `schedule` VALUES ('21', '0', '0', '2', null, '4', '3', null);
INSERT INTO `schedule` VALUES ('22', '1', '4', '2', '2-17', '4', '4', 'J3-201');
INSERT INTO `schedule` VALUES ('23', '0', '0', '2', null, '4', '5', null);
INSERT INTO `schedule` VALUES ('24', '0', '0', '2', null, '4', '6', null);
INSERT INTO `schedule` VALUES ('25', '0', '0', '2', null, '5', '1', null);
INSERT INTO `schedule` VALUES ('26', '2', '2', '2', '1-18', '5', '2', 's1-302');
INSERT INTO `schedule` VALUES ('27', '3', '1', '2', '2-15', '5', '3', null);
INSERT INTO `schedule` VALUES ('28', '0', '0', '2', null, '5', '4', null);
INSERT INTO `schedule` VALUES ('29', '0', '0', '2', null, '5', '5', null);
INSERT INTO `schedule` VALUES ('30', '0', '0', '2', null, '5', '6', null);
INSERT INTO `schedule` VALUES ('31', '0', '0', '2', null, '6', '1', null);
INSERT INTO `schedule` VALUES ('32', '0', '0', '2', null, '6', '2', null);
INSERT INTO `schedule` VALUES ('33', '0', '0', '2', null, '6', '3', null);
INSERT INTO `schedule` VALUES ('34', '1', '2', '2', '5-6', '6', '4', 'J3-211');
INSERT INTO `schedule` VALUES ('35', '0', '0', '2', null, '6', '5', null);
INSERT INTO `schedule` VALUES ('36', '0', '0', '2', null, '6', '6', null);
INSERT INTO `schedule` VALUES ('37', '0', '0', '2', null, '7', '1', null);
INSERT INTO `schedule` VALUES ('38', '0', '0', '2', '', '7', '2', null);
INSERT INTO `schedule` VALUES ('39', '1', '3', '2', '1-18', '7', '3', 'J2-103');
INSERT INTO `schedule` VALUES ('40', '0', '0', '2', null, '7', '4', null);
INSERT INTO `schedule` VALUES ('41', '0', '0', '2', null, '7', '5', null);
INSERT INTO `schedule` VALUES ('42', '0', '0', '2', null, '7', '6', null);

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `sco_id` int(11) NOT NULL,
  `sco_count` float NOT NULL,
  `stu_id` int(11) NOT NULL,
  `sub_id` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  PRIMARY KEY (`sco_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('1', '97', '1', '1', '1');
INSERT INTO `score` VALUES ('2', '56', '1', '2', '1');
INSERT INTO `score` VALUES ('3', '80', '1', '3', '2');
INSERT INTO `score` VALUES ('4', '90', '1', '2', '2');
INSERT INTO `score` VALUES ('5', '70', '1', '4', '3');
INSERT INTO `score` VALUES ('6', '80', '1', '5', '3');
INSERT INTO `score` VALUES ('7', '80', '1', '6', '4');
INSERT INTO `score` VALUES ('8', '70', '1', '7', '4');
INSERT INTO `score` VALUES ('9', '80', '1', '8', '5');
INSERT INTO `score` VALUES ('10', '90', '1', '9', '5');
INSERT INTO `score` VALUES ('11', '75', '1', '10', '6');
INSERT INTO `score` VALUES ('12', '95', '1', '11', '6');
INSERT INTO `score` VALUES ('13', '85', '1', '12', '1');
INSERT INTO `score` VALUES ('14', '71', '1', '13', '1');
INSERT INTO `score` VALUES ('15', '80', '1', '14', '1');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生 id',
  `stu_no` varchar(22) NOT NULL COMMENT '学生学号',
  `stu_name` varchar(22) NOT NULL COMMENT '学生姓名',
  `stu_sex` enum('男','女') NOT NULL DEFAULT '男' COMMENT '学生性别',
  `stu_birth` date NOT NULL COMMENT '学生生日',
  `stu_pic` varchar(22) NOT NULL COMMENT '学生照片',
  `stu_phone` varchar(22) NOT NULL COMMENT '学生手机电话',
  `stu_address` varchar(22) NOT NULL COMMENT '学生家庭地址',
  `stu_pwd` varchar(22) NOT NULL COMMENT '学生密码',
  `cla_id` int(11) NOT NULL COMMENT '班级 id',
  `stu_card` varchar(22) DEFAULT NULL,
  `stu_pfs` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`stu_id`),
  KEY `stu_sex` (`stu_sex`),
  KEY `stu_no` (`stu_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '4444', '刘六', '男', '2014-06-30', 'person_pic/th_g.png', '13824123487', '油城路', '1111', '3', '44051598459618455', '汽车整容');
INSERT INTO `student` VALUES ('2', '01651418', '李四', '男', '2014-06-29', 'person_pic/th_b.png', '1358498455', '凤凰城', '123456', '2', '440928549851458', '工程造价');
INSERT INTO `student` VALUES ('3', '015654416', '王五', '女', '2014-06-04', 'person_pic/th_c.png', '13824654854', '王府井', '123456', '3', '4402568498845748', '旅游英语');
INSERT INTO `student` VALUES ('4', '0104120649', '张三', '男', '2014-06-17', 'person_pic/th_a.png', '13824123478', '北京路', '123456', '2', '440923196945', '软件技术');

-- ----------------------------
-- Table structure for `subject`
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `sub_id` int(11) NOT NULL COMMENT '科目id',
  `sub_name` varchar(22) NOT NULL COMMENT '科目名称',
  `sub_credit` int(11) DEFAULT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('1', '大学英语', '2');
INSERT INTO `subject` VALUES ('2', '历史', '2');
INSERT INTO `subject` VALUES ('3', '形式与政策', '1');
INSERT INTO `subject` VALUES ('4', '毛概', '1');
INSERT INTO `subject` VALUES ('5', '计算机基础', '2');
INSERT INTO `subject` VALUES ('6', '高数', '2');
INSERT INTO `subject` VALUES ('7', 'sql数据库', '2');
INSERT INTO `subject` VALUES ('8', '网页设计', '2');
INSERT INTO `subject` VALUES ('9', '体育', '2');
INSERT INTO `subject` VALUES ('10', 'java', '2');
INSERT INTO `subject` VALUES ('11', 'sprig', '2');
INSERT INTO `subject` VALUES ('12', 'c语言', '2');
INSERT INTO `subject` VALUES ('13', '体育1', '2');
INSERT INTO `subject` VALUES ('14', '形式与政策', '2');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tec_id` int(11) NOT NULL COMMENT '教师 id',
  `tec_no` varchar(22) NOT NULL,
  `tec_sex` enum('男','女') NOT NULL DEFAULT '男' COMMENT '教师性别',
  `tec_birth` date NOT NULL COMMENT '教师生日',
  `tec_phone` varchar(22) NOT NULL COMMENT '教师手机电话',
  `tec_name` varchar(22) NOT NULL COMMENT '教师姓名',
  `tec_pic` varchar(255) DEFAULT NULL,
  `tec_pwd` varchar(22) NOT NULL,
  PRIMARY KEY (`tec_id`),
  KEY `tec_no` (`tec_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('0', 'null', '男', '2014-06-09', 'null', '小小米线', 'person_pic/th_e.png', '1111');
INSERT INTO `teacher` VALUES ('1', '0204120649', '男', '2014-06-04', '13824123456', 'Mr何', 'person_pic/th_e.png', '1111');
INSERT INTO `teacher` VALUES ('2', '020412305', '男', '2014-06-09', '13854961', '康海刚', 'person_pic/th_f.png', '1111');
INSERT INTO `teacher` VALUES ('3', '4444', '女', '2014-05-22', '13584612151', '何小红', 'person_pic/th_e.png', '222222       ');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户 id',
  `user_name` varchar(22) DEFAULT NULL COMMENT '用户名',
  `user_pwd` varchar(22) DEFAULT NULL COMMENT ' 密码',
  `role_id` int(11) DEFAULT NULL COMMENT '角色 id',
  PRIMARY KEY (`user_id`),
  KEY `user_pk_role` (`role_id`),
  KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
