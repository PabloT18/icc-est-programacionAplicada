# Evolución de CampusMonitor

El proyecto personal parte de una aplicación de consola con el JDK. Conserva un único repositorio y organiza el código por responsabilidad.

| Etapa | Capacidad incorporada | Organización sugerida |
|---|---|---|
| 1.1 | Lecturas tipadas y utilidades | `modelo`, `genericos`, `cli` |
| 1.2 a 1.4 | Contratos, consultas y fuentes | `repositorio`, `fuentes` |
| 2.1 a 2.4 | Parser e importación | `protocolo`, `importacion` |
| 3.1 a 3.5 | Procesamiento concurrente | `servicio`, `concurrencia` |
| 3.6 | Vista Swing | `vista`, `controlador` |
| 4.1 a 4.4 | Persistencia | `config`, `repositorio/jdbc`, `sql` |
| 5.1 a 5.5 | Dispositivo e integración | `serial`, `firmware` |

## Identificadores y versiones de protocolo

Los ejemplos resueltos pequeños usan S01 para facilitar lectura. Las PC de la unidad 2 adoptan T001 y O001 para temperatura y ocupación. En la unidad 5 se agrega A001 para posición analógica. El material no exige mezclar tramas de formatos distintos sin un adaptador explícito.

La importación de la unidad 2 usa `id;valor;unidad`. El enlace serial de la unidad 5 usa `DATA;secuencia;raw`. El adaptador serial conoce qué sensor está asociado al puerto y produce una Lectura del dominio. Mantén parsers separados para contratos diferentes.

## Migración a Gradle en 4.2a

Mueve `src/edu/...` a `src/main/java/edu/...` con `git mv`. Declara plugin application, repositorio Maven Central y toolchain Java 25. Copia el Wrapper de `demostraciones` y adapta el build: no copies las rutas de fuentes que apuntan al repositorio de material.

Usa esta base:

```kotlin
plugins { application }
repositories { mavenCentral() }
java { toolchain { languageVersion = JavaLanguageVersion.of(25) } }
dependencies {
    implementation("org.snakeyaml:snakeyaml-engine:3.1.1")
    runtimeOnly("org.postgresql:postgresql:42.7.13")
}
application { mainClass.set("edu.ups.pap.Main") }
tasks.withType<JavaCompile>().configureEach { options.encoding = "UTF-8" }
```

En `settings.gradle.kts`: `rootProject.name = "campus-monitor"`. Agrega `application.yaml` a `src/main/resources` y una clase de lectura explícita. En la unidad 5 incorpora jSerialComm 2.11.4 y configura acceso nativo para Java 25. Las contraseñas provienen del entorno.

## Evidencias acumulativas

Las PC no entregan proyectos aislados que repiten toda la estructura. Si una práctica requiere comparar dos implementaciones, conserva ambas detrás del mismo contrato o en paquetes de demostración claramente identificados. No reemplaces una solución correcta sin dejar trazabilidad de su evolución.
