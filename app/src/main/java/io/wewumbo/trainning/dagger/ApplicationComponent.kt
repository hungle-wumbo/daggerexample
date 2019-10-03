package io.wewumbo.trainning.dagger

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    ApplicationModule::class,
    AndroidSupportInjectionModule::class
])
interface ApplicationComponent {

    fun inject(application: MainApplication)

}