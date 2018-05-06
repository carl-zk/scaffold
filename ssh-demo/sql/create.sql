CREATE TABLE `tbl_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NOT NULL,
  `deleted` bit(1) NOT NULL,
  `update_time` datetime(6) DEFAULT NULL,
  `version` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `weight` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;