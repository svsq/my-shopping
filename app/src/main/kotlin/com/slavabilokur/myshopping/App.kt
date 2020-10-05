package com.slavabilokur.myshopping

import android.app.Application
import com.slavabilokur.myshopping.common.AppComponent
import com.slavabilokur.myshopping.common.appContext
import com.slavabilokur.myshopping.common.viewmodel.AppViewModel
import net.apptronic.core.android.plugins.installAndroidApplicationPlugin
import net.apptronic.core.component.context.dependencyModule

class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        val appContext = appContext()
        appContext.installAndroidApplicationPlugin(this) {
            binderFactory(AppBinderFactory)
            bindActivity(AppActivity::class, AppViewModel::class) { it.onBackPressed() }
        }
        appContext.dependencyModule(androidAppModule(this))
        appComponent = AppComponent(appContext)
    }

}