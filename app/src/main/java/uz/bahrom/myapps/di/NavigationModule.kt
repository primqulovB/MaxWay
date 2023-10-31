package uz.bahrom.myapps.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.bahrom.myapps.utils.navigation.AppNavigationDispatcher
import uz.bahrom.myapps.utils.navigation.AppNavigator
import uz.bahrom.myapps.utils.navigation.AppNavigatorHandler

@[Module InstallIn(SingletonComponent::class)]
interface NavigationModule {

    @Binds
    fun provideAppNavigator(impl: AppNavigationDispatcher): AppNavigator

    @Binds
    fun provideAppNavigatorHandler(impl: AppNavigationDispatcher): AppNavigatorHandler
}