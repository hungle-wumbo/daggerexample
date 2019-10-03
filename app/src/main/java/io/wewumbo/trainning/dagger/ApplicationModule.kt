package io.wewumbo.trainning.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Singleton
    @Provides
    fun providerApplicationSingleton(): ApplicationSingleton {
        return ApplicationSingleton()
    }
}