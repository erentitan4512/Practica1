package net.iessochoa.carlosarroyogalan.ejercicio1.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.carlosarroyogalan.ejercicio1.R

class MainActivity:ComponentActivity(){
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
fun GreetingPreview() {
    Ejercicio1Theme  {
        ArticuloCard()
    }
}

@Composable
private fun ArticuloCard() {
    //Modificador llenandolo en su maximo espacio y tamaño, centrandolo y alineandolo al centro
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ){
        //Imagen declarada desde drawable
        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        //Texto "All tasks completed" centrado y modificado su tamaño y tipo de letra.
        Text(
            text = stringResource(R.string.Ejercicio4_2_all_tasks_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        //Texto "Nice Work!" con un tamaño de letra especifico
        Text(
            text = stringResource(R.string.Ej4_2_nice_work),
            fontSize = 16.sp
        )
    }

}