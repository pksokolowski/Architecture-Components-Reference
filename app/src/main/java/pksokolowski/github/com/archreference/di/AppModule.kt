package pksokolowski.github.com.archreference.di

import dagger.Module
import dagger.android.AndroidInjectionModule

@Module(includes = [ViewModelModule::class, AndroidInjectionModule::class])
open class AppModule {

}