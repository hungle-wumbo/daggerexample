package io.wewumbo.trainning.dagger

import dagger.Module
import dagger.Provides
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Component
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Singleton
import javax.inject.Singleton

@Module(subcomponents = [Feature3Component::class])
class ApplicationModule {

    @Singleton
    @Provides
    fun providerApplicationSingleton(): ApplicationSingleton {
        return ApplicationSingleton()
    }

//    @Singleton
//    @Provides
//    fun providerFeature3Singleton(builder: Feature3Component.Builder): Feature3Singleton {
//        return builder.build().requestFeature3Singleton()
//    }
}