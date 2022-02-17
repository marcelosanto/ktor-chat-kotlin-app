package xyz.marcelo.room

import io.ktor.http.cio.websocket.*

data class Member(
    val username: String,
    val sessionId: String,
    val socket: WebSocketSession
)