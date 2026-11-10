package composables


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun Boton(){
    Button(onClick = {}) {
        Text("Ver puntos")
    }
}