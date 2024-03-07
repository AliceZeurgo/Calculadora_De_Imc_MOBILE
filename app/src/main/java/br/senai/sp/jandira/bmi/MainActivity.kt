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
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.ui.theme.BmiTheme
import java.util.concurrent.RecursiveTask

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
                   .fillMaxWidth()
                   .height(180.dp),
                  horizontalAlignment = Alignment.CenterHorizontally
           ){
            Card (
                shape = CircleShape,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 25.dp)
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
                        fontSize = 25.sp
                    )
                }
            }
           }
       }
       Card (
           modifier = Modifier
               .height(460.dp)
               .padding(horizontal = 40.dp)
               .padding(vertical = 20.dp)
               .offset(x = 0.dp, y = -50.dp)
               .align(
                   Alignment.CenterHorizontally,
               )
       ){
           Column (
               modifier = Modifier
                   .padding(10.dp),
               horizontalAlignment = Alignment.CenterHorizontally

           ){
               Text(text = "Seus dados",
                   color = Color(0xFFB60000),
                   fontSize = 25.sp,
                   fontWeight = FontWeight.ExtraBold

                   )
               Column (
                   modifier = Modifier
                       .padding(vertical = 50.dp)
               ){
                   Text(text = "Seu peso:",
                       color = Color(0xffb60000)
                   )
                   OutlinedTextField(value = "Seu peso em kg", onValueChange = {})
               }
               Column (
                   modifier = Modifier
                       .padding(10.dp)
               ) {
                   Text(text = "Sua altura:",
                       color = Color(0xffb60000))
                   OutlinedTextField(value = "Sua altura em cm", onValueChange = {})
               }
               Button(onClick = {},
                   modifier = Modifier
                       .width(300.dp)
                       .height(50.dp),
                      elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
                   colors = ButtonDefaults.buttonColors(
                       containerColor = Color(0xffDA0F0F)
                   )
                   ) {
                   Text(text = "CALCULAR",
                       )
               }
           }
       }

       Box(
           modifier = Modifier
               .offset(x = 0.dp, y = 55.dp)
               .width(320.dp)
               .height(120.dp)
               .offset(x = 40.dp, y = -105.dp)
               .background(color = Color(0xFF2D6D1F)
               )

       ){
           Row {
               Column(
                   horizontalAlignment = Alignment.CenterHorizontally,
                   modifier = Modifier
                       .fillMaxHeight()
                       .padding(25.dp, 25.dp)
               ) {
                   Text(
                       text = "Resultado",
                       color = Color.White,
                       fontSize = 15.sp
                   )
                   Text(
                       text = "Peso Ideal!",
                       color = Color.White,
                       fontSize = 25.sp
                   )
               }
               Text(
                   text = "21.3",
                   color = Color.White,
                   fontSize = 40.sp,
                   modifier = Modifier.offset(x = 30.dp, y = 30.dp)
               )

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