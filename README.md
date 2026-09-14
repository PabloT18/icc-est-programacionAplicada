# Programación Aplicada

## Manual de trabajo en GitHub

![Universidad Politécnica Salesiana · Carrera de Computación](assets/logos/ups-computacion.png)

**Asignatura:** Programación Aplicada  
**Carrera:** Computación · Sede Cuenca  
**Autor del material:** Ing. Pablo Torres, Mgtr.  
**Proyecto:** icc-pap-material

## Descripción general

Material de consulta y demostración para construir **CampusMonitor**, una aplicación Java que evoluciona desde un catálogo genérico hasta un sistema de adquisición de datos con PostgreSQL y Arduino. El repositorio de material se consulta; cada estudiante desarrolla su solución en un repositorio personal independiente.

El programa analítico adjunto contiene **cinco unidades**. La organización `01` a `05` conserva todos sus contenidos. Los temas extensos se subdividen dentro del mismo código curricular. El curso contiene **29 materiales, 29 PC, 29 presentaciones de contenido y 5 PL con sus presentaciones**.

## Acceso al material

Abre [index.html](index.html) después de descomprimir el proyecto. El índice permite elegir una unidad, abrir su material y consultar las PL en un visor integrado. Cada lectura también tiene su propia página HTML, enlaces a Markdown y descarga de PPTX. Los recursos web están incluidos y la consulta no requiere CDN.

Para servirlo por HTTP desde la raíz:

```bash
python3 -m http.server 8000
```

Abre `http://localhost:8000`. En Windows también puede utilizarse `py -m http.server 8000`.

## Unidades y secuencia

| Unidad | Material | Alcance del proyecto |
|---|---|---|
| 01 | [Programación genérica](01/README.md) | Catálogo, lecturas tipadas, algoritmos y contratos reutilizables |
| 02 | [Expresiones regulares](02/README.md) | Validación, extracción e importación auditable de archivos |
| 03 | [Programación concurrente](03/README.md) | Tareas, coordinación, cancelación y vista Swing |
| 04 | [Conexión a bases de datos](04/README.md) | JDBC, configuración, consultas y transacciones PostgreSQL |
| 05 | [Interfaz de comunicación](05/README.md) | Firmware Arduino, protocolo serial e integración persistente |

## Estructura y archivos

| Ubicación | Contenido |
|---|---|
| `01/` a `05/` | Unidades y subcarpetas por contenido |
| `material.md` de cada contenido | Conceptos, demostración resuelta y PC para el estudiante |
| `presentacion.pptx` | Diapositivas editables para demostración en clase |
| `doc.md` | Correspondencia curricular para uso docente |
| `assets/` de cada contenido | Resumen visual y, cuando corresponde, imagen de analogía |
| `ejemplos/` | Fuentes completas de las demostraciones |
| `PLs/` dentro de cada unidad | Guía HTML de laboratorio, rúbrica y presentación de lanzamiento |
| `assets/logos/` | Logos institucionales originales compartidos |
| `assets/fonts/` | Una familia tipográfica, DejaVu Sans |
| `demostraciones/` | Proyecto Gradle para compilar y ejecutar los ejemplos |
| `plantillas/` | Punto de partida del proyecto personal y formato de evidencia |
| `firmware/` | Sketch integrado de Arduino compatible con Java |
| `sql/postgresql/` | Esquema, datos semilla y consultas de referencia |
| `docs/` | Guías de trabajo, versiones y documentación docente |
| `scripts/` | Regeneración del HTML y verificación de enlaces |

## Cómo trabajar

1. Lee la parte conceptual de `material.md` y ejecuta su demostración.
2. Resuelve la sección **PC** en tu proyecto CampusMonitor, conservando lo anterior.
3. Ejecuta los casos exigidos y registra evidencia con resultados reales.
4. Haz commits por cambios funcionales y enlaza el commit final de la actividad.
5. Al finalizar la unidad, desarrolla su **PL** con el alcance y rúbrica indicados.

Las PC son ejercicios relativamente cortos de clase. Las PL son proyectos autónomos más amplios, una por unidad. Las demostraciones del material están resueltas; las PC y PL se entregan como enunciados para resolver.

## Proyecto personal

