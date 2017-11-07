use adlister_db;

TRUNCATE ads; #Remove from production
INSERT INTO adlister_db.ads (user_id,title,description)
VALUES('1', 'Mari\'s Title 1', 'Mari\'s Description 1'),
  ('1', 'Mari\'s Title 2', 'Mari\'s Description 2'),
  ('1', 'Mari\'s Title 3', 'Mari\'s Description 3'),
  ('2', 'Art\'s Title 1', 'Art\'s Description 1'),
  ('2', 'Art\'s Title 2', 'Art\'s Description 2'),
  ('2', 'Art\'s Title 3', 'Art\'s Description 3'),
  ('3', 'Tomas\'s Title 1', 'Tomas\'s Description 1'),
  ('3', 'Tomas\'s Title 2', 'Tomas\'s Description 2'),
  ('3', 'Tomas\'s Title 3', 'Tomas\'s Description 3');



