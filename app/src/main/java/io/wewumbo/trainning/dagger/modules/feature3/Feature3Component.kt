package io.wewumbo.trainning.dagger.modules.feature3

import dagger.Subcomponent

@ScopeFeature3
@Subcomponent(
    modules = [
        Feature3Module::class
    ]
)
interface Feature3Component {

    fun requestFeature3Singleton(): Feature3Singleton

    @Subcomponent.Builder
    interface Builder {
        fun requestModule(module: Feature3Module): Builder
        fun build(): Feature3Component
    }
}