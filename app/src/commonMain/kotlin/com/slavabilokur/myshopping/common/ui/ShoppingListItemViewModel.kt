package com.slavabilokur.myshopping.common.ui

import com.slavabilokur.myshopping.common.data.ShoppingItem
import net.apptronic.core.commons.navigation.injectNavigationRouter
import net.apptronic.core.component.context.Contextual
import net.apptronic.core.component.context.viewModelContext
import net.apptronic.core.component.value
import net.apptronic.core.mvvm.viewmodel.ViewModel
import net.apptronic.core.mvvm.viewmodel.ViewModelContext

fun Contextual.shoppingListItemViewModel(item: ShoppingItem) = ShoppingListItemViewModel(viewModelContext(), item)

class ShoppingListItemViewModel(context: ViewModelContext, item: ShoppingItem) : ViewModel(context) {

    private val router = injectNavigationRouter()

    /*val item = value<ShoppingItem>()

    val name = value(item.name)
    val price = value(item.price)
    val isChecked = value(item.isChecked)*/
    // TODO uncomment & fix it

    fun onClick() {
        // TODO implement click action
    }

}