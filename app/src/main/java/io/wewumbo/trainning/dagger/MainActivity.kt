package io.wewumbo.trainning.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Module
import dagger.android.ContributesAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var applicationSingleton: ApplicationSingleton

    @Inject
    lateinit var activitySingleton: ActivitySingleton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = "${applicationSingleton.say()}\r\n ${activitySingleton.say()}"
    }

    @Module
    abstract class BindModule {

        @ScopeActivity
        @ContributesAndroidInjector(modules = [
            MainActivityModule::class
        ])
        abstract fun contributeActivity(): MainActivity
    }
}
