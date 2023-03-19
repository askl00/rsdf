/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50741
Source Host           : localhost:3306
Source Database       : rsck

Target Server Type    : MYSQL
Target Server Version : 50741
File Encoding         : 65001

Date: 2023-03-19 20:48:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rsdf_entry
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_entry`;
CREATE TABLE `rsdf_entry` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='词条表';

-- ----------------------------
-- Records of rsdf_entry
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_entry_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_entry_property`;
CREATE TABLE `rsdf_entry_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `entry_id` bigint(20) NOT NULL COMMENT '词条id',
  `property_id` bigint(20) NOT NULL COMMENT '属性id',
  `property` int(3) NOT NULL COMMENT '概率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='词条属性表';

-- ----------------------------
-- Records of rsdf_entry_property
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_event
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_event`;
CREATE TABLE `rsdf_event` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `time_id` datetime NOT NULL COMMENT '时间id',
  `name` varchar(10) NOT NULL COMMENT '名称',
  `parent_id` bigint(20) NOT NULL COMMENT '父级事件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='事件';

-- ----------------------------
-- Records of rsdf_event
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_event_option
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_event_option`;
CREATE TABLE `rsdf_event_option` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `event_id` bigint(20) NOT NULL COMMENT '选项id',
  `name` varchar(100) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='事件选项';

-- ----------------------------
-- Records of rsdf_event_option
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_event_option_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_event_option_property`;
CREATE TABLE `rsdf_event_option_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `option_id` bigint(20) NOT NULL COMMENT '目标id',
  `property_id` bigint(20) NOT NULL COMMENT '属性id',
  `min_value` int(3) NOT NULL COMMENT '变动最小值',
  `max_value` int(3) NOT NULL COMMENT '变动最大值',
  `change_type` tinyint(1) NOT NULL COMMENT '0=加减 1=百分比',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='事件-属性变动表';

-- ----------------------------
-- Records of rsdf_event_option_property
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_event_probability
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_event_probability`;
CREATE TABLE `rsdf_event_probability` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `event_id` bigint(20) NOT NULL COMMENT '事件id',
  `probability` int(3) NOT NULL COMMENT '概率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='事件概率表';

-- ----------------------------
-- Records of rsdf_event_probability
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_event_probability_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_event_probability_property`;
CREATE TABLE `rsdf_event_probability_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `event_id` bigint(20) NOT NULL COMMENT '事件id',
  `property_id` bigint(20) NOT NULL COMMENT '属性id',
  `min_value` int(3) NOT NULL COMMENT '最小值',
  `max_value` int(3) DEFAULT NULL COMMENT '最大值',
  `ratio` int(3) NOT NULL COMMENT '系数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='事件-属性概率表';

-- ----------------------------
-- Records of rsdf_event_probability_property
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_event_target_probability
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_event_target_probability`;
CREATE TABLE `rsdf_event_target_probability` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `event_id` bigint(20) NOT NULL COMMENT '事件id',
  `target_id` bigint(20) NOT NULL COMMENT '目标id',
  `probability` int(3) NOT NULL COMMENT '概率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='事件-目标概率表';

-- ----------------------------
-- Records of rsdf_event_target_probability
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_game
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_game`;
CREATE TABLE `rsdf_game` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `distinct_id` varchar(100) NOT NULL COMMENT '游戏唯一标识',
  `game_date` date NOT NULL COMMENT '开始时间',
  `time_start` datetime NOT NULL COMMENT '开始时间',
  `time_end` datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='游戏（记录）表';

-- ----------------------------
-- Records of rsdf_game
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_game_entry
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_game_entry`;
CREATE TABLE `rsdf_game_entry` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `game_id` bigint(20) NOT NULL COMMENT '游戏id',
  `entry_id` bigint(20) NOT NULL COMMENT '目标id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='游戏词条表';

-- ----------------------------
-- Records of rsdf_game_entry
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_game_event
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_game_event`;
CREATE TABLE `rsdf_game_event` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `game_id` bigint(20) NOT NULL COMMENT '游戏id',
  `event_id` datetime NOT NULL COMMENT '开始时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='游戏发生的事件表';

-- ----------------------------
-- Records of rsdf_game_event
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_game_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_game_property`;
CREATE TABLE `rsdf_game_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `game_id` bigint(20) NOT NULL COMMENT '游戏id',
  `property_id` bigint(20) NOT NULL COMMENT '游戏id',
  `value` int(3) NOT NULL COMMENT '属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='游戏人物属性表';

-- ----------------------------
-- Records of rsdf_game_property
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_game_property_record
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_game_property_record`;
CREATE TABLE `rsdf_game_property_record` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `game_property_id` bigint(20) NOT NULL COMMENT '游戏属性id',
  `time_id` bigint(20) DEFAULT NULL COMMENT '时间id',
  `value` int(3) DEFAULT NULL COMMENT '属性值',
  `source` int(3) NOT NULL COMMENT '来源',
  `source_id` bigint(20) NOT NULL COMMENT '来源id',
  `created_time` datetime NOT NULL COMMENT '发生时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='属性变动记录表';

-- ----------------------------
-- Records of rsdf_game_property_record
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_game_target
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_game_target`;
CREATE TABLE `rsdf_game_target` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `game_id` bigint(20) NOT NULL COMMENT '游戏id',
  `target_id` bigint(20) NOT NULL COMMENT '目标id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='游戏目标表';

-- ----------------------------
-- Records of rsdf_game_target
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_property`;
CREATE TABLE `rsdf_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='属性表';

-- ----------------------------
-- Records of rsdf_property
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_target
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_target`;
CREATE TABLE `rsdf_target` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='目标表';

-- ----------------------------
-- Records of rsdf_target
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_target_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_target_property`;
CREATE TABLE `rsdf_target_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `target_id` bigint(20) NOT NULL COMMENT '目标id',
  `property_id` bigint(20) NOT NULL COMMENT '属性id',
  `property_value` int(3) NOT NULL COMMENT '属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='目标-所需属性表';

-- ----------------------------
-- Records of rsdf_target_property
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_time
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_time`;
CREATE TABLE `rsdf_time` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `time_start` datetime NOT NULL COMMENT '开始时间',
  `time_end` datetime NOT NULL COMMENT '结束时间，为空时为时间点',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='时间';

-- ----------------------------
-- Records of rsdf_time
-- ----------------------------

-- ----------------------------
-- Table structure for rsdf_user_property
-- ----------------------------
DROP TABLE IF EXISTS `rsdf_user_property`;
CREATE TABLE `rsdf_user_property` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `property_id` bigint(20) NOT NULL COMMENT '属性id',
  `value` int(3) NOT NULL COMMENT '属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='人物属性表';

-- ----------------------------
-- Records of rsdf_user_property
-- ----------------------------
