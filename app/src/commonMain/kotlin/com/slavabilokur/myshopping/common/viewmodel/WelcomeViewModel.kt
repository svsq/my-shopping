package com.slavabilokur.myshopping.common.viewmodel

import net.apptronic.core.commons.navigation.injectNavigationRouter
import net.apptronic.core.component.context.Contextual
import net.apptronic.core.component.context.viewModelContext
import net.apptronic.core.mvvm.viewmodel.ViewModel
import net.apptronic.core.mvvm.viewmodel.ViewModelContext

fun Contextual.welcomeViewModel() = WelcomeViewModel(viewModelContext())

class WelcomeViewModel(context: ViewModelContext) : ViewModel(context) {

    // inject navigtion router
    private val router = injectNavigationRouter()

    fun onStartButtonClick() {
        router.sendCommands(OpenMainScreen())
    }

    fun onCloseApp() {
        router.sendCommands(CloseApp())
    }
}