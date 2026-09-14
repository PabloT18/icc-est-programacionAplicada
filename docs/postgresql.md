# PostgreSQL para CampusMonitor

Usa una versión estable y soportada de PostgreSQL disponible en tu laboratorio. La versión exacta del servidor debe registrarse con `SELECT version()`. El driver del curso está fijado a 42.7.13. Los ejemplos H2 comprueban contratos concretos y no sustituyen las pruebas en PostgreSQL.

## Preparación

Crea una base `campus` y un usuario con permisos sobre esa base siguiendo el procedimiento del laboratorio. Ejecuta con ese usuario los scripts `sql/postgresql/schema.sql` y `seed.sql`. El esquema es aditivo para el inicio; los cambios posteriores deben realizarse mediante migraciones versionadas.

```bash
psql -h localhost -U campus_app -d campus -f sql/postgresql/schema.sql
psql -h localhost -U campus_app -d campus -f sql/postgresql/seed.sql
```

## Configuración de Java

Define `PAP_DB_URL=jdbc:postgresql://localhost:5432/campus`, `PAP_DB_USER=campus_app` y `PAP_DB_PASSWORD` en tu terminal o configuración privada del IDE. No escribas la contraseña en Git. La clase Config carga primero YAML y aplica explícitamente esas variables.

Desde demostraciones ejecuta `./gradlew runDemo -Pdemo=4.2a`. El programa debe mostrar PostgreSQL y Conexión: 1. El resto de demostraciones aisladas H2 mantienen su base efímera para no alterar el esquema del estudiante.

## Comprobación

Ejecuta las consultas incluidas, confirma dos lecturas semilla de T001 y verifica que O001 y A001 aparecen sin lecturas. Prueba una clave foránea inválida y un duplicado de sesión, sensor y secuencia dentro de una transacción que después reviertas.

Para una instancia remota usa TLS y validación del certificado según la configuración institucional. El ejemplo localhost no pretende definir la seguridad de un servidor publicado.
