package com.jefisu.ktorfiledownload

import java.io.File

fun ByteArray.save(path: String, fileName: String): File {
    val file = File(path, fileName)
    file.writeBytes(this)
    return file
}