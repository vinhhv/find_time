package com.misterjvm.findtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform