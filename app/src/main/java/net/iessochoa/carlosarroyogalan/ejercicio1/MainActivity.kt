package net.iessochoa.carlosarroyogalan.ejercicio1

import android.media.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.carlosarroyogalan.ejercicio1.ui.theme.Ejercicio1Theme
//Añadido para que importe la unidad de tamaño dp
import androidx.compose.ui.unit.dp
//Añadida la unidad de tamaño sp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource


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
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.From)
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.From)
        )
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
                //Centrado Horizontalmente
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

//Funcion de componibilidad para la imagen de fondo
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    //Imagen de fondo llamada de drawable
    val image = painterResource(R.drawable.androidparty)
    Box(modifier){
        //La imagen añadida
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F

        )
        //Texto de bienvenida
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}