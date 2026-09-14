# Documento docente · 4.1

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../programa-analitico.pdf), páginas 2 y 3.

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
| [1.1. Relaciones, filas y claves](material.md#concepto-1) | RA2: Las claves identifican filas y relacionan las tablas. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con relaciones, filas y claves. |
| [1.2. Tipos y restricciones del dominio](material.md#concepto-2) | RA2: Las restricciones complementan la validación en Java. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con tipos y restricciones del dominio. |
| [1.3. Operaciones SQL y consultas relacionadas](material.md#concepto-3) | RA2: JOIN relaciona datos; ORDER BY define el orden. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con operaciones sql y consultas relacionadas. |
| [1.4. Esquema reproducible y entorno](material.md#concepto-4) | RA2: Un esquema versionado permite reconstruir el entorno. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con esquema reproducible y entorno. |
| [2. Demostración](material.md#demostracion) | RA2: vincula conceptos y ejecución del ejemplo completo. | IL4.2 | Ejecuta RelacionalDemo, interpreta la salida y justifica los casos. |
| [3. PC4.1](material.md#pc) | RA2: aplica el contenido en una ampliación propia. | IL4.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

El repositorio en memoria pierde su contenido al cerrar CampusMonitor. Una base relacional permite guardar sensores y lecturas con identidades, relaciones y restricciones que sobreviven a la ejecución.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Lectura de sensor existente: Inserción válida.
- Sensor inexistente: Violación de clave foránea.
- Sensor sin lecturas: Aparece con cantidad cero en LEFT JOIN.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
