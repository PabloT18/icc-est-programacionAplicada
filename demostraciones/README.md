# Demostraciones Java

Este proyecto compila los ejemplos resueltos alojados junto a cada material. No contiene soluciones de las PC ni de las PL.

Requiere JDK 25. El Wrapper fija Gradle 9.7.1 y descarga la distribución en su primer uso.

```bash
./gradlew classes
./gradlew runDemo -Pdemo=1.1a
./gradlew runDemo -Pdemo=3.6 -PdemoArgs=--self-test
./gradlew runDemo -Pdemo=5.3 -PdemoArgs=--simulate
./gradlew verificarProtocolo
./gradlew :jdo-demo:run
```

En Windows utiliza gradlew.bat. Las demostraciones tempranas se pueden ejecutar con el lanzador de fuentes del JDK sin descargar dependencias. La ventana Swing requiere escritorio. Las pruebas H2 son aisladas; consulta la guía PostgreSQL para el motor del proyecto personal.
