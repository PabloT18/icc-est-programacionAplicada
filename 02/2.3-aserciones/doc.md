# Documento docente · 2.3

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
| [1.1. Aserciones de longitud cero](material.md#concepto-1) | RA1: Las aserciones no consumen caracteres. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con aserciones de longitud cero. |
| [1.2. Anclas y límites de palabra](material.md#concepto-2) | RA1: Las anclas y los límites restringen dónde coincide el patrón. | IL2.1 | Explica el contrato y predice un caso válido y uno inválido relacionados con anclas y límites de palabra. |
| [1.3. Composición sin ambigüedad](material.md#concepto-3) | RA1: Lookahead y lookbehind comprueban el contexto de coincidencia. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con composición sin ambigüedad. |
| [1.4. Pruebas del contexto](material.md#concepto-4) | RA1: Las pruebas deben variar el entorno de la coincidencia. | IL2.2 | Explica el contrato y predice un caso válido y uno inválido relacionados con pruebas del contexto. |
| [2. Demostración](material.md#demostracion) | RA1: vincula conceptos y ejecución del ejemplo completo. | IL2.2 | Ejecuta AsercionesDemo, interpreta la salida y justifica los casos. |
| [3. PC2.3](material.md#pc) | RA1: aplica el contenido en una ampliación propia. | IL2.2 | Commit funcional, evidencia reproducible y explicación del cambio. |

## Decisiones de secuencia

En los registros de diagnóstico aparecen etiquetas mezcladas con unidades y estados. A veces se necesita encontrar un valor únicamente si está acompañado por un contexto, sin incluir ese contexto en el resultado.

La PC conserva el proyecto acumulativo. La demostración resuelta funciona como referencia separada y no entrega la solución de la PC. La PL de la unidad integra los conceptos con un alcance mayor y dispone de rúbrica propia.

## Revisión de la evidencia

- TEMP=23.5C: Captura 23.5.
- TEMP=23.5F o TEMP=23.5CX: No captura.
- DESCARTADO:T001: ID excluido.

No se infiere logro por cantidad de commits. Se revisa el código del commit, su ejecución y la explicación del estudiante. El material y las diapositivas no incluyen enunciados curriculares.
