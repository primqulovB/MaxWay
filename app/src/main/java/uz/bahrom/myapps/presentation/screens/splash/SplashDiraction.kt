package uz.bahrom.myapps.presentation.screens.splash

import uz.bahrom.myapps.AppNavigationDirections
import uz.bahrom.myapps.utils.navigation.AppNavigator
import javax.inject.Inject

class SplashDiraction @Inject constructor(
    private val navigator: AppNavigator
) : SplashContract.SplashDirection {
    override suspend fun moveToLoginScreen() {
        navigator.navigateTo(SplashScreenDirections.actionSplashScreenToLoginScreen())
    }

    override suspend fun moveToHomeScreen() {
        navigator.navigateTo(AppNavigationDirections.actionSplashScreenToHomeScreen())
    }
}