package pksokolowski.github.com.archreference.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface InfoDao {
    @Query("SELECT * FROM info WHERE id = :id")
    fun getInfo(id: Long): LiveData<Info>

    @Query("SELECT * FROM info ORDER BY id")
    fun getInfo(): LiveData<List<Info>>

    @Insert
    fun insertInfo(info: Info): Long

}