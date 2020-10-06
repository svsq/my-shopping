package com.slavabilokur.myshopping

import com.slavabilokur.myshopping.binders.AppViewBinder
import com.slavabilokur.myshopping.binders.MainViewBinder
import com.slavabilokur.myshopping.binders.WelcomeViewBinder
import net.apptronic.core.android.viewmodel.viewBinderFactory

// all ViewBinders should be registered here
val AppBinderFactory = viewBinderFactory {
    add(::AppViewBinder)
    add(::WelcomeViewBinder)
    add(::MainViewBinder)
}