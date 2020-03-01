CREATE TABLE `goal` (
  `id` BIGINT NOT NULL COMMENT '			',
  `member_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `status` ENUM('active', 'deleted') NOT NULL DEFAULT 'active',
  `type` ENUM('basic', 'time', 'free') NOT NULL DEFAULT 'basic',
  `order` SMALLINT NOT NULL,
  `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE `level_basic` (
  `goal_id` BIGINT NOT NULL,
  `seq` BIGINT NOT NULL COMMENT '	',
  `member_id` BIGINT NOT NULL,
  `label` VARCHAR(45) NOT NULL,
  `value` SMALLINT NOT NULL,
  PRIMARY KEY (`goal_id`, `seq`)
);

CREATE TABLE `archive` (
  `id` BIGINT NOT NULL,
  `goal_id` BIGINT NOT NULL,
  `level_seq` BIGINT NOT NULL,
  `member_id` INT NOT NULL,
  `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);