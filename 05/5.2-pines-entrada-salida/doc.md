# Documento docente · 5.2

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
| [1.1. Entradas y pull-up](material.md#concepto-1) | RA3: INPUT_PULLUP produce una entrada activa en bajo. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con entradas y pull-up. |
| [1.2. Rebote y detección de flanco](material.md#concepto-2) | RA3: El rebote puede generar múltiples transiciones. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con rebote y detección de flanco. |
| [1.3. Salida digital y PWM](material.md#concepto-3) | RA3: PWM regula el ciclo de trabajo de una señal digital. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con salida digital y pwm. |
| [1.4. Entrada física y estado de aplicación](material.md#concepto-4) | RA3: La acción se asocia al flanco estable. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con entrada física y estado de aplicación. |
| [2. Demostración](material.md#demostracion) | RA3: vincula conceptos y ejecución del ejemplo completo. | IL5.1 | Ejecuta Pines, interpreta la salida y justifica los casos. |
| [3. PC5.2](material.md#pc) | RA3: aplica el contenido en una ampliación propia. | IL5.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

El dispositivo debe detectar una acción física y cambiar una salida. Un pulsador real puede rebotar, de modo que una pulsación no equivale automáticamente a un único cambio lógico.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Pulsación mantenida 2 segundos: Una sola alternancia.
- Liberación del botón: No alterna.
- Muestreo durante pulsación: Continúa cada 500 ms.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
