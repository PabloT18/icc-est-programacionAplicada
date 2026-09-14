# Documento docente · 1.2

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../programa-analitico.pdf), páginas 2 y 3.

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
| [1.1. Invariancia de los tipos parametrizados](material.md#concepto-1) | RA1: List es invariante. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con invariancia de los tipos parametrizados. |
| [1.2. Productores con extends](material.md#concepto-2) | RA1: extends permite leer el tipo acotado. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con productores con extends. |
| [1.3. Consumidores con super](material.md#concepto-3) | RA1: super permite escribir el tipo acotado. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con consumidores con super. |
| [1.4. Captura y límites del contrato](material.md#concepto-4) | RA1: PECS depende del uso del parámetro. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con captura y límites del contrato. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL1.2 | Ejecuta ComodinesDemo, interpreta la salida y justifica los casos. |
| [3. PC1.2](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL1.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Las lecturas de temperatura son Double, pero una utilidad de cálculo puede aceptar Number. La herencia entre Integer, Double y Number no se propaga automáticamente a List. El diseño de la firma determina qué se puede leer y escribir de forma segura.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Origen Integer, destino Number: Copia válida.
- Destino List.of: Precondición incumplida documentada.
- Origen vacío: Destino permanece igual.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
