
plugins {
    id("dev.nx.gradle.project-graph") version "0.1.20" apply true
}

allprojects {
    apply plugin("dev.nx.gradle.project-graph")
    group = "com.bradenkennedy"
}
