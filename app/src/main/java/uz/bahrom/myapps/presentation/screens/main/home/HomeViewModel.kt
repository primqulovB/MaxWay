package uz.bahrom.myapps.presentation.screens.main.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val direction: HomeDirection
) : HomeContract.HomeViewModel, ViewModel() {
}