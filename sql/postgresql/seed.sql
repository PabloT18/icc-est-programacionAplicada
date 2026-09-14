BEGIN;
INSERT INTO sensor(id,ubicacion,magnitud,unidad) VALUES
 ('T001','Laboratorio 1','temperatura','C'),
 ('O001','Biblioteca','ocupacion','PERSONAS'),
 ('A001','Mesa Arduino','posicion','PCT') ON CONFLICT(id) DO NOTHING;
INSERT INTO sesion(id) VALUES ('00000000-0000-0000-0000-000000000001') ON CONFLICT(id) DO NOTHING;
INSERT INTO lectura(sesion_id,sensor_id,secuencia,valor,unidad) VALUES
 ('00000000-0000-0000-0000-000000000001','T001',1,22.5,'C'),
 ('00000000-0000-0000-0000-000000000001','T001',2,24.0,'C')
 ON CONFLICT(sesion_id,sensor_id,secuencia) DO NOTHING;
COMMIT;
