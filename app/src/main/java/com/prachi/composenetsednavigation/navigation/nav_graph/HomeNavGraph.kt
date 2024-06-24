package com.prachi.composenetsednavigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.globant.composenestednavigation.navigation.Screen
import com.prachi.composenetsednavigation.screens.DetailScreen
import com.prachi.composenetsednavigation.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(navHostController: NavHostController){
    navigation(startDestination = Screen.Home.route, route = Screen.HomeNav.route)//route = HOME_GRAPH_ROUTE)
    {
        composable(route = Screen.Home.route){
            HomeScreen(navController =  navHostController)
        }
        composable(route = Screen.Detail.route){
            DetailScreen(navController = navHostController)
        }
    }
}

@Composable
fun HomeNavGraph(
    navController: NavHostController,
    logout: () -> Unit
) {
    NavHost(
        navController = navController,
        route = Screen.HomeNav.route,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            HomeScreen(navController =  navController)
        }
        composable(route = Screen.Detail.route){
            DetailScreen(navController = navController)
        }

        /*composable(route = Screen.Home.route){
            Home(navHostController = navController)
        }

        composable(route = ScreenRoutes.ScreenB.route){
            ScreenB(navHostController = navController)
        }

        composable(route = ScreenRoutes.LogoutScreen.route){
            LogoutScreen(navHostController = navController, logout = logout)
        }*/
    }
}