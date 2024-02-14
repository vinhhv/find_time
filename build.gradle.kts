plugins {
    // trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.multiplatformPlugin).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
