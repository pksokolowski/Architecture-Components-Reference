package pksokolowski.github.com.archreference.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(
        entities = [
            Info::class],
        version = 1,
        exportSchema = false
)
abstract class GithubDb : RoomDatabase() {

    abstract fun infoDao(): InfoDao
}