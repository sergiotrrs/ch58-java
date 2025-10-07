-- Mostrar a los usuarios, con las direcciones asociadas
-- id, nombre, direcciones
SELECT * FROM addresses;

/*
 Los JOINS en SQL se utilizan para combinar filas 
 de dos o más tablas basadas en una columna 
 relacionada entre ellas.

*/
--  Mostrar el nombre del producto, con el nombre de la categoria

SELECT 
	*
FROM
	products -- entidad de la izquierda
INNER JOIN 
	categories -- entidad de la derecha
ON
	products.category_id = categories.id;
    
    
SELECT 
	products.id AS product_id,
    products.name AS product_name,
    categories.id AS category_id,
    categories.name AS category_name,
    price
FROM
	products -- entidad de la izquierda
INNER JOIN 
	categories -- entidad de la derecha
ON
	products.category_id = categories.id;
    
 -- Utilizando Alias en el nombre de las tablas
 SELECT 
	p.id As product_id,
    p.name AS product_name,
    c.id category_id,
    c.name category_name,
    p.price
FROM
	products AS p -- entidad de la izquierda
INNER JOIN 
	categories c -- entidad de la derecha
ON
	p.category_id = c.id;
	
    
 -- Mostrar los usuarios que su correo electrónico sea @gmail.com
 -- Mostrar las direcciones asociadas a esas personas
SELECT 
   concat( first_name, " " ,last_name) AS `User` , email, address
FROM
    users
INNER JOIN
    addresses ON addresses.user_id = users.id
WHERE
    email LIKE '%@gmail.com';
 
    
-- Mostrar los usuarios con los artículos comprados
SELECT 
	u.id,
    u.email,
    o.id AS order_id,
    o.order_date,
    oi.quantity,
    oi.price_at_purchase,
    p.id AS product_id,
    p.name AS product_name
FROM 
	users u
INNER JOIN 
	orders o
ON
	u.id = o.user_id
INNER JOIN 
	order_items oi
ON
	o.id = oi.order_id
INNER JOIN
	products p
ON oi.product_id = p.id;


