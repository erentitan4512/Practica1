package net.iessochoa.carlosarroyogalan.ejercicio1

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.iessochoa.carlosarroyogalan.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity2:ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent() {
            Ejercicio1Theme {
                ComposecartaArticulo()
            }
        }
    }
}


@Composable
private fun cartaArticulo(
  titulo: String,
  primeradescripcion: String,
  segundaDescricion: String,
  imagenrecort : Painter,
  modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        //Imagen
        Image(painter = imagenrecort, contentDescription = null)
        //Tamaño titulo
        Text(
            text = titulo,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        //Alineacion jutificación del primer texto
        Text(
            text = primeradescripcion,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        //Alineacion y justifiacion del segundo texto
        Text(
            text = segundaDescricion,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposecartaArticulo(){
    cartaArticulo(
        //Darle texto a los objetos declarados en el cartaArticulo
        titulo = stringResource(R.string.Ej4_1_jetpack_compose_tutorial),
        primeradescripcion = stringResource(R.string.Ej4_1_PrimeraDescripcion),
        segundaDescricion = stringResource(R.string.Ej4_1_SegundaDescripcion),
        imagenrecort = painterResource(R.drawable.bg_compose_background__1_)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Ejercicio1Theme  {
        ComposecartaArticulo()
    }
}