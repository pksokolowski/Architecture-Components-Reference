package pksokolowski.github.com.archreference.di

import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import pksokolowski.github.com.archreference.Datum
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class, AndroidInjectionModule::class])
open class AppModule {

}