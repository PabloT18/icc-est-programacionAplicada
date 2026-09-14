# Documento docente · 1.1c

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 1:** Programación genérica. **Horas de la unidad en el programa:** 40. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.

## Indicadores de logro

- **IL1.1:** Conoce los fundamentos de la programación genérica y su aplicabilidad en aplicaciones de software.
- **IL1.2:** Diseña y desarrolla aplicaciones basadas en el uso de clases y métodos genéricos

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Boxing y unboxing](material.md#concepto-1) | RA1: Unboxing de null falla; equals compara valores. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con boxing y unboxing. |
| [1.2. foreach y modificación de colecciones](material.md#concepto-2) | RA1: foreach recorre elementos sin exponer el índice. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con foreach y modificación de colecciones. |
| [1.3. var, args y varargs](material.md#concepto-3) | RA1: var infiere un tipo local; args y varargs cumplen roles distintos. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con var, args y varargs. |
| [1.4. Varargs genéricos y heap pollution](material.md#concepto-4) | RA1: Un arreglo varargs genérico exige evitar heap pollution. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con varargs genéricos y heap pollution. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL1.2 | Ejecuta BoxingDemo, interpreta la salida y justifica los casos. |
| [3. PC1.1c](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL1.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

El catálogo ya usa tipos genéricos. Ahora necesitamos cargar varias lecturas, recorrerlas y calcular un promedio. Esta operación conecta los tipos primitivos con sus envoltorios y obliga a distinguir inferencia local, argumentos de consola y cantidad variable de argumentos.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- promedio 20 22 24: 22.0.
- promedio sin valores: Mensaje de lote vacío, sin división por cero.
- promedio NaN o texto: Entrada rechazada.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
