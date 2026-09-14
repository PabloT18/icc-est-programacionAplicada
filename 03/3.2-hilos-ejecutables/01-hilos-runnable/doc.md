# Documento docente · 3.2a

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
| [1.1. Runnable y ciclo de vida](material.md#concepto-1) | RA1: Runnable describe la tarea; start inicia otro hilo. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con runnable y ciclo de vida. |
| [1.2. Unión con join](material.md#concepto-2) | RA1: join espera la terminación y hace visibles sus resultados. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con unión con join. |
| [1.3. Interrupción cooperativa](material.md#concepto-3) | RA1: interrupt solicita una cancelación cooperativa. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con interrupción cooperativa. |
| [1.4. Coordinación sin esperar por azar](material.md#concepto-4) | RA1: Una señal explícita coordina mejor que un sleep arbitrario. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con coordinación sin esperar por azar. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta HilosDemo, interpreta la salida y justifica los casos. |
| [3. PC3.2a](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Una recepción simulada debe comenzar, producir lecturas y detenerse cuando el usuario lo solicite. Runnable define el trabajo y Thread controla una ejecución concreta de ese trabajo.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Inicio y cancelación: Termina y libera recursos.
- Llamar run directamente: Se ejecuta en el hilo llamador.
- Segundo start en el mismo Thread: Uso inválido del ciclo de vida.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
