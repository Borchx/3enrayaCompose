package com.borja.android.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.borja.android.tictactoe.ui.core.ContentWrapper
import com.borja.android.tictactoe.ui.game.GameScreen
import com.borja.android.tictactoe.ui.home.HomeScreen
import com.borja.android.tictactoe.ui.theme.TicTacToeTheme
import dagger.hilt.android.AndroidEntryPoint


// Listado de partidas
    // board: List<String> = 9 posiciones
    // gameId: String
    // Player 1
    // Player Id
    // Player Type
    // Player 2
    // Player Turn

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navigationController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //HomeScreen()
                    //GameScreen()
                    navigationController = rememberNavController()
                    ContentWrapper(navigationController)
                }
            }
        }
    }
}

