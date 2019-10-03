package io.wewumbo.trainning.dagger

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import io.wewumbo.trainning.dagger.modules.feature1.Feature1Activity
import io.wewumbo.trainning.dagger.modules.feature2.Feature2Activity
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Component
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Module
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Singleton
import io.wewumbo.trainning.dagger.modules.feature3.subfeature1.SubFeature1Activity
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        AndroidSupportInjectionModule::class,
        Feature1Activity.BindModule::class,
        Feature2Activity.BindModule::class,
        SubFeature1Activity.BindModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: MainApplication)


    fun feature3ComponentBuilder(): Feature3Component.Builder
}