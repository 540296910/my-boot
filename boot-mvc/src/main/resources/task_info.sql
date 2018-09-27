CREATE TABLE `task_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` char(30) DEFAULT NULL,
  `task_name` varchar(255) DEFAULT NULL,
  `task_type` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;