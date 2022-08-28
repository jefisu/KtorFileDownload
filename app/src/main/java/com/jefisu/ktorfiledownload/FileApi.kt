package com.jefisu.ktorfiledownload

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.logging.*

object FileApi {
    val client by lazy {
        HttpClient(Android) {
            install(Logging) {
                level = LogLevel.ALL
            }
        }
    }
}