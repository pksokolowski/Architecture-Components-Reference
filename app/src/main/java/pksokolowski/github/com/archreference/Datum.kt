package pksokolowski.github.com.archreference

import android.app.Application
import android.content.Context
import javax.inject.Inject

class Datum @Inject constructor(val application: Application) {
    var content = "some important content"
}