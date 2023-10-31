package uz.bahrom.myapps.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.bahrom.myapps.presentation.screens.splash.SplashContract
import uz.bahrom.myapps.presentation.screens.splash.SplashDiraction
import javax.inject.Singleton

@[Module InstallIn(SingletonComponent::class)]
interface DiractionModule {

    @[Binds Singleton]
    fun bindSplashDiraction(impl: SplashDiraction): SplashContract.SplashDirection
}