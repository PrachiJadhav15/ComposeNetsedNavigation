package com.prachi.composenetsednavigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.globant.composenestednavigation.navigation.Screen
import com.prachi.composenetsednavigation.navigation.nav_graph.authNavGraph

@Composable
fun SetupNavigationGraph(navHostController : NavHostController)
{
   NavHost(navController = navHostController,
       startDestination = Screen.AuthNav.route
   ){
       authNavGraph(navHostController)
       homeNavGraph(navHostController)
}
}