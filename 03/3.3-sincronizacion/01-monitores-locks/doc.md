# Documento docente · 3.3a

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
| [1.1. Sección crítica e invariante](material.md#concepto-1) | RA1: La sección crítica protege una invariante. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con sección crítica e invariante. |
| [1.2. Métodos y bloques synchronized](material.md#concepto-2) | RA1: synchronized usa un monitor concreto. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con métodos y bloques synchronized. |
| [1.3. ReentrantLock y liberación garantizada](material.md#concepto-3) | RA1: unlock debe ejecutarse en finally. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con reentrantlock y liberación garantizada. |
| [1.4. Deadlock y orden de adquisición](material.md#concepto-4) | RA1: Un orden de locks ayuda a prevenir deadlocks. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con deadlock y orden de adquisición. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta MonitoresDemo, interpreta la salida y justifica los casos. |
| [3. PC3.3a](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Varias tareas pueden intentar registrar el mismo identificador o actualizar un resumen. Proteger operaciones individuales no basta si la regla requiere comprobar y modificar como una única operación.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- 100 intentos sobre 10 IDs: 10 registros.
- Excepción dentro de operación: Lock liberado.
- Consulta durante inserciones: Estado consistente según contrato.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
