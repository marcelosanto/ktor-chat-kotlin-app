package xyz.marcelo.plugins

import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject
import xyz.marcelo.room.RoomController
import xyz.marcelo.routes.chatSocket
import xyz.marcelo.routes.getAllMessages

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
