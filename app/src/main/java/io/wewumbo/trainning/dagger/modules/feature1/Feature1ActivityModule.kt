package io.wewumbo.trainning.dagger.modules.feature1

import dagger.Module
import dagger.Provides
import io.wewumbo.trainning.dagger.ScopeActivity
import io.wewumbo.trainning.dagger.modules.ActivitySingleton

@Module
class Feature1ActivityModule {

    private var countInstance = 0

    @Provides
    @ScopeActivity
    fun providerActivitySingleTon(): ActivitySingleton {
        return ActivitySingleton()
    }
}