package pksokolowski.github.com.archreference.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pksokolowski.github.com.archreference.MainActivity

@Suppress("unused")
@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeMainActivity(): MainActivity
}