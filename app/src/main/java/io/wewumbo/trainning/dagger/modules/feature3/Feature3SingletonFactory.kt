package io.wewumbo.trainning.dagger.modules.feature3

import javax.inject.Provider


class Feature3SingletonFactory(val feature3Component: Provider<Feature3Component.Builder>) {

    val feature3Singleton: Feature3Singleton get() {
        return feature3Component.get().build().requestFeature3Singleton()
    }
}