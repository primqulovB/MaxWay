package uz.bahrom.myapps.presentation.screens.login.login

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val direction: LoginDirection
) : LoginContract.LoginViewModel, ViewModel() {
}