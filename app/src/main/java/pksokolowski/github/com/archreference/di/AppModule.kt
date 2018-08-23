package pksokolowski.github.com.archreference.di

import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import pksokolowski.github.com.archreference.data.AppDatabase
import pksokolowski.github.com.archreference.data.InfoDao
import pksokolowski.github.com.archreference.utilities.DATABASE_NAME
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class, AndroidInjectionModule::class])
open class AppModule {

    @Singleton
    @Provides
    fun provideDb(app: Application): AppDatabase {
        return Room
                .databaseBuilder(app, AppDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()
    }

    @Singleton
    @Provides
    fun provideUserDao(db: AppDatabase): InfoDao {
        return db.infoDao()
    }
}