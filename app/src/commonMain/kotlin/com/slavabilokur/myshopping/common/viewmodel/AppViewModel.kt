package com.slavabilokur.myshopping.common.viewmodel

import net.apptronic.core.commons.navigation.DefaultNavigationHandler
import net.apptronic.core.commons.navigation.hostNavigationRouter
import net.apptronic.core.commons.navigation.navigationRouter
import net.apptronic.core.commons.navigation.registerNavigationHandler
import net.apptronic.core.component.context.Contextual
import net.apptronic.core.component.context.dependencyModule
import net.apptronic.core.component.context.viewModelContext
import net.apptronic.core.mvvm.viewmodel.ViewModel
import net.apptronic.core.mvvm.viewmodel.ViewModelContext
import net.apptronic.core.mvvm.viewmodel.adapter.BasicTransition
import net.apptronic.core.mvvm.viewmodel.navigation.stackNavigator

fun Contextual.appViewModel() = AppViewModel(
    viewModelContext {
        dependencyModule {
            navigationRouter()
        }
    }
)

class AppViewModel(context: ViewModelContext) : ViewModel(context), DefaultNavigationHandler {

    // root app navigation container
    val appNavigator = stackNavigator()

    /*init {
        hostNavigationRouter()
    }*/

    init {
        registerNavigationHandler(this)
        appNavigator.set {
            welcomeViewModel()
        }
    }

    override fun onNavigationCommand(command: Any): Boolean {
        return when (command) {
            // handle commands here
            is OpenMainScreen -> {
                appNavigator.add(mainViewModel(), BasicTransition.Forward)
                true
            }
            is CloseApp -> {
                closeSelf()
                true
            }
            else -> false
        }
    }

    fun onBackPressed(): Boolean {
        // handle system back button pressed
        // return true to notify action handled
        // return false to perform default system action (finish Activity for Android)
        return appNavigator.popBackStack(BasicTransition.Backward)
    }

}