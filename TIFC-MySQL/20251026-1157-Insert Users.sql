USE monkey_tower;

-- Crear un nuevo registro
/*
   INSERTO INTO table(field1, field2) VALUES (value1, value2);
   INSERTO INTO table(field1, field2) VALUES (value1, value2), (value1, value2);
*/
INSERT INTO users(id, first_name, last_name, email, password, 
phone_number, birth_date, avatar_url, is_active, created_at, updated_at) 
VALUES (1, "John", "Doe", "john.doe@email.com", "1234567",
"5512374859","1990-05-01","https://my-repository.com/01256.png", 1, 
"2025-10-05 09:10:20", "2025-10-05 09:10:20");

-- Insertar un registro sin incluir los campos que pueden ser null
INSERT INTO users(id, first_name, last_name, email, password, 
 is_active, created_at, updated_at) 
VALUES (2, "John", "Doe", "john.doe_duplicate@email.com", "1234567",
 1, "2025-10-05 09:10:20", "2025-10-05 09:10:20");
 
 -- Insertar un registro sin incluir los campos que tiene valores default
 INSERT INTO users(first_name, last_name, email, password)
 VALUES ("John", "Doe", "john.doe_4@email.com", "1234567");
 
 /*
 Insertar 5 registros
 */
 INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Carlos', 'Ramírez', 'carlos.ramirez@gmail.com', 'hashed_pw_1', '+52 55 6243 7812', '1988-04-23', 'https://example.com/avatars/carlos.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('María', 'González', 'maria.gonzalez@hotmail.com', 'hashed_pw_2', '+52 33 1728 9034', '1992-11-10', 'https://example.com/avatars/maria.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Jorge', 'Hernández', 'jorgeh77@yahoo.com', 'hashed_pw_3', '+52 81 4567 2290', '1977-06-15', 'https://example.com/avatars/jorge.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Ana', 'López', 'ana.lopez@gmail.com', 'hashed_pw_4', '+52 55 9182 4411', '1996-01-30', 'https://example.com/avatars/ana.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Luis', 'Martínez', 'luis.mtz@hotmail.com', 'hashed_pw_5', '+52 222 643 5821', '1983-09-05', 'https://example.com/avatars/luis.jpg', 0, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Fernanda', 'Santos', 'fernanda.santos@gmail.com', 'hashed_pw_6', '+52 664 872 3345', '1999-07-19', 'https://example.com/avatars/fernanda.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Ricardo', 'Torres', 'ricardo.torres@outlook.com', 'hashed_pw_7', '+52 55 7209 1143', '1990-03-08', 'https://example.com/avatars/ricardo.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Sofía', 'Pérez', 'sofia.perez@gmail.com', 'hashed_pw_8', '+52 33 5129 6677', '2001-12-01', 'https://example.com/avatars/sofia.jpg', 1, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Miguel', 'Navarro', 'miguel.navarro@yahoo.com', 'hashed_pw_9', '+52 81 3982 7401', '1985-05-27', 'https://example.com/avatars/miguel.jpg', 0, NOW(), NOW());

INSERT INTO users (first_name, last_name, email, password, phone_number, birth_date, avatar_url, is_active, created_at, updated_at)
VALUES ('Daniela', 'Cruz', 'daniela.cruz@gmail.com', 'hashed_pw_10', '+52 55 2143 9987', '1994-02-14', 'https://example.com/avatars/daniela.jpg', 1, NOW(), NOW());

 
 SELECT * FROM users;