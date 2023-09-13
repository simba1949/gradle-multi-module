CREATE DATABASE db_learn CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

USE db_learn;

CREATE TABLE `admin` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

INSERT INTO admin(username, birthday) VALUES('李白', '2023-09-13 00:00:00')
,('杜甫', '2023-09-12 00:00:00')
,('白居易', '2023-09-11 00:00:00')
,('苏轼', '2023-09-10 00:00:00')
;
