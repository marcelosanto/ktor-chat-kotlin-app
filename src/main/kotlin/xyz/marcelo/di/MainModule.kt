package xyz.marcelo.di

import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import xyz.marcelo.data.MessageDataSource
import xyz.marcelo.data.MessageDataSourceImpl
import xyz.marcelo.room.RoomController

val mainModule = module {
    single {
        KMongo.createClient()
            .coroutine
            .getDatabase("message_db_yt")
    }

    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }

    single {
        RoomController(get())
    }
}
