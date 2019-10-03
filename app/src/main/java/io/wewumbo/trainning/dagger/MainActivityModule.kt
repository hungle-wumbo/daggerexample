package io.wewumbo.trainning.dagger

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    private var countInstance = 0

    @Provides
    @ScopeActivity
    fun providerActivitySingleTon(): ActivitySingleton {
        return ActivitySingleton()
    }
}