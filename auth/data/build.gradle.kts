plugins {
    alias(libs.plugins.runtrack.android.library)
    alias(libs.plugins.runtrack.jvm.ktor)
}

android {
    namespace = "com.aislan.data.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)
}