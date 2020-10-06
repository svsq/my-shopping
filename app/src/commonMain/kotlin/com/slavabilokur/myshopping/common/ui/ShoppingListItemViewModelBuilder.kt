package com.slavabilokur.myshopping.common.ui

import com.slavabilokur.myshopping.common.data.ShoppingItem
import net.apptronic.core.component.context.Context
import net.apptronic.core.mvvm.viewmodel.navigation.ViewModelBuilder

object ShoppingListItemViewModelBuilder : ViewModelBuilder<ShoppingItem, Int, ShoppingListItemViewModel> {
    override fun getId(item: ShoppingItem) = item.id

    override fun onCreateViewModel(parent: Context, item: ShoppingItem): ShoppingListItemViewModel {
        return parent.shoppingListItemViewModel().also { onUpdateViewModel(it, item) }
    }

    override fun onUpdateViewModel(viewModel: ShoppingListItemViewModel, newItem: ShoppingItem) {
        viewModel.item.set(newItem)
    }
}