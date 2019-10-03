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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = applicationSingleton.say()
    }

    @Module
    abstract class BindModule {

        @ScopeActivity
        @ContributesAndroidInjector()
        abstract fun contributeActivity(): MainActivity
    }
}
