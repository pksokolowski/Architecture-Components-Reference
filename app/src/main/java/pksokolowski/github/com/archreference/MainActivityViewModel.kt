package pksokolowski.github.com.archreference

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import pksokolowski.github.com.archreference.data.InfoRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(dataRepository: InfoRepository): ViewModel() {

    private val content: MutableLiveData<String> = dataRepository.getData()

    fun getContent(): LiveData<String>{
        return content
    }

    fun setContent(text: String){
        content.value = text
    }
}