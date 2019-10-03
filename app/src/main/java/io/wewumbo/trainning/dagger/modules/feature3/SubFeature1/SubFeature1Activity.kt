package io.wewumbo.trainning.dagger.modules.feature3.SubFeature1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.wewumbo.trainning.dagger.ApplicationSingleton
import io.wewumbo.trainning.dagger.R
import io.wewumbo.trainning.dagger.ScopeActivity
import io.wewumbo.trainning.dagger.modules.feature2.Feature2Activity
import io.wewumbo.trainning.dagger.modules.feature3.Feature3Singleton
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class SubFeature1Activity : AppCompatActivity() {

    @Inject
    lateinit var applicationSingleton: ApplicationSingleton

    @Inject
    lateinit var feature3Singleton: Feature3Singleton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = "${applicationSingleton.say()}\r\n ${feature3Singleton.say()}"
        text.setOnClickListener {
            startActivity(Intent(MainActivity@this, Feature2Activity::class.java))
        }
    }

    @Module
    abstract class BindModule {

        @ScopeActivity
        @ContributesAndroidInjector(modules = [
        ])
        abstract fun contributeActivity(): SubFeature1Activity
    }
}
