package me.carlossanchez.tallergithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Perfil()
        }
    }
}

@Composable
fun Perfil() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF202033))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(30.dp)
                )
                .padding(
                    start = 22.dp,
                    end = 22.dp,
                    top = 26.dp,
                    bottom = 22.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFB8CBD5)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.foto_perfil),
                    contentDescription = "Foto de perfil",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "Usuario",
                fontSize = 19.sp,
                color = Color(0xFF667085)
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Descripcion",
                fontSize = 14.sp,
                color = Color(0xFF98A2B3)
            )

            Spacer(modifier = Modifier.height(26.dp))

            HorizontalDivider(
                color = Color(0xFFE4E7EC)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "-",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp,
                color = Color(0xFF667085)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "-",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp,
                color = Color(0xFF667085)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "-",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp,
                color = Color(0xFF667085)
            )

            Spacer(modifier = Modifier.height(20.dp))

            HorizontalDivider(
                color = Color(0xFFE4E7EC)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "-",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp,
                color = Color(0xFF667085)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFB3D9F5))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PerfilPreview() {
    Perfil()
}