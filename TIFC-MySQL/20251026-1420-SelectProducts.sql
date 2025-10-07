/*
 Mostrar de la tabla products los campos
 - id como id_producto
 - name como nombre_producto
 - description como descripcion
*/
SELECT 
    id AS 'id_producto',
    name AS 'nombre_producto',
    description AS 'descripcion'
FROM
    products;