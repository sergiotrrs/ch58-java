USE monkey_tower;
SELECT * FROM users;

/* 
La instrucción SELECT en SQL se utiliza para consultar 
datos de una o más tablas en una base de datos. 
Es una de las instrucciones más básicas y poderosas en SQL
, permitiendo recuperar información específica según 
los criterios definidos.
*/

-- Operaciones matemáticas
SELECT 5 + 3; -- 8
SELECT 4 * 5; -- 20
SELECT 6 % 2; -- 0

-- Renombrar el nombre de columnas
SELECT (5 + 3) AS "resultado de sumatoria";

-- Funciones matemáticas
SELECT ABS(-6); -- Valor absoluto de un número
SELECT CEIL(8.1); -- Redondear al número entero superior: 9
SELECT CEIL(8.9); -- 9
SELECT FLOOR(8.1); -- Redondear al número entereo inferior: 8
SELECT FLOOR(8.9); -- 8
SELECT ROUND(8.5); -- Redondea hacía arriba si es .5 o superior: 9
SELECT ROUND(8.49); -- 8
SELECT PI(); -- 3.141593
SELECT RAND(); -- número aleatorio entre 0 y 1 (sin incluir)

-- Seleccionar todos los campos(*) de una tabla
SELECT * FROM users;

-- Especificar los campos de una tabla
SELECT id, first_name, last_name, email FROM users;

