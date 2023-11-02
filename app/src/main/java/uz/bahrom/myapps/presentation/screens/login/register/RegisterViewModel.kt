package uz.bahrom.myapps.presentation.screens.login.register

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val direction: RegisterDirection
) : RegisterContract.RegisterViewModel, ViewModel() {
}