package io.wewumbo.trainning.dagger

import dagger.Module
import dagger.Provides
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Component
import io.wewumbo.trainning.dagger.modules.feature3.Feature3SingletonFactory
import javax.inject.Provider
import javax.inject.Singleton

@Module(subcomponents = [Feature3Component::class])
class ApplicationModule {

    @Singleton
    @Provides
    fun providerApplicationSingleton(): ApplicationSingleton {
        return ApplicationSingleton()
    }

    @Singleton
    @Provides
    fun providerFeature3SingletonFactory(feature3Component: Provider<Feature3Component.Builder>): Feature3SingletonFactory {
        return Feature3SingletonFactory(feature3Component)
    }
}