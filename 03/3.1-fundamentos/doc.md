# Documento docente · 3.1

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 3:** Programación concurrente. **Horas de la unidad en el programa:** 40. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.

## Indicadores de logro

- **IL3.1:** Aplica conceptos y herramientas basadas en el uso de programación concurrente para el desarrollo de aplicaciones multitarea.

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Concurrencia y paralelismo](material.md#concepto-1) | RA1: Concurrencia y paralelismo son conceptos distintos. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con concurrencia y paralelismo. |
| [1.2. Estado compartido y condición de carrera](material.md#concepto-2) | RA1: Una carrera puede perder actualizaciones. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con estado compartido y condición de carrera. |
| [1.3. Atomicidad, visibilidad y orden](material.md#concepto-3) | RA1: Visibilidad no implica atomicidad. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con atomicidad, visibilidad y orden. |
| [1.4. Diseño con menos estado compartido](material.md#concepto-4) | RA1: Las invariantes son mejores que el orden de println. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con diseño con menos estado compartido. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta CarreraDemo, interpreta la salida y justifica los casos. |
| [3. PC3.1](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

La importación de archivos y la recepción de lecturas pueden coincidir con consultas del usuario. CampusMonitor necesita mantener varias actividades en progreso sin asumir un orden de ejecución accidental.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Dos incrementos coordinados sin protección: Se pierde una actualización.
- Dos incrementos atómicos: Resultado 2.
- volatile y contador++: La operación compuesta sigue sin ser atómica.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
