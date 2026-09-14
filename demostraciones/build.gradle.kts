plugins { java }
repositories { mavenCentral() }
java { toolchain { languageVersion = JavaLanguageVersion.of(25) } }
tasks.withType<JavaCompile>().configureEach { options.encoding = "UTF-8" }
dependencies {
    implementation("org.snakeyaml:snakeyaml-engine:3.1.1")
    implementation("com.fazecast:jSerialComm:2.11.4")
    runtimeOnly("org.postgresql:postgresql:42.7.13")
    runtimeOnly("com.h2database:h2:2.5.250")
}
sourceSets.main { java.srcDirs("../01/1.1-fundamentos/01-tipos/ejemplos","../01/1.1-fundamentos/02-metodos/ejemplos","../01/1.1-fundamentos/03-boxing-foreach-varargs/ejemplos","../01/1.2-subtipos-comodines/ejemplos","../01/1.3-genericos-reflexion/ejemplos","../01/1.4-patrones-genericos/ejemplos","../02/2.1-lenguajes-regulares/ejemplos","../02/2.2-diseno-expresiones/ejemplos","../02/2.3-aserciones/ejemplos","../02/2.4-textos-ficheros/ejemplos","../03/3.1-fundamentos/ejemplos","../03/3.2-hilos-ejecutables/01-hilos-runnable/ejemplos","../03/3.2-hilos-ejecutables/02-procesos-unix/ejemplos","../03/3.3-sincronizacion/01-monitores-locks/ejemplos","../03/3.3-sincronizacion/02-barreras-semaforos-atomicas/ejemplos","../03/3.4-productores-consumidores/ejemplos","../03/3.5-herramientas/ejemplos","../03/3.6-interfaz-grafica/ejemplos","../04/4.1-modelo-relacional/ejemplos","../04/4.2-persistencia/01-jdbc-configuracion/ejemplos","../04/4.2-persistencia/02-javabeans/ejemplos","../04/4.3-resultset-rowset/ejemplos","../04/4.4-aplicacion-jdbc/ejemplos","../05/5.3-protocolo-serial/ejemplos","../05/5.4-sensores/ejemplos","../05/5.5-integracion-pc-arduino/ejemplos", "src/main/java") }
val demos = mapOf(
    "1.1a" to "edu.ups.pap.u01.TiposDemo",
    "1.1b" to "edu.ups.pap.u01.MetodosDemo",
    "1.1c" to "edu.ups.pap.u01.BoxingDemo",
    "1.2" to "edu.ups.pap.u01.ComodinesDemo",
    "1.3" to "edu.ups.pap.u01.ReflexionDemo",
    "1.4" to "edu.ups.pap.u01.PatronesDemo",
    "2.1" to "edu.ups.pap.u02.LenguajeDemo",
    "2.2" to "edu.ups.pap.u02.RegexDemo",
    "2.3" to "edu.ups.pap.u02.AsercionesDemo",
    "2.4" to "edu.ups.pap.u02.FicherosDemo",
    "3.1" to "edu.ups.pap.u03.CarreraDemo",
    "3.2a" to "edu.ups.pap.u03.HilosDemo",
    "3.2b" to "edu.ups.pap.u03.ProcesosDemo",
    "3.3a" to "edu.ups.pap.u03.MonitoresDemo",
    "3.3b" to "edu.ups.pap.u03.CoordinacionDemo",
    "3.4" to "edu.ups.pap.u03.ColaDemo",
    "3.5" to "edu.ups.pap.u03.EjecutoresDemo",
    "3.6" to "edu.ups.pap.u03.SwingDemo",
    "4.1" to "edu.ups.pap.u04.RelacionalDemo",
    "4.2a" to "edu.ups.pap.u04.JdbcDemo",
    "4.2b" to "edu.ups.pap.u04.BeansDemo",
    "4.3" to "edu.ups.pap.u04.RowSetDemo",
    "4.4" to "edu.ups.pap.u04.TransaccionesDemo",
    "5.3" to "edu.ups.pap.u05.SerialDemo",
    "5.4" to "edu.ups.pap.u05.SensoresDemo",
    "5.5" to "edu.ups.pap.u05.IntegracionDemo"
)
tasks.register<JavaExec>("runDemo") {
    dependsOn(tasks.classes)
    classpath = sourceSets.main.get().runtimeClasspath
    val codigo = providers.gradleProperty("demo").getOrElse("1.1a")
    mainClass.set(demos[codigo] ?: throw GradleException("Demo desconocida: $codigo"))
    jvmArgs("--enable-native-access=ALL-UNNAMED")
    val extra = providers.gradleProperty("demoArgs").getOrElse("")
    if (extra.isNotBlank()) args(extra.split(" ").filter { it.isNotBlank() })
}
tasks.register<JavaExec>("verificarProtocolo") {
    dependsOn(tasks.classes)
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("edu.ups.pap.comun.ProtocoloCheck")
}
