import io.ktor.application.*
import io.ktor.sessions.*

fun Application.configureSessions() {
    install(Sessions)
}
