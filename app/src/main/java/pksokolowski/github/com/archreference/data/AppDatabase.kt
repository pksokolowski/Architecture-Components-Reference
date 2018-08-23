package pksokolowski.github.com.archreference.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(
        entities = [
            Info::class],
        version = 2,
        exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun infoDao(): InfoDao
}