# Documento docente · 3.6

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 3:** Programación concurrente. **Horas de la unidad en el programa:** 40. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.

## Indicadores de logro

- **IL3.1:** Aplica conceptos y herramientas basadas en el uso de programación concurrente para el desarrollo de aplicaciones multitarea.

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Event Dispatch Thread](material.md#concepto-1) | RA1: Swing actualiza sus componentes en el EDT. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con event dispatch thread. |
| [1.2. SwingWorker y comunicación](material.md#concepto-2) | RA1: SwingWorker comunica el avance y el resultado al EDT. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con swingworker y comunicación. |
| [1.3. Estado de pantalla y cancelación](material.md#concepto-3) | RA1: Cancelar debe restaurar el estado de la vista. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con estado de pantalla y cancelación. |
| [1.4. Separación MVC](material.md#concepto-4) | RA1: MVC separa datos, presentación y coordinación. | IL3.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con separación mvc. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL3.1 | Ejecuta SwingDemo, interpreta la salida y justifica los casos. |
| [3. PC3.6](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL3.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

El monitor necesita mostrar el avance de una importación sin congelar la ventana. Swing forma parte del JDK y permite concentrarse en la regla de actualización de la interfaz y la separación entre trabajo y presentación.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Importación activa: La ventana repinta y responde.
- Segundo clic: No inicia un trabajo duplicado.
- Cancelar o cerrar: Operación termina y libera recursos.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
