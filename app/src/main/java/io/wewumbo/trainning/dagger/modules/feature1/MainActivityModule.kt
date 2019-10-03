package io.wewumbo.trainning.dagger.modules.feature1

import dagger.Module
import dagger.Provides
import io.wewumbo.trainning.dagger.ScopeActivity

@Module
class MainActivityModule {

    private var countInstance = 0

    @Provides
    @ScopeActivity
    fun providerActivitySingleTon(): ActivitySingleton {
        return ActivitySingleton()
    }
}