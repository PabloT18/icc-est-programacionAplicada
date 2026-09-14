# Verificación de la entrega

Fecha: 10 de septiembre de 2026.

## Inventario

Cinco unidades del programa, 29 materiales Markdown, 29 documentos docentes, 29 PC, cinco guías PL en HTML y 34 presentaciones PPTX. Las presentaciones reúnen 331 diapositivas y 34 tablas nativas editables. Se incluyen 29 resúmenes SVG, seis ilustraciones originales, los logos entregados y la fuente DejaVu Sans.

## Pruebas realizadas

- Compilación de las demostraciones con JDK 25 y Gradle 9.7.1.
- Ejecución satisfactoria de las 26 demostraciones Java del proyecto principal. [Salidas registradas](verificacion/salidas-java.json).
- Compilación, enhancement y ejecución de la demostración JDO con DataNucleus y H2.
- Verificación del decodificador serial: tramas fragmentadas y concatenadas, límites numéricos, línea excedida y recuperación.
- Ejecución de la interfaz Swing en modo `--self-test`, sin pantalla.
- Generación estática de las 29 lecturas HTML y cinco guías PL.
- Comprobación de 558 referencias locales en los HTML y revisión de enlaces Markdown sin destinos ausentes.
- Validación de estructura, geometría, tipografía y tablas nativas de los 34 PPTX; renderizado de las diapositivas y revisión visual de las disposiciones utilizadas.
- Comprobación de correspondencia entre los conceptos del catálogo y el texto de las presentaciones. Los enunciados curriculares están separados en los documentos docentes.

## Comprobaciones pendientes en el laboratorio

El entorno de elaboración no disponía de un servidor PostgreSQL ni de una placa Arduino/ESP32. La conexión a PostgreSQL real, la compilación y carga del firmware, el cableado, el enlace USB y la interfaz Swing con pantalla requieren el equipo del laboratorio. H2 y las tramas simuladas no verifican esos componentes.

La ejecución del navegador de pruebas quedó bloqueada por una restricción de sockets del entorno. Se revisaron el código y los enlaces del sitio, pero no se declara una prueba visual completa de navegación en escritorio o móvil. Abre `index.html` después de descomprimir y comprueba la selección de unidades, el visor de material, las PL y las descargas en el navegador que utilizarás en clase.

## Edición de las diapositivas

El texto, los bloques de código, las formas y las tablas son editables. Las ilustraciones son imágenes PNG independientes incluidas en los assets. Instala DejaVu Sans desde `assets/fonts/` en el equipo de presentación para conservar la tipografía y evitar sustituciones de fuente. Revisa la disposición al abrir en una versión distinta de PowerPoint o LibreOffice.

## Publicación

El paquete se entrega listo para crear el repositorio. No se creó un repositorio remoto ni se desplegó una página en la cuenta. Los pasos están en [publicación](publicacion.md).
