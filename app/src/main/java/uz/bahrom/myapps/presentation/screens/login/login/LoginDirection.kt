package uz.bahrom.myapps.presentation.screens.login.login

import uz.bahrom.myapps.utils.navigation.AppNavigator
import javax.inject.Inject

class LoginDirection @Inject constructor(
    private val navigator: AppNavigator
) : LoginContract.LoginDirection {
}