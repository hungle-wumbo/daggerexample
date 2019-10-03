package io.wewumbo.trainning.dagger.modules.feature3

class Feature3Singleton  {

    companion object {
        private var count = 0
    }

    fun say() = "Feature Singleton: $count"

}