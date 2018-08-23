package pksokolowski.github.com.archreference.data

import android.arch.lifecycle.LiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InfoRepository @Inject constructor(private val infoDao: InfoDao) {

    fun getData(): LiveData<List<Info>> {
        return infoDao.getInfo()
    }

    fun addDatum(info: Info){
        infoDao.insertInfo(info)
    }
}