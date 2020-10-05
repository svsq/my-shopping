package com.slavabilokur.myshopping.binders

import android.view.View
import com.slavabilokur.myshopping.common.viewmodel.AppViewModel
import com.slavabilokur.myshopping.R
import kotlinx.android.synthetic.main.app.view.*
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.navigation.bindStackNavigator

class AppViewBinder : ViewBinder<AppViewModel>() {

    override var layoutResId: Int? = R.layout.app

    override fun onBindView(view: View, viewModel: AppViewModel) {
        with(view) {
            bindStackNavigator(appContainer, viewModel.appNavigator)
        }
    }

}