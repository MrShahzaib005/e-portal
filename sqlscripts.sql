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
  
  CREATE TABLE `e_portal`.`tenant_company` (
  `id` INT NOT NULL,
  `company_name` VARCHAR(250) NOT NULL,
  `company_email` VARCHAR(250) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `contact_person_name` VARCHAR(250) NOT NULL,
  `contact_person_email` VARCHAR(250) NOT NULL,
  `company_size` INT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `e_portal`.`company_size` (
  `id` INT NOT NULL,
  `comp_size_name` VARCHAR(250) NOT NULL,
  `comp_size_status` TINYINT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `e_portal`.`news_event` (
  `id` INT NOT NULL,
  `event_name` VARCHAR(250) NOT NULL,
  `event_description` TEXT NOT NULL,
  `event_date` DATETIME NOT NULL,
  `event_expiry` DATETIME NOT NULL,
  `event_organizer` VARCHAR(250) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `e_portal`.`news_event` (
  `id` INT NOT NULL,
  `event_name` VARCHAR(250) NOT NULL,
  `event_description` TEXT NOT NULL,
  `event_date` DATETIME NOT NULL,
  `event_expiry` DATETIME NOT NULL,
  `event_organizer` VARCHAR(250) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `e_portal`.`card_type` (
  `id` INT NOT NULL,
  `card_title` VARCHAR(250) NOT NULL,
  `card_status` VARCHAR(50) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `status` TINYINT NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `e_portal`.`complaints` (
  `id` INT NOT NULL,
  `title` VARCHAR(250) NOT NULL,
  `description` TEXT NOT NULL,
  `type` VARCHAR(250) NOT NULL,
  `issue_date` DATETIME NOT NULL,
  `complaint_status` VARCHAR(50) NOT NULL,
  `status` TINYINT NOT NULL,
  `assign_to` VARCHAR(45) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `e_portal`.`parking_tags` (
  `id` INT NOT NULL,
  `tag_name` VARCHAR(250) NOT NULL,
  `issued_to` INT NOT NULL,
  `car_number` VARCHAR(45) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `tag_expiry` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `e_portal`.`gate_pass` (
  `id` INT NOT NULL,
  `name` VARCHAR(250) NOT NULL,
  `issued_to` VARCHAR(250) NOT NULL,
  `issued_by` INT NOT NULL,
  `issued_date` DATETIME NOT NULL,
  `expiry` DATETIME NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `e_portal`.`meeting_room` (
  `id` INT NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `start_time` DATETIME NOT NULL,
  `duration` DATETIME NOT NULL,
  `description` VARCHAR(250) NOT NULL,
  `reserved_by` VARCHAR(45) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `e_portal`.`meeting_locations` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `status` TINYINT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `e_portal`.`petty_cash` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `amount` INT NOT NULL,
  `used_by` VARCHAR(250) NOT NULL,
  `notes` TEXT NOT NULL,
  `requested_by` VARCHAR(250) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`));

  
  
 