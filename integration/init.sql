INSERT INTO permission (id, description, permission_name, depends_on_permission_id) VALUES (1, 'Login', 'ROLE_LOGIN', null);

INSERT INTO role (id, name) VALUES (1, 'USER1');

INSERT INTO role_permission (role_id, permission_id) VALUES (1, 1);