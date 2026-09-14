# Documento docente · 5.1

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
| [1.1. IDE, placa y estructura del sketch](material.md#concepto-1) | RA3: El sketch ejecuta setup y loop. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con ide, placa y estructura del sketch. |
| [1.2. Tipos, variables y operadores](material.md#concepto-2) | RA3: Los tamaños de tipos dependen de la placa. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con tipos, variables y operadores. |
| [1.3. Funciones y ciclo no bloqueante](material.md#concepto-3) | RA3: millis permite planificar sin bloquear. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con funciones y ciclo no bloqueante. |
| [1.4. Pines y límites eléctricos](material.md#concepto-4) | RA3: Los pines tienen límites de tensión y corriente. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con pines y límites eléctricos. |
| [2. Demostración](material.md#demostracion) | RA3: vincula conceptos y ejecución del ejemplo completo. | IL5.1 | Ejecuta Fundamentos, interpreta la salida y justifica los casos. |
| [3. PC5.1](material.md#pc) | RA3: aplica el contenido en una ampliación propia. | IL5.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

CampusMonitor recibirá mediciones de un dispositivo físico. Arduino ejecuta un programa en un microcontrolador y Java ejecuta la aplicación del PC. La comunicación permite integrar ambos programas, pero sus tipos, recursos y ciclos de ejecución son diferentes.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Cursor cerca de GND: Cuenta cercana a 0.
- Cursor cerca de 5 V: Cuenta cercana a 1023 en UNO R3.
- Ejecución continua: Muestreo periódico sin delay.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
