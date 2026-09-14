# Documento docente · 1.1b

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
| [1.1. Declaración y alcance del parámetro](material.md#concepto-1) | RA1: <T> se declara antes del retorno. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con declaración y alcance del parámetro. |
| [1.2. Cotas para exigir operaciones](material.md#concepto-2) | RA1: Las cotas expresan las operaciones necesarias. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con cotas para exigir operaciones. |
| [1.3. Vacío, nulos y decisiones del algoritmo](material.md#concepto-3) | RA1: Optional representa un resultado ausente. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con vacío, nulos y decisiones del algoritmo. |
| [1.4. Método reutilizable y regla del dominio](material.md#concepto-4) | RA1: Comparator separa el criterio del recorrido. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con método reutilizable y regla del dominio. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL1.2 | Ejecuta MetodosDemo, interpreta la salida y justifica los casos. |
| [3. PC1.1b](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL1.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Una vez representadas las lecturas, CampusMonitor necesita seleccionar la mayor lectura y filtrar catálogos. Copiar un método para cada modelo introduce versiones que se desincronizan. Un método genérico permite parametrizar la operación sin exigir que toda la clase sea genérica.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- 22.5, 27.2, 24.0 con umbral 25: Solo 27.2.
- Lista vacía: Lista filtrada vacía y máximo ausente.
- Dos máximos iguales: Desempate documentado.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
