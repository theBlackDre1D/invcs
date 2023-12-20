package co.inIit.invcs

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform