plugins {
    id("java")
}

group = "fr.playground"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("jakarta.annotation:jakarta.annotation-api: 3.1.0")
    implementation("org.springframework.data:spring-data-jpa: 3.2.3")
}

tasks.test {
    useJUnitPlatform()
}