/* Creamos algunos items */
INSERT INTO items (id ,name, price) VALUES (1,'guitarra', 6000);
INSERT INTO items (id ,name, price) VALUES (2,'libro', 300);
INSERT INTO items (id ,name, price) VALUES (3,'laptop', 15000);

/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('jose','$2a$10$tlFI2s71t5UDwzoP9.eXlucit45JYvpCOnBgyENC2An/OlnWXA.D2',1, 'Jose', 'Barraza','jose.barraza@neoris.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$A.boJFi6G7i9fGsTlaJO5OOb.KTmxGtWl8uB5mdREAo6JIiD5qMqy',1, 'Admin', 'Root','admin@root.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);