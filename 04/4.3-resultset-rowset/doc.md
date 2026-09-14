# Documento docente · 4.3

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
| [1.1. Cursor y lectura de columnas](material.md#concepto-1) | RA2: ResultSet se recorre con next. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con cursor y lectura de columnas. |
| [1.2. PreparedStatement y parámetros](material.md#concepto-2) | RA2: PreparedStatement parametriza valores. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con preparedstatement y parámetros. |
| [1.3. RowSet conectado y desconectado](material.md#concepto-3) | RA2: CachedRowSet permite lectura desconectada. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con rowset conectado y desconectado. |
| [1.4. Límite, orden y paginación](material.md#concepto-4) | RA2: La paginación necesita un orden estable. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con límite, orden y paginación. |
| [2. Demostración](material.md#demostracion) | RA2: vincula conceptos y ejecución del ejemplo completo. | IL4.2 | Ejecuta RowSetDemo, interpreta la salida y justifica los casos. |
| [3. PC4.3](material.md#pc) | RA2: aplica el contenido en una ampliación propia. | IL4.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor debe consultar lecturas por sensor y mostrar resultados cuando la conexión ya se cerró. ResultSet y CachedRowSet ofrecen modelos de acceso diferentes y exigen decisiones sobre tamaño, tipos y duración de los recursos.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Filtro S01: Solo lecturas de ese sensor.
- ID con ' OR '1'='1: Se trata como valor literal.
- NULL numérico: Se distingue de cero.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
