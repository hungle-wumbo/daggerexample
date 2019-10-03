package io.wewumbo.trainning.dagger.modules.feature3

import dagger.Module
import dagger.Provides

@Module
class Feature3Module {

    @ScopeFeature3
    @Provides
    fun providerFeature3Singleton(): Feature3Singleton {
        return Feature3Singleton()
    }
}