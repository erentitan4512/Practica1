package net.iessochoa.carlosarroyogalan.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
//Fondo añadido
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//Añadido para que importe el color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.carlosarroyogalan.ejercicio1.ui.theme.Ejercicio1Theme
//Añadido para que importe la unidad de tamaño dp
import androidx.compose.ui.unit.dp
//Añadida la unidad de tamaño sp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    GreetingText(
                        message = "Feliz Cumpleaños Maria",
                        from = "De Carlos",
                        //Actualizamos el parametro del modificador
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        GreetingText(message = "Feliz Cumpleaños Maria!", from = "De Carlos")
    }
}

//Nueva función
@Composable
fun GreetingText(message: String, from: String,modifier: Modifier = Modifier){
    //Para centrar el saludo, usamos el vertical alignment y el modifier para especificar
    Column(verticalArrangement = Arrangement.Center,
            modifier = modifier) {
        //Elemento Text para que pase el mensaje
        Text(
            text = message,
            //Tamaño de la fuente
            fontSize = 100.sp,
            //Altura de linea
            lineHeight = 116.sp,
            //Centramos el texto con TextAlign
            textAlign = TextAlign.Center
        )
        //Otro elemento text para que agregue el from
        Text(
            text = from,
            fontSize = 36.sp,
            //Agregamos el padding para que se vaya a la linea derecha
            modifier = Modifier
                .padding(16.dp)
                    .align(alignment = Alignment.End)
        )
    }
}