Nombre sugerido: `icc-pap-campusmonitor-apellido`. Copia [plantillas/proyecto-estudiante](plantillas/proyecto-estudiante/) a otra carpeta, inicializa Git allí y completa tu README. En las unidades 1 a 3 puedes usar el JDK directamente. En 4.2a migra a Gradle y conserva el historial.

Consulta [guía del proyecto](docs/proyecto-estudiante.md), [commits y evidencias](docs/guia-git.md) y [configuración de PostgreSQL](docs/postgresql.md).

## Tecnologías

Java 25 LTS, Gradle 9.7.1 con Kotlin DSL, Swing, JDBC PostgreSQL 42.7.13, SnakeYAML Engine 3.1.1 y jSerialComm 2.11.4. Arduino IDE 2.3.10 y UNO R3 como referencia. H2 permite ejecutar demostraciones aisladas; PostgreSQL es el motor del proyecto personal. JDO se estudia en una demostración separada con DataNucleus.

Las versiones y fuentes de comprobación están en [docs/versiones.md](docs/versiones.md). No se emplean características preview. El material no requiere Spring Boot.

## Ejecución de demostraciones

```bash
cd demostraciones
./gradlew classes
./gradlew runDemo -Pdemo=1.1a
./gradlew runDemo -Pdemo=3.6
./gradlew runDemo -Pdemo=5.3 -PdemoArgs=--simulate
./gradlew verificarProtocolo
./gradlew :jdo-demo:run
```

En Windows sustituye `./gradlew` por `gradlew.bat`. La primera ejecución descarga Gradle y dependencias. Las indicaciones de cada tema especifican si necesita base de datos, pantalla o hardware.

## Prácticas de laboratorio

- [PL1.1. Catálogo genérico de dispositivos y lecturas](01/PLs/PL1.1.html) · [PPTX](01/PLs/PL1.1.pptx)
- [PL2.1. Importador y auditor de tramas de sensores](02/PLs/PL2.1.html) · [PPTX](02/PLs/PL2.1.pptx)
- [PL3.1. Monitor concurrente con interfaz y cancelación](03/PLs/PL3.1.html) · [PPTX](03/PLs/PL3.1.pptx)
- [PL4.1. Monitor persistente con PostgreSQL y JDBC](04/PLs/PL4.1.html) · [PPTX](04/PLs/PL4.1.pptx)
- [PL5.1. Estación de adquisición Arduino y Java](05/PLs/PL5.1.html) · [PPTX](05/PLs/PL5.1.pptx)

Cada PL incorpora objetivo práctico, instrucciones, fases, casos de aceptación, resultados requeridos, conclusiones, recomendaciones y rúbrica sobre 10 puntos. La presentación incluida lanza la actividad; el estudiante prepara además la presentación de su solución que exige la guía.

## Mantenimiento y publicación

El HTML de lectura se genera desde Markdown y queda guardado junto al contenido. El generador incluye su parser y no necesita instalar paquetes npm. Tras editar un MD ejecuta `node scripts/build-site.mjs`. Las diapositivas son archivos editables y deben mantenerse coherentes con el MD cuando se actualice el contenido. Consulta [publicación en GitHub Pages](docs/publicacion.md).

Las restricciones de copia se aplican solo a las guías PL mediante `assets/js/protection.js`. Son una dificultad superficial en el navegador, no impiden acceso al código, capturas o uso de IA. La evaluación se apoya en evidencias, commits y defensa. La configuración puede desactivar las restricciones para necesidades de acceso.

## Documentación docente

La correspondencia con resultados e indicadores aparece únicamente en `doc.md` y en [mapa curricular](docs/mapa-curricular.md). No forma parte del contenido de las diapositivas ni de las lecturas para estudiantes. La [revisión de referencias](docs/analisis-referencias.md) registra qué se conservó de los repositorios proporcionados.

## Uso de recursos

Los logos son los originales entregados por el docente. La tipografía incluye su licencia. Las imágenes originales de analogía tienen sus prompts en `docs/prompts-imagenes.json`. Las fotografías del trabajo real y resultados que entregue el estudiante deben corresponder a sus propias pruebas.

La [verificación de la entrega](docs/verificacion.md) detalla las pruebas ejecutadas y las comprobaciones que requieren el equipo del laboratorio.
