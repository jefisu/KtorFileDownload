package com.jefisu.ktorfiledownload

import io.ktor.client.call.*
import io.ktor.client.request.*

class FileRepository {

    suspend fun downloadImage(): ByteArray {
        return FileApi.client
            .get(IMAGE_URL)
            .body()
    }

    companion object {
        const val IMAGE_URL =
            "https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/236f44583009506b8d9d012c4d3119a5.jpeg"
    }
}