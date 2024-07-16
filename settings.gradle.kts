rootProject.name = "multi-example"

listOf(
    "common",
    "server",
//    "client",
).forEach {
    include(it)
    project(":$it").projectDir = File("$rootDir/modules/$it")
}
