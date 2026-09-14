# Documento docente · 2.2

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
| [1.1. Clases, cuantificadores y agrupación](material.md#concepto-1) | RA1: Los grupos con nombre identifican campos. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con clases, cuantificadores y agrupación. |
| [1.2. Dos niveles de escape](material.md#concepto-2) | RA1: El literal Java y el patrón tienen escapes distintos. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con dos niveles de escape. |
| [1.3. Pattern, Matcher y flags](material.md#concepto-3) | RA1: Pattern se reutiliza; Matcher conserva el estado de búsqueda. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con pattern, matcher y flags. |
| [1.4. Conversión y errores del dominio](material.md#concepto-4) | RA1: La conversión numérica requiere validación posterior. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con conversión y errores del dominio. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL2.2 | Ejecuta RegexDemo, interpreta la salida y justifica los casos. |
| [3. PC2.2](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL2.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Las entradas ya tienen identificadores definidos. La siguiente versión de CampusMonitor debe extraer campos de una línea, convertir un valor decimal y registrar errores útiles sin mezclar reconocimiento con persistencia.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- T001;23.5;C: Temperatura válida.
- O001;12;PERSONAS: Ocupación válida.
- O001;12.5;PERSONAS: Formato numérico válido, regla de dominio rechazada.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
