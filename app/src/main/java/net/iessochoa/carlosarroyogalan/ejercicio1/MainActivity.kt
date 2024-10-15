package net.iessochoa.carlosarroyogalan.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
//Fondo añadido
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//Añadido para que importe el color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.carlosarroyogalan.ejercicio1.ui.theme.Ejercicio1Theme
//Añadido para que importe la unidad de tamaño dp
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //Surface añadido para contener los elementos como el texto y para poder modificar el color del background
    Surface(color = Color.Magenta) {
        //Añadido el texto con el modificador de tamaño del fondo
        Text(text = "Hi, my name is $name", modifier = Modifier.padding(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        Greeting("Carlos")
    }
}