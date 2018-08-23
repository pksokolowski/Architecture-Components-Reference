package pksokolowski.github.com.archreference

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import pksokolowski.github.com.archreference.data.Info
import pksokolowski.github.com.archreference.data.InfoRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val infoRepository: InfoRepository): ViewModel() {

    private val content: LiveData<List<Info>> = infoRepository.getData()

    private val concatenatedString = MediatorLiveData<String>()

    init {
        concatenatedString.addSource(content){
            val sb = StringBuilder()
            it?.forEach { item ->
                sb.append(item.content)
                sb.append("\n")
            }
            concatenatedString.value = sb.toString()
        }
    }

    fun getConcatenatedContent() = concatenatedString as LiveData<String>

    fun getContent(): LiveData<List<Info>> = content

    fun addContent(content: String){
        val info = Info(0, content)
        infoRepository.addDatum(info)
    }
}