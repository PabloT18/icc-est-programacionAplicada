# Mapa curricular docente

Fuente: [programa analítico](../programa-analitico.pdf), páginas 2 y 3. Los códigos RA e IL son etiquetas internas de este material.

## Unidades

| Unidad | Horas oficiales | Materiales | PL |
|---|---:|---:|---|
| 1. Programación genérica | 40 | 6 | PL1.1 |
| 2. Expresiones regulares | 20 | 4 | PL2.1 |
| 3. Programación concurrente | 40 | 8 | PL3.1 |
| 4. Conexión a bases de datos | 60 | 6 | PL4.1 |
| 5. Interfaz de comunicación | 40 | 5 | PL5.1 |
| Total | 200 | 29 | 5 |

Las horas PL incluidas son estimaciones de desarrollo para organizar la actividad. No se suman como horas adicionales a las 200 del programa ni constituyen una planificación semanal oficial.

## Resultados

- **RA1:** Identifica técnicas de programación avanzada como la programación genérica, expresiones regulares y programación concurrente.
- **RA2:** Implementa aplicaciones de software con bases de datos.
- **RA3:** Integra protocolos de comunicación a aplicaciones de software.

## Correspondencia por contenido

| Tema | Resultado | Documento específico |
|---|---|---|
| 1.1a. Tipos y parámetros genéricos | RA1 | [doc.md](../01/1.1-fundamentos/01-tipos/doc.md) |
| 1.1b. Métodos genéricos y cotas | RA1 | [doc.md](../01/1.1-fundamentos/02-metodos/doc.md) |
| 1.1c. Boxing, foreach, var y varargs | RA1 | [doc.md](../01/1.1-fundamentos/03-boxing-foreach-varargs/doc.md) |
| 1.2. Subtipos, comodines y PECS | RA1 | [doc.md](../01/1.2-subtipos-comodines/doc.md) |
| 1.3. Genéricos y reflexión | RA1 | [doc.md](../01/1.3-genericos-reflexion/doc.md) |
| 1.4. Patrones con programación genérica | RA1 | [doc.md](../01/1.4-patrones-genericos/doc.md) |
| 2.1. Fundamentos de lenguajes regulares | RA1 | [doc.md](../02/2.1-lenguajes-regulares/doc.md) |
| 2.2. Diseño de expresiones regulares | RA1 | [doc.md](../02/2.2-diseno-expresiones/doc.md) |
| 2.3. Aserciones y límites de coincidencia | RA1 | [doc.md](../02/2.3-aserciones/doc.md) |
| 2.4. Preprocesamiento y extracción de ficheros | RA1 | [doc.md](../02/2.4-textos-ficheros/doc.md) |
| 3.1. Fundamentos de concurrencia | RA1 | [doc.md](../03/3.1-fundamentos/doc.md) |
| 3.2a. Hilos, Runnable, estados e interrupción | RA1 | [doc.md](../03/3.2-hilos-ejecutables/01-hilos-runnable/doc.md) |
| 3.2b. Procesos y ejecutables Unix | RA1 | [doc.md](../03/3.2-hilos-ejecutables/02-procesos-unix/doc.md) |
| 3.3a. Sincronización con monitores y locks | RA1 | [doc.md](../03/3.3-sincronizacion/01-monitores-locks/doc.md) |
| 3.3b. Barreras, semáforos y variables atómicas | RA1 | [doc.md](../03/3.3-sincronizacion/02-barreras-semaforos-atomicas/doc.md) |
| 3.4. Productores y consumidores | RA1 | [doc.md](../03/3.4-productores-consumidores/doc.md) |
| 3.5. Ejecutores, futuros e hilos virtuales | RA1 | [doc.md](../03/3.5-herramientas/doc.md) |
| 3.6. Concurrencia e interfaz gráfica con Swing | RA1 | [doc.md](../03/3.6-interfaz-grafica/doc.md) |
| 4.1. Modelo relacional y SQL | RA2 | [doc.md](../04/4.1-modelo-relacional/doc.md) |
| 4.2a. JDBC, Gradle y configuración YAML | RA2 | [doc.md](../04/4.2-persistencia/01-jdbc-configuracion/doc.md) |
| 4.2b. JavaBeans y transferencia de datos | RA2 | [doc.md](../04/4.2-persistencia/02-javabeans/doc.md) |
| 4.2c. Java Data Objects | RA2 | [doc.md](../04/4.2-persistencia/03-jdo/doc.md) |
| 4.3. ResultSet, RowSet y consultas parametrizadas | RA2 | [doc.md](../04/4.3-resultset-rowset/doc.md) |
| 4.4. Persistencia JDBC y transacciones | RA2 | [doc.md](../04/4.4-aplicacion-jdbc/doc.md) |
| 5.1. Fundamentos de Arduino | RA3 | [doc.md](../05/5.1-fundamentos-arduino/doc.md) |
| 5.2. Pines de entrada y salida | RA3 | [doc.md](../05/5.2-pines-entrada-salida/doc.md) |
| 5.3. Comunicación serial y delimitación de tramas | RA3 | [doc.md](../05/5.3-protocolo-serial/doc.md) |
| 5.4. Sensores, muestreo y calibración | RA3 | [doc.md](../05/5.4-sensores/doc.md) |
| 5.5. Integración de Java, Arduino y persistencia | RA3 | [doc.md](../05/5.5-integracion-pc-arduino/doc.md) |

## Alcance de las subdivisiones

1.1 se divide en tipos, métodos y boxing/foreach/varargs. 3.2 distingue hilos y tareas Runnable de la extensión de procesos Unix. 3.3 separa monitores y herramientas de coordinación. 4.2 separa JDBC, JavaBeans y JDO. Se corrigen ortografías del programa como ResultSet y varargs sin cambiar el alcance del contenido. Arduino es la ruta base y ESP32 una variante documentada.
