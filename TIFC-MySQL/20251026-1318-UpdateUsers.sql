
/*
UPDATE table SET field1 = value1, field2 = valu2;

UPDATE table SET field1 = value1, field2 = valu2 WHERE id = id_number;

*/
UPDATE users
SET
  created_at = "2024-12-12 07:00:01",
  updated_at = "2024-12-12 07:00:02"
WHERE id = 1;

/*
 Modificar el ID 1 con 
 name: Juan
 last_name: Páramo
*/
UPDATE users
SET
  first_name = "Juan",
  last_name = "Páramo"
WHERE id = 1;
  
SELECT * FROM users;
