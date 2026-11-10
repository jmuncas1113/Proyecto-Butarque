package composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun ScreenBox(){
    Box(){
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFFD7DFE4), RoundedCornerShape(16.dp))
            .padding(16.dp)) {
            Imagen()
            Text("Imagen: dibujo propio", fontSize = 12.sp)
            Text("Industria", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            Text("Industrias y tejido productivo", fontSize = 12.sp)
            Text("4 puntos en el mapa", fontSize = 12.sp)
            Boton()
        }
    }
}