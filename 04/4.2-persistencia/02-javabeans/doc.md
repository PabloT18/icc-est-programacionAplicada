# Documento docente · 4.2b

## Fuente curricular

Programa analítico **Programación Aplicada**, código **E-CT-ICO-144**, nivel 3. Fuente: [PDF institucional](../../../programa-analitico.pdf), páginas 2 y 3.

**Unidad 4:** Conexión a bases de datos. **Horas de la unidad en el programa:** 60. No se atribuyen horas oficiales a esta subdivisión.

## Resultado de aprendizaje

> Implementa aplicaciones de software con bases de datos.

## Indicadores de logro

- **IL4.1:** Conoce los fundamentos para persistir datos a través de un lenguaje de programación de alto nivel.
- **IL4.2:** Desarrolla aplicaciones con capacidad de persistir datos usando conexiones JDBC

Los códigos RA e IL utilizados en este repositorio son etiquetas internas de trazabilidad. El PDF no asigna esos códigos a los enunciados.

## Correspondencia con el material

| Punto exacto del MD | Aporte al resultado | Indicador | Evidencia observable |
|---|---|---|---|
| [1.1. Convenciones de propiedades](material.md#concepto-1) | RA2: JavaBeans define convenciones de propiedades. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con convenciones de propiedades. |
| [1.2. Encapsulamiento y validación](material.md#concepto-2) | RA2: Los setters deben preservar las reglas del objeto. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con encapsulamiento y validación. |
| [1.3. Introspección y mapeo](material.md#concepto-3) | RA2: La introspección descubre las propiedades del Bean. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con introspección y mapeo. |
| [1.4. JavaBean, DTO, entidad y record](material.md#concepto-4) | RA2: Bean, DTO, entidad y record describen conceptos distintos. | IL4.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con javabean, dto, entidad y record. |
| [2. Demostración](material.md#demostracion) | RA2: vincula conceptos y ejecución del ejemplo completo. | IL4.1 | Ejecuta BeansDemo, interpreta la salida y justifica los casos. |
| [3. PC4.2b](material.md#pc) | RA2: aplica el contenido en una ampliación propia. | IL4.1 | Commit funcional, evidencia reproducible y explicación del cambio. |

**Alcance de la evidencia:** este contenido aporta fundamentos a IL4.1. El uso de Beans o JDO por sí solo no demuestra IL4.2; la conexión JDBC se comprueba en 4.2a, 4.3, 4.4 y PL4.1.

## Decisiones de secuencia

Los resultados de una consulta deben convertirse en objetos que la aplicación pueda utilizar. JavaBeans define convenciones útiles para propiedades y herramientas de introspección, pero no almacena datos por sí mismo.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- Bean con propiedades válidas: Introspección reconoce id y ubicación.
- Ubicación vacía: Setter rechaza.
- Record: Accesores no siguen automáticamente getX.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
