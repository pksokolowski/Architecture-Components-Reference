package pksokolowski.github.com.archreference.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface InfoDao {
    @Query("SELECT * FROM info WHERE id = :id")
    fun getInfo(id: Long): Info

    @Insert
    fun insertInfo(info: Info): Long

}