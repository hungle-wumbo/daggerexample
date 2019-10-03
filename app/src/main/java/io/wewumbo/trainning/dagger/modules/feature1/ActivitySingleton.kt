package io.wewumbo.trainning.dagger.modules.feature1

class ActivitySingleton  {

    companion object {
        private var count = 0
    }

    fun say() = "Activity Singleton: $count"

}