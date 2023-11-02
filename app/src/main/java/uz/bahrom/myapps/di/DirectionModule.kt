package uz.bahrom.myapps.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.bahrom.myapps.presentation.screens.login.login.LoginContract
import uz.bahrom.myapps.presentation.screens.login.login.LoginDirection
import uz.bahrom.myapps.presentation.screens.login.register.RegisterContract
import uz.bahrom.myapps.presentation.screens.login.register.RegisterDirection
import uz.bahrom.myapps.presentation.screens.main.detail.DetailContract
import uz.bahrom.myapps.presentation.screens.main.detail.DetailDirection
import uz.bahrom.myapps.presentation.screens.main.home.HomeContract
import uz.bahrom.myapps.presentation.screens.main.home.HomeDirection
import uz.bahrom.myapps.presentation.screens.splash.SplashContract
import uz.bahrom.myapps.presentation.screens.splash.SplashDirection
import javax.inject.Singleton

@[Module InstallIn(SingletonComponent::class)]
interface DirectionModule {

    @[Binds Singleton]
    fun bindSplashDirection(impl: SplashDirection): SplashContract.SplashDirection

    @[Binds Singleton]
    fun bindHomeDirection(impl: HomeDirection): HomeContract.HomeDirection

    @[Binds Singleton]
    fun bindLoginDirection(impl: LoginDirection): LoginContract.LoginDirection

    @[Binds Singleton]
    fun bindRegisterDirection(impl: RegisterDirection): RegisterContract.RegisterDirection

    @[Binds Singleton]
    fun bindDetailDirection(impl: DetailDirection): DetailContract.DetailDirection
}