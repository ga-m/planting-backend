INSERT INTO `goal` (`id`, `member_id`, `name`, `description`, `status`, `type`, `order`, `create_timestamp`, `update_timestamp`) 
VALUES (1, 1, 'test', 'test', 'active', 'basic', 1, '2020-01-01 00:00:00', '2020-01-01 00:00:00');

INSERT INTO `level_basic` (`goal_id`, `seq`, `member_id`, `label`, `value`) 
VALUES (1, 1, 1, 'test', 1);

INSERT INTO `archive` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`) 
VALUES (1, 1, 1, 1, '2020-01-01 00:00:00', '2020-01-01 00:00:00');