package io.wewumbo.trainning.dagger.modules

class ActivitySingleton  {

    companion object {
        private var count = 0
    }

    init {
        count++
    }

    fun say() = "Activity Singleton: $count"

}