# Documento docente · 4.2a

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 4:** Conexión a bases de datos. **Horas de la unidad en el programa:** 60. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Implementa aplicaciones de software con bases de datos.

## Indicadores de logro

- **IL4.1:** Conoce los fundamentos para persistir datos a través de un lenguaje de programación de alto nivel.
- **IL4.2:** Desarrolla aplicaciones con capacidad de persistir datos usando conexiones JDBC

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. API JDBC y controlador](material.md#concepto-1) | RA2: JDBC es la API; el driver se comunica con el motor. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con api jdbc y controlador. |
| [1.2. Conexiones y cierre de recursos](material.md#concepto-2) | RA2: try-with-resources cierra los recursos incluso ante errores. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con conexiones y cierre de recursos. |
| [1.3. Gradle Kotlin DSL y versiones fijas](material.md#concepto-3) | RA2: Gradle administra el classpath y fija las dependencias. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con gradle kotlin dsl y versiones fijas. |
| [1.4. application.yaml y variables de entorno](material.md#concepto-4) | RA2: Java SE necesita código explícito para cargar YAML. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con application.yaml y variables de entorno. |
| [2. Demostración](material.md#demostracion) | RA2: vincula conceptos y ejecución del ejemplo completo. | IL4.2 | Ejecuta JdbcDemo, interpreta la salida y justifica los casos. |
| [3. PC4.2a](material.md#pc) | RA2: aplica el contenido en una ampliación propia. | IL4.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor debe sustituir datos en memoria por consultas a PostgreSQL. En este punto aparecen un controlador JDBC y una biblioteca de configuración, por lo que Gradle pasa a gestionar versiones y ejecución.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Configuración PostgreSQL válida: SELECT 1 responde.
- Contraseña incorrecta: Error de autenticación sin revelar secreto.
- application.yaml ausente: Error claro de configuración.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
