# Documento docente · 5.5

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
| [1.1. Arquitectura de la integración](material.md#concepto-1) | RA3: Cada etapa tiene una responsabilidad. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con arquitectura de la integración. |
| [1.2. Identidad, duplicados y reinicios](material.md#concepto-2) | RA3: La sesión diferencia reinicios y duplicados. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con identidad, duplicados y reinicios. |
| [1.3. Errores por etapa y cierre ordenado](material.md#concepto-3) | RA3: Recibida y confirmada son estados distintos. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con errores por etapa y cierre ordenado. |
| [1.4. Simulación y verificación física](material.md#concepto-4) | RA3: La simulación y el hardware requieren evidencias diferentes. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con simulación y verificación física. |
| [2. Demostración](material.md#demostracion) | RA3: vincula conceptos y ejecución del ejemplo completo. | IL5.1 | Ejecuta IntegracionDemo, interpreta la salida y justifica los casos. |
| [3. PC5.5](material.md#pc) | RA3: aplica el contenido en una ampliación propia. | IL5.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor reúne ahora recepción serial, validación, procesamiento, persistencia y vista. El proyecto final debe coordinar fallos y cierre sin perder la distinción entre una muestra recibida y una muestra confirmada en la base.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Tres tramas válidas: Tres registros confirmados.
- Misma sesión y secuencia: Duplicado identificado.
- Nueva sesión tras reinicio: Secuencia reutilizable sin colisión lógica.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
