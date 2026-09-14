# Documento docente · 2.1

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 2:** Expresiones regulares. **Horas de la unidad en el programa:** 20. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.

## Indicadores de logro

- **IL2.1:** Explica los fundamentos de los lenguajes regulares y que sustentan el diseño de expresiones regulares
- **IL2.2:** Implementa algoritmos que emplean expresiones regulares para desarrollar tareas de análisis de textos

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Alfabeto, cadena y lenguaje](material.md#concepto-1) | RA1: Un lenguaje es un conjunto de cadenas. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con alfabeto, cadena y lenguaje. |
| [1.2. Operaciones regulares y autómatas](material.md#concepto-2) | RA1: Un autómata finito resume el prefijo en un estado. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con operaciones regulares y autómatas. |
| [1.3. Expresiones formales y motor de Java](material.md#concepto-3) | RA1: El motor Java incluye extensiones al formalismo regular. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con expresiones formales y motor de java. |
| [1.4. Validación completa y pruebas negativas](material.md#concepto-4) | RA1: matches comprueba toda la entrada; el dominio valida su sentido. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con validación completa y pruebas negativas. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL2.2 | Ejecuta LenguajeDemo, interpreta la salida y justifica los casos. |
| [3. PC2.1](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL2.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor recibirá líneas como S01;23.5. Antes de convertirlas a objetos necesitamos definir qué textos pertenecen al formato aceptado. Una expresión regular describe una estructura léxica y un autómata ayuda a explicar cómo se reconoce.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- T001 y O999: Aceptados.
- T01, A001, XT001: Rechazados.
- T001 en catálogo vacío: Formato válido, entidad ausente.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
