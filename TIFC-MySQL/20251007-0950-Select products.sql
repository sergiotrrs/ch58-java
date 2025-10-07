USE monkey_tower;

-- SELECT fields(*) FROM table_name;
SELECT id, name, price FROM products;
SELECT `id`, `name`, `price` FROM `products`;

-- Ordenar los datos por el precio de forma ascendente
SELECT 
    id, name, price
FROM
    products
ORDER BY price ASC;

-- Ordenar los datos por el precio de forma descendente
SELECT 
    id, name, price
FROM
    products
ORDER BY price DESC;

-- Ordenar por precio ascendente y name descedente
SELECT 
    id, name, price
FROM
    products
ORDER BY price ASC, name DESC;

-- Limitar el número de elementos mostrados
SELECT * FROM products LIMIT 10;

SELECT 
    id, name, price
FROM
    products
ORDER BY price ASC, name DESC
LIMIT 10;

-- Limitar el número de elementos con un offset
SELECT 
    id, name, price
FROM
    products
ORDER BY price ASC, name DESC
LIMIT 10 OFFSET 20;

/*
 Funciones de Agregado
 Realizan un cálculo sobre un conjunto de filas
 Devuelve un único valor de resumen.
  - Count() : Cuenta el número de filas
  - SUM() : Suma los valores de una columna
  - AVG() : Calcula el promedio
  - MAX() / MIN() : Obtiene el valor máximo o mínimo
*/
SELECT COUNT(*) FROM products;
SELECT * FROM users;
SELECT COUNT(*) FROM users; -- 31
SELECT COUNT(id) FROM users; -- 31
SELECT COUNT(phone_number) FROM users; -- 30

SELECT COUNT(*) AS total_users
FROM users;

-- Cuál es el precio mayor en los productos?
SELECT MAX(price) AS precio_mayor
FROM products; -- 24999.50

-- Cuál es el precio menor en los productos?
SELECT MIN(price) as precio_menor FROM products; -- 45

/*
Uso de WHERE
La cláusa where se usa para filtrar registros según una condición

 Operadores lógicos
	Operator 	Description
	= 			Equality
	<> 			Nonequality
	!= 			Nonequality
	< 			Less than
	<= 			Less than or equal to
	> 			Greater than
	>= 			Greater than or equal to
	BETWEEN 	Between two specified values
*/
-- Mostrar los produtos que su precio sea mayor a $500
SELECT id, name
FROM products
WHERE price > 500;

-- Cuántos productos cumplieron la condición anterior?
SELECT COUNT(*)
FROM products
WHERE price > 500; -- 22

-- Mostrar los productos en un rango (500 - 800)
SELECT id, name, price
FROM products
WHERE price >= 500 AND price<= 800;  

-- Uso de between
SELECT id, name, price
FROM products
WHERE price BETWEEN 500 AND 800;

-- Mostrar los productos que NO estén en un rango (500 - 800)
SELECT *
FROM products
WHERE price NOT BETWEEN 500 AND 800;

SELECT id, name, price
FROM products
WHERE price < 500 OR price > 800;

-- Filtros con valores null, no se debe usar WHERE campo = null
SELECT * FROM users
WHERE phone_number IS NULL;

-- Valos que NO son nulos
SELECT * FROM users
WHERE phone_number IS NOT NULL;

-- Mostrar solo los productos que sean de la categoria 1, 2 y 4
SELECT id, name, category_id FROM products;

SELECT id, name, category_id
FROM products
WHERE category_id IN (1, 2, 4);

SELECT id, name, category_id 
FROM products
WHERE category_id = 1 OR category_id = 2 OR category_id = 4;

-- Cuántos productos cumplieron con la condición anterior?
select count(*)
from products
where category_id in (1,2,4); -- 12

-- DISTINC :  Eliminar filas duplicadas de un resultado
-- y mostrar solo los valores únicos.
SELECT price FROM products ORDER BY price;
SELECT DISTINCT price FROM products ORDER BY price;

-- Cuántos valorea diferentes de precio tienes?
SELECT COUNT(price) FROM products ORDER BY price; -- 40
SELECT COUNT(DISTINCT price) FROM products ORDER BY price; -- 36

SELECT category_id FROM products;
-- Cuántas categorías realmente estoy usando?
select count( distinct category_id) from products; -- 10

-- Obten los registros que tengan el precio máximo en los productos
SELECT id, name, price
FROM products
ORDER BY price DESC LIMIT 1; -- no se recomienda esta forma

SELECT MAX(price) FROM products; -- 24999.50

-- Consultas anidadas
SELECT id, name, price
FROM products
WHERE price = (SELECT MAX(price) FROM products);

/*
 GROUP BY
 Se usa con funciones de agregado para agrupar filas que
 tienen los mismo valores en una o más columnas
*/
SELECT category_id FROM products;

SELECT category_id, COUNT(category_id) AS elements 
FROM products
GROUP BY category_id;

-- ¿ Cuantos productos por categoria existen?
-- R Todos tiene 4 elementos por categoría

-- Suma total de precio por categoria
-- mostrar de forma descendete por precio
SELECT
    category_id,
    SUM(price) AS precios
FROM
    products
GROUP BY
    category_id
ORDER BY
    precios DESC;

-- Suma total de precio por categoria
-- mostrar de forma descendete por precio
-- PERO solo considerando los precios entre 400-800
select category_id, sum(price) as total_precio
from products
where price between 400 and 800
group by category_id 
order by total_precio desc;

 /*
  El HAVING en SQL se utiliza para filtrar los 
  resultados de grupos creados con GROUP BY, 
  aplicando condiciones a las funciones de agregación 
  (como SUM, AVG, COUNT, etc.).
  
  WHERE filtra antes de agrupar los datos, y HAVING 
  filtra después de agrupar los datos. Esta es una 
  distinción importante; las filas eliminadas por 
  una cláusula WHERE no se incluyen en el grupo.
  
  La eliminación de filas podría cambiar los valores 
  calculados, lo que a su vez podría afectar a qué 
  grupos se filtran basándose en el uso de esos valores 
  en la cláusula HAVING.  
 */
-- Suma total de precio por categoria
-- mostrar de forma descendete por precio
-- PERO solo considerando los precios entre 400-800
-- Solo mostrar las categorias que la suma total 
-- sea superior a $1000
select category_id, sum(price) as total_precio
from products
where price between 400 and 800
group by category_id 
having `total_precio` > 1000
order by total_precio desc;

SELECT 
 id,
 name,
 price AS subtotal,
 price * 1.16 AS total
FROM 
 products;