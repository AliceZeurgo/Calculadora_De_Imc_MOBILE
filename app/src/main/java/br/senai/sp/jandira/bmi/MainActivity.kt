package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.ui.theme.BmiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BmiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
   Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color(0xFFEE3434))
            .padding(16.dp)){
                  Image(painter = painterResource(id = R.drawable.bmi),
                      contentDescription = "imc",
                      modifier = Modifier.padding(vertical = 20.dp, horizontal = 129.dp))

           }
       }
    Column (
        modifier = Modifier
            .padding(horizontal = 129.dp,
                vertical = 150.dp)
    ) {
        Text(
            text = "Calculadora IMC",
            fontSize = 17.sp,
            fontWeight = FontWeight.W900,
            color = Color.White
        )
    }
    Column(
        modifier = Modifier
            .padding(horizontal = 135.dp,
                vertical = 190.dp)
            .width(14000.dp)
            .height(1400.dp)
            .background(Color(0xFFF5EEEE))
                )
    {
      {

        }
    }
   }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BmiTheme {
        Greeting()
    }
}