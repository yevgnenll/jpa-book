import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val api by configurations

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.4.10"
}

group = "me.yevgnenll"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.hibernate:hibernate-entitymanager:5.4.21.Final")
    testImplementation("junit:junit:4.12")
    runtimeOnly("com.h2database:h2:1.4.200")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
