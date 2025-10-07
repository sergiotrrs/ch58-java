
-- Patrones de búsqueda con LIKE
-- comodín: _ donde puede buscar cualquier caracter
-- comodín: % donde puede buscar n número de caracteres

-- Buscar a las persona que su apellido comience con la letra i
SELECT * FROM users
WHERE last_name = "i"; -- Consulta incorrecta

-- Apellidos que comiencen con la letra m
SELECT * FROM users
WHERE last_name LIKE "m%";

-- Apellidos que termine con la letra e
SELECT * FROM users
WHERE last_name LIKE "%e";

SELECT * FROM users
WHERE last_name LIKE "t%s";

SELECT * FROM users
WHERE last_name LIKE "j____";

-- Buscar todos los usuarios que su correo electrónico sea gmail.com
SELECT * FROM users
WHERE email LIKE "%gmail.com";

-- Funciones de caracteres
-- Concatener los valores de columnas (CONCAT)
-- cantidad de caracteres LENGTH()
-- invertir los caracteres REVERSE()
-- poner en mayúsculas UPPER()
-- poner en minúsculas LOWER()

SELECT 
 id,
 CONCAT(first_name, " ", last_name) AS full_name,
 email
FROM
 users; 
 
-- funciones fecha
SELECT CURDATE(); -- fecha actual
SELECT NOW(); -- fecha y hora actual

-- Diferencia entre fechas
SELECT id, email, DATEDIFF( CURDATE() , birth_date ) AS "días"
from users;

SELECT DATEDIFF( CURDATE() , "2000-02-03" ) AS "días";

-- Filtrar a las personas que cumple años en el mes siguiente:
SELECT email, MONTH(birth_date) FROM users;

SELECT email, MONTH(birth_date) FROM users
WHERE MONTH(birth_date) = 11;

SELECT email, MONTH(birth_date) FROM users
WHERE MONTH(birth_date) = MONTH(CURDATE() + INTERVAL 1 MONTH );

-- Buscar a todas las personas que seal del año 2000 y mes septiembre
SELECT 
	CONCAT(first_name, ' ', last_name) AS full_name,
    YEAR(birth_date) AS año,
    MONTH(birth_date) AS mes
FROM users
WHERE 
	YEAR(birth_date) = 2000 
    AND MONTH(birth_date) = 11;
