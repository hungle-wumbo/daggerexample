package io.wewumbo.trainning.dagger

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import io.wewumbo.trainning.dagger.modules.feature1.MainActivity
import io.wewumbo.trainning.dagger.modules.feature2.Feature1Activity
import io.wewumbo.trainning.dagger.modules.feature2.FeatureActivity1Module
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    AndroidSupportInjectionModule::class,
    MainActivity.BindModule::class,
    Feature1Activity.BindModule::class
])
interface ApplicationComponent {

    fun inject(application: MainApplication)

}