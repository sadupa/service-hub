INSERT INTO area VALUES
  (1, 'Kandy'),
  (2, 'Colombo'),
  (3, 'Jaffna'),
  (4, 'Kilinochchi'),
  (5, 'Mannar'),
  (6, 'Mullaitivu'),
  (7, 'Vavuniya'),
  (8, 'Puttalam'),
  (9, 'Kurunegala'),
  (10, 'Gampaha'),
  (11, 'Kalutara'),
  (12, 'Anuradhapura'),
  (13, 'Polonnaruwa');

INSERT INTO category VALUES
  (1, 'Photography'),
  (2, 'Tourism'),
  (3, 'Private Cab'),
  (4, 'Catering'),
  (5, 'Entertainment'),
  (6, 'Electrician'),
  (7, 'Plumbing'),
  (8, 'Computer Repair'),
  (9, 'Baby Sitting'),
  (10, 'Painting'),
  (11, 'Car Mechanic');

INSERT INTO permission (id, description, permission_name, depends_on_permission_id)
VALUES (1, 'Login', 'ROLE_LOGIN', NULL);

INSERT INTO role (id, name) VALUES (1, 'USER1');

INSERT INTO role_permission (role_id, permission_id) VALUES (1, 1);

INSERT INTO `tag` (`id`, `name`, `category`) VALUES
  (1, 'Wedding Photography', 1),
  (2, 'Event Photography', 1);