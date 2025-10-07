
-- Mostrar TODOS los usuarios con sus direcciones
SELECT 
	u.id,
    u.email,
    a.address
FROM
	users u
INNER JOIN
	addresses a
ON
	u.id = a.user_id;

-- Uso de left Join
SELECT 
	u.id,
    u.email,
    a.address
FROM
	users u
LEFT JOIN
	addresses a
ON
	u.id = a.user_id
ORDER BY u.id;