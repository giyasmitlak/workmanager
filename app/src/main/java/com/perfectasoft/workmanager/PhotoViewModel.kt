package com.perfectasoft.workmanager

import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.util.UUID

class PhotoViewModel: ViewModel() {
    var uncompressedUri: Uri? by mutableStateOf(null)

    var compressedBitmap: Bitmap? by mutableStateOf(null)

    var workId: UUID? by mutableStateOf(null)
}