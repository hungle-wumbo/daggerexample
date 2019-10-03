package io.wewumbo.trainning.dagger.modules.feature3.subfeature1

import dagger.Module
import dagger.Provides
import io.wewumbo.trainning.dagger.ScopeActivity
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Component
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Singleton

@Module
class SubFeature1Module {

    @Provides
    @ScopeActivity
    fun providerActivitySingleTon(builder: Feature3Component.Builder): Feature3Singleton {
        return builder.build().requestFeature3Singleton()
    }

}