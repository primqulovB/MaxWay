package uz.bahrom.myapps.presentation.screens.main.detail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val direction: DetailDirection
) : DetailContract.DetailViewModel, ViewModel() {

}