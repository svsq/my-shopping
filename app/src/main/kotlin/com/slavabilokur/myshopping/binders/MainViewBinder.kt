package com.slavabilokur.myshopping.binders

import android.view.View
import com.slavabilokur.myshopping.common.viewmodel.MainViewModel
import com.slavabilokur.myshopping.R
import kotlinx.android.synthetic.main.main.view.*
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.bindText

class MainViewBinder : ViewBinder<MainViewModel>() {

    override var layoutResId: Int? = R.layout.main

    override fun onBindView(view: View, viewModel: MainViewModel) {
        with(view) {
            bindText(helloText, viewModel.text)
        }
    }

}