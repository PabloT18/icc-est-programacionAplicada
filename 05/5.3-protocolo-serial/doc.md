# Documento docente · 5.3

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 5:** Interfaz de comunicación. **Horas de la unidad en el programa:** 40. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Integra protocolos de comunicación a aplicaciones de software.

## Indicadores de logro

- **IL5.1:** Desarrolla aplicaciones con capacidad de comunicación serial para entrada y salida de datos entre PCs y dispositivos externos de hardware.

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Puerto, velocidad y formato](material.md#concepto-1) | RA3: El puerto entrega bytes sin fronteras de mensaje. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con puerto, velocidad y formato. |
| [1.2. Contrato del protocolo v1](material.md#concepto-2) | RA3: LF delimita cada trama. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con contrato del protocolo v1. |
| [1.3. Fragmentación, acumulación y límites](material.md#concepto-3) | RA3: El buffer tiene una longitud máxima. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con fragmentación, acumulación y límites. |
| [1.4. Comandos y confirmaciones](material.md#concepto-4) | RA3: ACK confirma el estado aplicado. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con comandos y confirmaciones. |
| [2. Demostración](material.md#demostracion) | RA3: vincula conceptos y ejecución del ejemplo completo. | IL5.1 | Ejecuta SerialDemo, interpreta la salida y justifica los casos. |
| [3. PC5.3](material.md#pc) | RA3: aplica el contenido en una ampliación propia. | IL5.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

Una conexión serial entrega bytes, no mensajes completos. Una lectura puede contener media trama o varias tramas juntas. CampusMonitor necesita un protocolo con delimitador, longitud máxima, validación y confirmaciones.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- DATA;1;512 dividida en tres lecturas: Una trama válida.
- Dos líneas en el mismo bloque: Dos mensajes.
- Más de 80 caracteres: Descarta hasta LF y continúa.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
