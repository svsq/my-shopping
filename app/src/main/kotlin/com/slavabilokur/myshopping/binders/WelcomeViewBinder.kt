package com.slavabilokur.myshopping.binders

import android.view.View
import com.slavabilokur.myshopping.common.viewmodel.MainViewModel
import com.slavabilokur.myshopping.R
import com.slavabilokur.myshopping.common.viewmodel.WelcomeViewModel
import kotlinx.android.synthetic.main.screen_main.view.*
import kotlinx.android.synthetic.main.screen_welcome.view.*
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.bindClickListener
import net.apptronic.core.android.viewmodel.bindings.bindText

class WelcomeViewBinder : ViewBinder<WelcomeViewModel>() {

    override var layoutResId: Int? = R.layout.screen_welcome

    override fun onBindView(view: View, viewModel: WelcomeViewModel) {
        with(view) {
            bindClickListener(btnGetStarted, viewModel::onStartButtonClick)
        }
    }

}