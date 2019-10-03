package io.wewumbo.trainning.dagger.modules.feature3

import dagger.Subcomponent
import io.wewumbo.trainning.dagger.modules.feature3.SubFeature1.SubFeature1Activity

@ScopeFeature3
@Subcomponent(
    modules = [
        Feature3Module::class,
        SubFeature1Activity.BindModule::class
    ]
)
interface Feature3Component {

    fun requestFeature3Singleton(): Feature3Singleton

    @Subcomponent.Builder
    interface Builder {
        fun build(): Feature3Component
    }
}