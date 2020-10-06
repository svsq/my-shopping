package com.slavabilokur.myshopping.binders

import android.view.View
import com.slavabilokur.myshopping.R
import com.slavabilokur.myshopping.common.ui.ShoppingListItemViewModel
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.bindClickListener

class ShoppingListItemViewBinder : ViewBinder<ShoppingListItemViewModel>() {

    override var layoutResId: Int? = R.layout.item_shopping_list

    override fun onBindView(view: View, viewModel: ShoppingListItemViewModel) {
        with(view) {
            bindClickListener(view, viewModel::onClick)

        }
    }
}