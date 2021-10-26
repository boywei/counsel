INSERT INTO `zero`.`work` (`id`, `line_date`, `hour_number`, `line_id`) VALUES (2, '2021-10-08', 10, 6);
INSERT INTO `zero`.`work` (`id`, `line_date`, `hour_number`, `line_id`) VALUES (2, '2021-10-05', NULL, 7);
INSERT INTO `zero`.`work` (`id`, `line_date`, `hour_number`, `line_id`) VALUES (2, '2021-09-01', 15, 8);
INSERT INTO `zero`.`work` (`id`, `line_date`, `hour_number`, `line_id`) VALUES (2, '2021-08-04', NULL, 9);
INSERT INTO `zero`.`work` VALUES (2, '2021-07-08', 10, 10);

-- 报错:
-- org.flywaydb.core.api.exception.FlywayValidateException: Validate failed: Migrations have failed validation
-- Detected failed migration to version X.X (script_name).
-- Please remove any half-completed changes then run repair to fix the schema history.
-- 或
-- Migration checksum mismatch for migration version 3
-- 修改:
-- 从数据库的flyway_schema_history中删除该版本的更新及对应的内容, 然后重新运行