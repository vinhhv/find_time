package com.misterjvm.findtime

class AndroidPlatform : Platform {
    override val name: String = "Androids ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
