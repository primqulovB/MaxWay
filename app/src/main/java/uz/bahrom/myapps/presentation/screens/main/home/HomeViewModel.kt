package uz.bahrom.myapps.presentation.screens.main.home

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val diraction: HomeDiraction
) : HomeContract.HomeViewModel, ViewModel() {
}