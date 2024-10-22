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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                MainScream()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        MainScream()
    }

}
@Composable
fun MainScream() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Para que haya espacio entre los elementos
    ) {
        // Parte superior con foto, nombre, trabajo
        superior(
            nombre = stringResource(R.string.nombre),
            trabajo = stringResource(R.string.Trabajo),
            //Imagen de drawable
            foto = painterResource(id = R.drawable.images)
        )

        // Datos de contacto, telefono, social y email
        inferior(
            telefono = stringResource(R.string.telefono),
            social = stringResource(R.string.RedesSociales),
            email = stringResource(R.string.email)
        )
    }
}

//Parte superior
@Composable
fun superior(
    nombre: String,
    trabajo: String,
    foto: Painter) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        // Imagen circular
        Image(
            painter = foto,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )

        // Nombre
        Text(
            text = nombre,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            modifier = Modifier.padding(top = 8.dp)
        )

        // Trabajo
        Text(
            text = trabajo,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
    }
}

@Composable
fun inferior(
    telefono: String,
    social: String,
    email: String) {
    Column(
        modifier = Modifier.padding(100.dp, 0.dp, 100.dp, 0.dp),
        horizontalAlignment = Alignment.Start
    ) {
        // Teléfono
        Row(verticalAlignment = Alignment.CenterVertically) {
            //Diferentes iconos con el texto
            Icon(
                //Vector de el telefono
                imageVector = Icons.Default.Phone,
                contentDescription = stringResource(R.string.contenido),
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = telefono, style = MaterialTheme.typography.bodySmall)
        }

        // Social
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                //Vector de redes
                imageVector = Icons.Default.Share,
                contentDescription = stringResource(R.string.contenido2),
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = social, style = MaterialTheme.typography.bodySmall)
        }

        // Email
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                //Vector de email
                imageVector = Icons.Default.Email,
                contentDescription = stringResource(R.string.cotenido3),
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = email, style = MaterialTheme.typography.bodySmall)
        }
    }
}