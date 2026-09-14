# Documento docente · 3.2b

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 3:** Programación concurrente. **Horas de la unidad en el programa:** 40. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.

## Indicadores de logro

- **IL3.1:** Aplica conceptos y herramientas basadas en el uso de programación concurrente para el desarrollo de aplicaciones multitarea.

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

**Alcance complementario:** ProcessBuilder y ejecutables Unix amplían el tema 3.2. No sustituyen Thread, Runnable, unión e interrupción ni se presentan como un contenido literal adicional del PDF.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Proceso, hilo y ejecutable](material.md#concepto-1) | RA1: Un proceso tiene recursos del sistema operativo. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con proceso, hilo y ejecutable. |
| [1.2. Argumentos y ausencia de shell implícito](material.md#concepto-2) | RA1: ProcessBuilder recibe argumentos separados. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con argumentos y ausencia de shell implícito. |
| [1.3. Salida, errores y cierre](material.md#concepto-3) | RA1: Las salidas sin consumir pueden bloquear. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con salida, errores y cierre. |
| [1.4. Plazos y portabilidad](material.md#concepto-4) | RA1: Un timeout requiere una política de terminación. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con plazos y portabilidad. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta ProcesosDemo, interpreta la salida y justifica los casos. |
| [3. PC3.2b](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

El término ejecutable puede referirse a una tarea Runnable o a un programa del sistema operativo. Son conceptos distintos. Este complemento permite lanzar una herramienta de diagnóstico externa desde Java y controlar su salida y duración.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Herramienta disponible: Salida y código correctos.
- Ejecutable inexistente: IOException controlada.
- Proceso que excede plazo: Cancelación y limpieza.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
