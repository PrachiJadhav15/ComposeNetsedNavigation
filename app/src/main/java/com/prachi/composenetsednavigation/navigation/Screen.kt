package com.globant.composenestednavigation.navigation

/*const val PRODUCT_ID_KEY = "id"
const val PRODUCT_ID_NAME = "name"

const val ROUTE_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"*/

sealed class Screen(val route:String){
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen")
    object Login : Screen(route = "login_screen")
    object Signup : Screen(route = "signup_screen")

    //Graph Routes
    object AuthNav : Screen(route = "AUTH_NAV_GRAPH")
    object HomeNav : Screen(route = "HOME_NAV_GRAPH")
}

