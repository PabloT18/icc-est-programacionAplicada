# Documento docente · 4.4

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
| [1.1. Transacción y atomicidad del lote](material.md#concepto-1) | RA2: La transacción define una unidad de confirmación. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con transacción y atomicidad del lote. |
| [1.2. Rollback, errores y estado de la conexión](material.md#concepto-2) | RA2: rollback revierte los cambios pendientes. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con rollback, errores y estado de la conexión. |
| [1.3. Batch y validación](material.md#concepto-3) | RA2: Batch agrupa operaciones; la transacción conserva la atomicidad. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con batch y validación. |
| [1.4. Repository JDBC y pruebas de integración](material.md#concepto-4) | RA2: El servicio coordina la conexión de los repositorios. | IL4.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con repository jdbc y pruebas de integración. |
| [2. Demostración](material.md#demostracion) | RA2: vincula conceptos y ejecución del ejemplo completo. | IL4.2 | Ejecuta TransaccionesDemo, interpreta la salida y justifica los casos. |
| [3. PC4.4](material.md#pc) | RA2: aplica el contenido en una ampliación propia. | IL4.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

La importación debe guardar un lote de lecturas con una política definida: confirmar todo o revertirlo si una operación falla. Además, el repositorio debe preservar la separación entre SQL, reglas del dominio e interfaz.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Lote válido: Todas las filas confirmadas.
- Duplicado a mitad del lote: Ninguna fila nueva.
- Reinicio de aplicación: Lecturas confirmadas siguen disponibles.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
