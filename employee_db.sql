-- Table 'user'
CREATE TABLE user (
  user_id int(11) NOT NULL AUTO_INCREMENT,
  firstname varchar(127),
  lastname varchar(127),
  email varchar(127),
  PRIMARY KEY (user_id)
);

-- Dummy data
INSERT INTO `user` (`user_id`, `firstname`, `lastname`, `email`) VALUES
(1, 'John', 'Smith', 'JohnSmith@test.com'),
(2, 'Jane', 'Smith', 'JaneSmith@test.com'),
(3, 'Bruce', 'Campbell', 'GroovyBruce@hotmail.com'),
(4, 'Test1', 'Test2', 'Test3@test.com');


