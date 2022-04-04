INSERT INTO `student_debate`.`roles` (`role_id`, `role_name`) VALUES ('1', 'ADMIN');
INSERT INTO `student_debate`.`roles` (`role_id`, `role_name`) VALUES ('2', 'USER');
INSERT INTO `student_debate`.`roles` (`role_id`, `role_name`) VALUES ('3', 'CLERK');


INSERT INTO `student_debate`.`users` (`user_id`, `password`, `username`) VALUES ('1', '$2a$12$q6HckffhGEeykVH8IHBCI.NQQA.cm9QdFSwgx5nqVfX8xQKkrOOtG', 'kungle');
INSERT INTO `student_debate`.`users` (`user_id`, `password`, `username`) VALUES ('2', '$2a$12$q6HckffhGEeykVH8IHBCI.NQQA.cm9QdFSwgx5nqVfX8xQKkrOOtG', 'basil');
INSERT INTO `student_debate`.`users` (`user_id`, `password`, `username`) VALUES ('3', '$2a$12$q6HckffhGEeykVH8IHBCI.NQQA.cm9QdFSwgx5nqVfX8xQKkrOOtG', 'veena');
INSERT INTO `student_debate`.`users` (`user_id`, `password`, `username`) VALUES ('4', '$2a$12$q6HckffhGEeykVH8IHBCI.NQQA.cm9QdFSwgx5nqVfX8xQKkrOOtG', 'geetha');




INSERT INTO `user_roles` VALUES ('1', '1');
INSERT INTO `user_roles` VALUES ('4', '1');
INSERT INTO `user_roles` VALUES ('2', '3');
INSERT INTO `user_roles` VALUES ('3', '2');