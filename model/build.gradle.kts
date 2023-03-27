val commonsLang3Version: String by project
val hibernateTypesVersion: String by project
val packageUrlJavaVersion: String by project
val springdocVersion: String by project
val commonsCollections4Version: String by project

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.vladmihalcea:hibernate-types-60:$hibernateTypesVersion")
    implementation("com.github.package-url:packageurl-java:$packageUrlJavaVersion")
    implementation("org.apache.commons:commons-lang3:$commonsLang3Version")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:$springdocVersion")
    implementation("org.apache.commons:commons-collections4:$commonsCollections4Version")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}