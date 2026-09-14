# Documento docente · 2.4

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
| [1.1. Lectura incremental y codificación](material.md#concepto-1) | RA1: La lectura por flujo evita cargar todo el archivo. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con lectura incremental y codificación. |
| [1.2. Reconocimiento, conversión y modelo](material.md#concepto-2) | RA1: Reconocer el formato no garantiza un valor válido. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con reconocimiento, conversión y modelo. |
| [1.3. Resumen y trazabilidad](material.md#concepto-3) | RA1: Cada rechazo conserva su número de línea y motivo. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con resumen y trazabilidad. |
| [1.4. Rendimiento y límites](material.md#concepto-4) | RA1: El tamaño de entrada y el costo del patrón necesitan límites. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con rendimiento y límites. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL2.2 | Ejecuta FicherosDemo, interpreta la salida y justifica los casos. |
| [3. PC2.4](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL2.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor recibirá un archivo de tramas. Un error en una línea no debería borrar las lecturas válidas de las demás. Se necesita una importación por flujo, un resumen reproducible y un registro de rechazos con su ubicación.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Archivo con válidas y errores: Continúa y reporta ambas cantidades.
- Ruta inexistente: Error de E/S descriptivo.
- Dos importaciones del mismo archivo: Política de duplicados documentada.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
