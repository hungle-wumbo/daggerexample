package io.wewumbo.trainning.dagger.modules.feature1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.wewumbo.trainning.dagger.ApplicationSingleton
import io.wewumbo.trainning.dagger.R
import io.wewumbo.trainning.dagger.ScopeActivity
import io.wewumbo.trainning.dagger.modules.ActivitySingleton
import io.wewumbo.trainning.dagger.modules.feature2.Feature1Activity
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
        text.setOnClickListener {
            startActivity(Intent(MainActivity@this, Feature1Activity::class.java))
        }
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
