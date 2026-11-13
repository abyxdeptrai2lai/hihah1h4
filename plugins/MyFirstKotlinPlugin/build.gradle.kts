plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.aliucord.gradle")
}

android {
    namespace = "com.aliucord.plugins.pasteandspam"
    compileSdk = 34
    defaultConfig { minSdk = 26 }
}

aliucord {
    author("Freddy")
    description = "Paste button and Spam menu"
    version = "1.0.0"
    deploy.set(true)
}

dependencies { compileOnly("com.discord:discord:126021") }
