INSERT INTO area VALUES
  (1, 'Kandy'),
  (2, 'Colombo'),
  (3, 'Matale'),
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

INSERT INTO user (id, email, enabled, username, password, status, role_id)
VALUES (1, 'lifeinfocus@hsenid.com', 1, 'lifeinfocus@hsenid.com', '12345', 'ACTIVE', 1);

INSERT INTO `tag` (`id`, `name`, `category`) VALUES
  (1, 'Wedding Photography', 1),
  (2, 'Event Photography', 1),
  (3, 'Wildlife', 1),
  (4, 'Portrait', 1);

INSERT INTO service (id, created_date, description, status, title, category_id, user_id) VALUES
  (1, '2016-07-07 00:00:00',
   'We will provide professional photography service. If you are looking for a wedding, portrait, wildlife or commercial photographer in your area, then one of our fully qualified members will assure you of the highest professional service. Packages available.',
   'ACTIVE', '"Life in Focus" Photography', 1, 1),
  (2, '2016-07-08 00:00:00',
   'We provides excellent and reliable service in 24 hours, 7 days a week, and 365 days a year. We have the largest network of branches and also have enough capability to provide our services island wide, using over 200 well-conditioned vehicles and talented drivers. The principal policy of Fast & Furious Cab service is muscularly based on the concept of providing exceptional and reliable service to its clients',
   'ACTIVE', 'Fast & Furious Travel Solution', 3, 1),
  (3, '2016-07-08 00:00:00',
   'We have something for every taste and budget. Choose options from this collection or use it as a starting point to develop a customized menu for your event. Once you''ve finalized your menu with one of our Sales Managers, you may place your order by phone or email. We do all the rest!.Out door Catering Service,Party Furniture Hiring,Punchi Party Food Delivery...',
   'ACTIVE', 'Delight Catering Service', 4, 1);

INSERT INTO `service_tag` (`service_id`, `tag_id`) VALUES
  (1, 1),
  (1, 2),
  (1, 3),
  (1, 4);

INSERT INTO profile (id, mobile_no, name, summary, user_id)
VALUES (1, '0712345678', 'life in focus', 'Professional Photography Service', 1);
INSERT INTO service_request (id, created_date, description, status, title, assigned_bid_id, category_id, user_id) VALUES
  (1, '2016-07-29 10:18:09', 'I''m searching for a professional wedding photographer for my wedding. ', 'Created',
   'Need a wedding photographer', NULL, 1, 1);

INSERT INTO service_area (service_id, area_id) VALUES (1, 1);
INSERT INTO service_area (service_id, area_id) VALUES (1, 3);
INSERT INTO service_area (service_id, area_id) VALUES (2, 9);
INSERT INTO service_area (service_id, area_id) VALUES (3, 2);
INSERT INTO service_area (service_id, area_id) VALUES (3, 10);

INSERT INTO service_request_area (service_id, area_id) VALUES (1, 1);