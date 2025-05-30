plugins {
    alias(libs.plugins.runtrack.android.library)
    alias(libs.plugins.runtrack.android.room)
}

android {
    namespace = "com.aislan.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}