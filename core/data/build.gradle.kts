plugins {
    alias(libs.plugins.runtrack.android.library)
    alias(libs.plugins.runtrack.jvm.ktor)
}

android {
    namespace = "com.aislan.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}