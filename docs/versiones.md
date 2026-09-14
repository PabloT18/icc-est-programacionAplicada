# Versiones de referencia

Comprobación de releases y metadatos oficiales realizada el 10 de septiembre de 2026. Se fija Java 25 LTS y no se usan APIs preview. Las versiones siguientes corresponden a fuentes disponibles en esa fecha; futuras actualizaciones requieren revisión de compatibilidad.

| Componente | Versión fijada | Fuente |
|---|---|---|
| JDK Temurin | 25.0.4.1+1 | [Publicación oficial](https://github.com/adoptium/temurin25-binaries/releases/tag/jdk-25.0.4.1%2B1) |
| Gradle | 9.7.1 | [Publicación oficial](https://github.com/gradle/gradle/releases/tag/v9.7.1) |
| PostgreSQL JDBC | 42.7.13 | [Publicación oficial](https://github.com/pgjdbc/pgjdbc/releases/tag/REL42.7.13) |
| SnakeYAML Engine | 3.1.1 | [Publicación oficial](https://repo.maven.apache.org/maven2/org/snakeyaml/snakeyaml-engine/maven-metadata.xml) |
| jSerialComm | 2.11.4 | [Publicación oficial](https://github.com/Fazecast/jSerialComm/releases/tag/v2.11.4) |
| H2 | 2.5.250 | [Publicación oficial](https://repo.maven.apache.org/maven2/com/h2database/h2/maven-metadata.xml) |
| JDO API | 3.2.1 | [Publicación oficial](https://repo.maven.apache.org/maven2/javax/jdo/jdo-api/maven-metadata.xml) |
| DataNucleus Core y RDBMS | 6.0.11 | [Publicación oficial](https://repo.maven.apache.org/maven2/org/datanucleus/datanucleus-core/maven-metadata.xml) |
| DataNucleus API JDO | 6.0.5 | [Publicación oficial](https://repo.maven.apache.org/maven2/org/datanucleus/datanucleus-api-jdo/maven-metadata.xml) |
| Arduino IDE | 2.3.10 | [Publicación oficial](https://github.com/arduino/arduino-ide/releases/tag/2.3.10) |

El modelo JDO se compila con release 17 para el enhancer del proveedor y se ejecuta en JDK 25. El resto del proyecto usa Java 25. H2 es un motor de demostración, no la validación final de PostgreSQL.
