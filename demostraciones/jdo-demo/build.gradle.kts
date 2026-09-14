plugins { application }
repositories { mavenCentral() }
java { toolchain { languageVersion = JavaLanguageVersion.of(25) } }
tasks.withType<JavaCompile>().configureEach { options.release.set(17); options.encoding="UTF-8" }
sourceSets.main { java.setSrcDirs(listOf("../../04/4.2-persistencia/03-jdo/ejemplos")) }
dependencies {
    implementation("javax.jdo:jdo-api:3.2.1")
    implementation("org.datanucleus:datanucleus-core:6.0.11")
    implementation("org.datanucleus:datanucleus-api-jdo:6.0.5")
    implementation("org.datanucleus:datanucleus-rdbms:6.0.11")
    runtimeOnly("com.h2database:h2:2.5.250")
}
application { mainClass.set("edu.ups.pap.jdo.JdoDemo") }
val enhance = tasks.register<JavaExec>("enhance") {
    dependsOn(tasks.classes)
    classpath=sourceSets.main.get().runtimeClasspath
    mainClass.set("org.datanucleus.enhancer.DataNucleusEnhancer")
    args("-api","JDO",layout.buildDirectory.file("classes/java/main/edu/ups/pap/jdo/JdoLectura.class").get().asFile.absolutePath)
}
tasks.named("run") { dependsOn(enhance) }
