package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
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
       Card {
           Column (
               modifier = Modifier
                   .background(color = Color(0xFFB81010))
                   .width(3000.dp)
                   .height(200.dp)
           ){
            Card (
                shape = CircleShape,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)


            ){
                Card (
                    modifier = Modifier
                        .padding(0.dp)
                        .size(90.dp)
                ){

                    //Adiciona a imagem dentro do card!! (Como por exemplo para icone de perfil do usuario)
                    Image(painter = painterResource(id = R.drawable.bmi)
                        , contentDescription = "BMI."
                    )
                    Text(text = "Calculadora IMC",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.W900,
                        modifier = Modifier
                            .offset(x = 10.dp, y = 10.dp )
                    )
                }
            }
           }
       }
       Card (
           modifier = Modifier
               .padding(vertical = 20.dp)
               .align(
                   Alignment.CenterHorizontally,
               )
       ){
           Column (
               modifier = Modifier
                   .padding(10.dp)
           ){
               Text(text = "Seus dados",
                   color = Color(0xFFB60000),
                   modifier = Modifier

                   )
               Column {
                   Text(text = "Seu peso:")
                   OutlinedTextField(value = "Seu peso em kg", onValueChange = {})
               }
               Column (
                   modifier = Modifier
                       .padding(10.dp)
               ) {
                   Text(text = "Sua altura:")
                   OutlinedTextField(value = "Sua altura em cm", onValueChange = {})
               }
               Button(onClick = {}) {
                   Text(text = "CALCULAR")
               }
           }
       }
       Card (
           modifier = Modifier
               .background(Color(0xFF40A249)),

       ){
           Row (
               modifier = Modifier
                   .background(Color(0xFF40A249))
           ){
                Column {
                    Text(text = "Resultado")
                    Text(text = "Peso Ideal")
                }
               Text(text = "21.3")
           }
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

// Column (
//                  modifier = Modifier
//                      .fillMaxWidth()
//                      .height(200.dp),
//                  horizontalAlignment = Alignment.CenterHorizontally,
//                  verticalArrangement = Arrangement.SpaceEvenly,
//
//                  ){
//                  TextField(value = "", onValueChange = {},
//                      placeholder = {
//                          Text(
//                              text = "Seu peso em kg"
//                          )
//
//                      },
//                      colors = OutlinedTextFieldDefaults
//                          .colors(
//                              focusedBorderColor = Color(0xFFed145b),
//                              unfocusedBorderColor = Color(0xffed145b)
//                          ),
//                      shape = RoundedCornerShape(12.dp),
//                      modifier = Modifier
//                          .height(50.dp)
//
//                  )
//              }