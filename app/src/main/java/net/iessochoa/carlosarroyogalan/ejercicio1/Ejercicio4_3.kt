package net.iessochoa.carlosarroyogalan.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.iessochoa.carlosarroyogalan.ejercicio1.ui.theme.Ejercicio1Theme

class ManinActivity:ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent() {
            Ejercicio1Theme  {

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Ejercicio1Theme  {
        CuadrosconInfo()
    }
}

@Composable
private fun Informacion(
    titulo:String,
    descripcion:String,
    fondo: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(fondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
private fun CuadrosconInfo(){
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)){
            Informacion(
                titulo = stringResource(R.string.Ej4_3_text_composable),
                descripcion = stringResource(R.string.Ej4_3_displays_text_and_follows_the_recommended_material_design_guidelines),
                fondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Informacion(
                titulo = stringResource(R.string.Ej4_3image_composable),
                descripcion = stringResource(R.string.Ej4_3creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                fondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)){
            Informacion(
                titulo = stringResource(R.string.Ej4_3row_composable),
                descripcion = stringResource(R.string.Ej4_3_a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                fondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Informacion(
                titulo = stringResource(R.string.Ej4_3column_composable),
                descripcion = stringResource(R.string.Ej4_3_a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                fondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}