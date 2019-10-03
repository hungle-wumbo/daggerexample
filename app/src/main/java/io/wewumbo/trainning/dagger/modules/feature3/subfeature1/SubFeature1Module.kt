package io.wewumbo.trainning.dagger.modules.feature3.subfeature1

import dagger.Module
import dagger.Provides
import io.wewumbo.trainning.dagger.ScopeActivity
import io.wewumbo.trainning.dagger.modules.ActivitySingleton
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Singleton
import io.wewumbo.trainning.dagger.modules.feature3.ScopeFeature3

@Module
class SubFeature1Module {

    @Provides
    fun providerActivitySingleTon(): Feature3Singleton {
        return Feature3Singleton()
    }
}