package com.slavabilokur.myshopping.common.ui

import com.slavabilokur.myshopping.common.data.ShoppingItem
import net.apptronic.core.commons.navigation.injectNavigationRouter
import net.apptronic.core.component.context.Contextual
import net.apptronic.core.component.context.viewModelContext
import net.apptronic.core.component.value
import net.apptronic.core.mvvm.viewmodel.ViewModel
import net.apptronic.core.mvvm.viewmodel.ViewModelContext

fun Contextual.shoppingListItemViewModel() = ShoppingListItemViewModel(viewModelContext())

class ShoppingListItemViewModel(context: ViewModelContext) : ViewModel(context) {

    private val router = injectNavigationRouter()

    val item = value<ShoppingItem>()

    fun onClick() {
        // TODO implement click action
    }

}