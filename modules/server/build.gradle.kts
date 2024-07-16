plugins {
    apply {
        id("org.springframework.boot")
        id("io.spring.dependency-management")
        id("org.jetbrains.kotlin.plugin.spring")
    }
}

version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":common"))

    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}