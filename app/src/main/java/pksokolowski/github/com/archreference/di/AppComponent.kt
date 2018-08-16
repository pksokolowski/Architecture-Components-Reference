package pksokolowski.github.com.archreference.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import pksokolowski.github.com.archreference.App
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, MainActivityModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}