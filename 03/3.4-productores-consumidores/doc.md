# Documento docente · 3.4

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
| [1.1. Cola acotada y contrapresión](material.md#concepto-1) | RA1: Una cola acotada limita la acumulación. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con cola acotada y contrapresión. |
| [1.2. wait y notify como fundamento](material.md#concepto-2) | RA1: wait libera el monitor y debe comprobarse dentro de un while. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con wait y notify como fundamento. |
| [1.3. Señal de terminación y número de consumidores](material.md#concepto-3) | RA1: Se requiere una señal de fin por consumidor. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con señal de terminación y número de consumidores. |
| [1.4. Orden y consistencia de resultados](material.md#concepto-4) | RA1: FIFO no garantiza el orden de finalización. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con orden y consistencia de resultados. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta ColaDemo, interpreta la salida y justifica los casos. |
| [3. PC3.4](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Un lector de archivos o un puerto serial produce lecturas a su propia velocidad. El procesamiento y almacenamiento consumen esas lecturas. Una cola separa ambos ritmos y obliga a decidir qué sucede cuando la producción supera la capacidad.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- 100 entradas y 2 consumidores: Cada entrada clasificada una vez.
- Cola llena: Se aplica la política de contrapresión.
- Cancelación durante espera: Todos los participantes terminan.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
