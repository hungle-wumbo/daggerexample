package io.wewumbo.trainning.dagger

class ActivitySingleton  {

    companion object {
        private var count = 0
    }

    fun say() = "Activity Singleton: $count"

}