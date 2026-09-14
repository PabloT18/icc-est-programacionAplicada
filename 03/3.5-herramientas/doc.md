# Documento docente · 3.5

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
| [1.1. ExecutorService, Runnable y Callable](material.md#concepto-1) | RA1: ExecutorService separa la tarea de su ejecución. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con executorservice, runnable y callable. |
| [1.2. Future, timeout y cancelación](material.md#concepto-2) | RA1: Future representa un resultado; el timeout no lo cancela. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con future, timeout y cancelación. |
| [1.3. Hilos virtuales y límites externos](material.md#concepto-3) | RA1: Los hilos virtuales favorecen cargas de espera. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con hilos virtuales y límites externos. |
| [1.4. CompletableFuture y composición](material.md#concepto-4) | RA1: CompletableFuture permite componer resultados dependientes. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con completablefuture y composición. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta EjecutoresDemo, interpreta la salida y justifica los casos. |
| [3. PC3.5](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Crear un Thread para cada trabajo dispersa el control del ciclo de vida. CampusMonitor necesita enviar tareas, recuperar resultados, manejar fallos y cerrar los recursos de ejecución de forma coordinada.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Lote completo: Resultados y ejecutor cerrado.
- Tarea con excepción: Causa original visible.
- Plazo agotado: Política de cancelación y cierre aplicada.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
