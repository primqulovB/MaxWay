package uz.bahrom.myapps.presentation.screens.splash

interface SplashContract {
    interface SplashDirection {
        suspend fun moveToLoginScreen()
        suspend fun moveToHomeScreen()
    }

    interface SplashViewModel {
    }
}