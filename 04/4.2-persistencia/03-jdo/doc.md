# Documento docente · 4.2c

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
| [1.1. Estándar JDO y proveedor](material.md#concepto-1) | RA2: JDO necesita una implementación de persistencia. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con estándar jdo y proveedor. |
| [1.2. Metadatos, identidad y enhancement](material.md#concepto-2) | RA2: Los metadatos y el enhancer preparan el modelo persistente. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con metadatos, identidad y enhancement. |
| [1.3. Transacciones y ciclo de vida](material.md#concepto-3) | RA2: Las transacciones siguen siendo explícitas. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con transacciones y ciclo de vida. |
| [1.4. Comparación de responsabilidades](material.md#concepto-4) | RA2: JDO gestiona objetos; JDBC expone operaciones SQL. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con comparación de responsabilidades. |
| [2. Demostración](material.md#demostracion) | RA2: vincula conceptos y ejecución del ejemplo completo. | IL4.1 | Ejecuta JdoDemo, interpreta la salida y justifica los casos. |
| [3. PC4.2c](material.md#pc) | RA2: aplica el contenido en una ampliación propia. | IL4.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

**Alcance de la evidencia:** este contenido aporta fundamentos a IL4.1. El uso de Beans o JDO por sí solo no demuestra IL4.2; la conexión JDBC se comprueba en 4.2a, 4.3, 4.4 y PL4.1.

## Decisiones de secuencia

El programa analítico incluye Java Data Objects. Este contenido implementa una persistencia mínima con JDO para compararla con JDBC, manteniendo JDBC como ruta principal de CampusMonitor.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Persistir y abrir otro administrador: Valor recuperado por identidad.
- Rollback de nueva lectura: Identidad no encontrada después.
- Clase sin enhancement: Identifica el error del proveedor y reconstruye.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
