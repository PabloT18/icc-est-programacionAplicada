# Documento docente · 1.3

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
| [1.1. Borrado y metadatos disponibles](material.md#concepto-1) | RA1: El borrado elimina argumentos; las firmas conservan metadatos. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con borrado y metadatos disponibles. |
| [1.2. Class<T> como token de tipo](material.md#concepto-2) | RA1: Class<T> permite conversiones comprobadas. | IL1.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con class<t> como token de tipo. |
| [1.3. Anotaciones y descubrimiento controlado](material.md#concepto-3) | RA1: Las anotaciones describen información accesible por reflexión. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con anotaciones y descubrimiento controlado. |
| [1.4. Costo y alternativa explícita](material.md#concepto-4) | RA1: La reflexión debe respetar contratos y acceso. | IL1.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con costo y alternativa explícita. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL1.2 | Ejecuta ReflexionDemo, interpreta la salida y justifica los casos. |
| [3. PC1.3](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL1.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor puede registrar proveedores de sensores por nombre y crear adaptadores bajo demanda. La reflexión permite inspeccionar clases en ejecución, pero debe conservar contratos verificables y respetar el encapsulamiento.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Proveedor registrado: Instancia que implementa el contrato.
- Nombre desconocido: Rechazo sin Class.forName arbitrario.
- Campo List<Double>: Firma de la declaración visible.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
