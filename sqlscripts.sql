CREATE TABLE `e_portal`.`users` (
  `id` INT NOT NULL,
  `name` VARCHAR(250) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NULL,
  `roleId` VARCHAR(45) NOT NULL,
  `status` TINYINT NOT NULL DEFAULT 0,
  `created_at` DATETIME NULL,
  `updated_at` DATETIME NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `e_portal`.`user_role` (
  `id` INT NOT NULL,
  `role_name` VARCHAR(250) NOT NULL,
  `status` TINYINT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));
  
  
 