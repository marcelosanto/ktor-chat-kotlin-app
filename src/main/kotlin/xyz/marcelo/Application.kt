package xyz.marcelo

import io.ktor.application.*
import org.koin.ktor.ext.Koin
import xyz.marcelo.di.mainModule
import xyz.marcelo.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureRouting()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
}
