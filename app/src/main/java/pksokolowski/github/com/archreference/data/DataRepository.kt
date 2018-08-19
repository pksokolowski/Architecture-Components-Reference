package pksokolowski.github.com.archreference.data

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import javax.inject.Inject

class InfoRepository @Inject constructor(val application: Application) {

    fun getData(): MutableLiveData<String>{
        val data = MutableLiveData<String>()
        data.value = "incredibly important content"
        return data
    }

}