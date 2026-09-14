SELECT s.id,s.ubicacion,COUNT(l.id) AS cantidad
FROM sensor s LEFT JOIN lectura l ON l.sensor_id=s.id
GROUP BY s.id,s.ubicacion ORDER BY s.id;

SELECT sensor_id,unidad,AVG(valor) AS promedio
FROM lectura GROUP BY sensor_id,unidad ORDER BY sensor_id,unidad;

SELECT id,sensor_id,secuencia,valor,unidad,recibido
FROM lectura ORDER BY recibido DESC,id DESC LIMIT 20 OFFSET 0;
