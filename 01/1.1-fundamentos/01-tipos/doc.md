# Documento docente · 1.1a

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
| [1.1. El problema de Object y del casting](material.md#concepto-1) | RA1: Los genéricos evitan conversiones inseguras al recuperar datos. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con el problema de object y del casting. |
| [1.2. Parámetro de tipo y argumento de tipo](material.md#concepto-2) | RA1: El parámetro declara el contrato; el argumento concreta el tipo. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con parámetro de tipo y argumento de tipo. |
| [1.3. Tipos de referencia y restricciones](material.md#concepto-3) | RA1: Los argumentos genéricos deben ser tipos de referencia. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con tipos de referencia y restricciones. |
| [1.4. Contrato del contenedor e inmutabilidad](material.md#concepto-4) | RA1: final protege la referencia; el dominio todavía exige validación. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con contrato del contenedor e inmutabilidad. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL1.2 | Ejecuta TiposDemo, interpreta la salida y justifica los casos. |
| [3. PC1.1a](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL1.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor debe almacenar identificadores, nombres y lecturas de sensores. Duplicar una clase contenedora por cada tipo repite la lógica. Usar Object acepta mezclas que solo se descubren al recuperar el dato. Una clase genérica expresa la relación entre el dato que entra y el que sale, y permite comprobarla durante la compilación.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- S01, 22.5, °C: Lectura válida y recuperada como Double.
- S02, 18, personas: Lectura válida y recuperada como Integer.
- id vacío o valor null: Error descriptivo de validación.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
