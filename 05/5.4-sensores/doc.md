# Documento docente · 5.4

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
| [1.1. Señal, resolución y referencia](material.md#concepto-1) | RA3: Resolución y exactitud son diferentes. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con señal, resolución y referencia. |
| [1.2. Calibración de dos puntos](material.md#concepto-2) | RA3: La calibración necesita referencias medidas. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con calibración de dos puntos. |
| [1.3. Filtrado y latencia](material.md#concepto-3) | RA3: La media móvil agrega latencia. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con filtrado y latencia. |
| [1.4. Tiempo, secuencia y ESP32](material.md#concepto-4) | RA3: Raw y datos convertidos deben conservarse separados. | IL5.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con tiempo, secuencia y esp32. |
| [2. Demostración](material.md#demostracion) | RA3: vincula conceptos y ejecución del ejemplo completo. | IL5.1 | Ejecuta SensoresDemo, interpreta la salida y justifica los casos. |
| [3. PC5.4](material.md#pc) | RA3: aplica el contenido en una ampliación propia. | IL5.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

La aplicación ya recibe cuentas ADC. Para mostrarlas con significado debemos transformar la señal, describir su incertidumbre y distinguir lectura cruda, filtrado y calibración.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- raw igual al mínimo: 0 %.
- máximo igual al mínimo: Configuración rechazada.
- Cambio brusco: Filtro suaviza con latencia observable.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
