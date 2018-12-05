-- --------------------------------------------------------

--
-- Структура таблиці `users`
--
drop table `users` ;


CREATE TABLE `users` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` varchar(120) NOT NULL,
  `login` varchar(120) NOT NULL,
  `password` varchar(32) NOT NULL,
  `role` varchar(100) NOT NULL,
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isActive` tinyint(1) NOT NULL DEFAULT '1',
   PRIMARY KEY  (`id`),    UNIQUE  (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- Дамп данних таблиці `users`
--

INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Іванов І.І.', 'ivanov', 'pass123', 'admin', 1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES ('Петренко С.В.', 'petrenko', 'p45452', 'user',1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Сидоренко А.В.', 'sidorenko', 'f4543', 'user', 1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Ткаченко П.Л.', 'tkachenko', '4353df3', 'user',1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Біленький А.П.', 'bilenky', '45354123', 'moderator',1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Сіренький О.К.', 'sirenky', 'pee323', 'user',1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Міщенко С.П.', 'mischenko', 'pd333d', 'user', 1);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Козлов П.А', 'kozlov', 'pfdfg34', 'moderator', 0);
INSERT INTO `users` (`name`, `login`, `password`, `role`, `isActive`) VALUES('Герасимчук В.У.', 'gerasimchukr', 'qw22323','user',  1);
