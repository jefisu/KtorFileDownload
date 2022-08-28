package com.jefisu.ktorfiledownload

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.File

class FileViewModel(
    private val repository: FileRepository = FileRepository()
) : ViewModel() {

    var isLoading by mutableStateOf(false)
        private set

    var file by mutableStateOf<File?>(null)
        private set

    fun downloadImage(path: String, fileName: String) {
        isLoading = true
        viewModelScope.launch {
            file = repository.downloadImage().save(path, fileName)
            delay(300)
            isLoading = false
        }
    }
}