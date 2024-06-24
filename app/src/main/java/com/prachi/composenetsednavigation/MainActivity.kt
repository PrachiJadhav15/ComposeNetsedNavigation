package com.prachi.composenetsednavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.prachi.composenetsednavigation.navigation.nav_graph.SetupNavigationGraph
import com.prachi.composenetsednavigation.ui.theme.ComposeNetsedNavigationTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNetsedNavigationTheme {
                navController = rememberNavController()
                SetupNavigationGraph(navHostController = navController)
            }
        }
    }
}
