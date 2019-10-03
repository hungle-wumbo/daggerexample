package io.wewumbo.trainning.dagger

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import io.wewumbo.trainning.dagger.modules.feature1.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    AndroidSupportInjectionModule::class,
    MainActivity.BindModule::class
])
interface ApplicationComponent {

    fun inject(application: MainApplication)

}