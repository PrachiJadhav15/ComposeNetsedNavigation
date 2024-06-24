package com.prachi.composenetsednavigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.globant.composenestednavigation.navigation.Screen
import com.prachi.composenetsednavigation.screens.LoginScreen
import com.prachi.composenetsednavigation.screens.SignupScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController){
    navigation(startDestination = Screen.Login.route, route = Screen.AuthNav.route){
        composable(route = Screen.Login.route){
            LoginScreen(navController =  navHostController)
        }
        composable(route = Screen.Signup.route){
            SignupScreen(navController = navHostController)
        }
    }
}