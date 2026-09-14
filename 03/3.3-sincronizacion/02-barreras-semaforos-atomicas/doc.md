# Documento docente · 3.3b

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 3:** Programación concurrente. **Horas de la unidad en el programa:** 40. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.

## Indicadores de logro

- **IL3.1:** Aplica conceptos y herramientas basadas en el uso de programación concurrente para el desarrollo de aplicaciones multitarea.

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Semáforo y capacidad](material.md#concepto-1) | RA1: Semaphore limita la capacidad concurrente. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con semáforo y capacidad. |
| [1.2. Barrera reutilizable y señal de finalización](material.md#concepto-2) | RA1: CyclicBarrier coordina fases; CountDownLatch señala finalización. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con barrera reutilizable y señal de finalización. |
| [1.3. Variables atómicas y operaciones compuestas](material.md#concepto-3) | RA1: AtomicInteger no crea transacciones entre campos. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con variables atómicas y operaciones compuestas. |
| [1.4. Coordinación combinada](material.md#concepto-4) | RA1: Cada mecanismo protege una condición concreta del sistema. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con coordinación combinada. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta CoordinacionDemo, interpreta la salida y justifica los casos. |
| [3. PC3.3b](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

No todas las coordinaciones consisten en bloquear un objeto. CampusMonitor puede limitar conexiones simultáneas, esperar una fase de calibración y contar lecturas completadas con mecanismos distintos.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- 6 tareas, capacidad 2: Nunca más de 2 dentro de la región.
- Fallo de una tarea: Latch liberado en finally.
- Interrupción durante acquire: No aumenta el total de permisos.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
