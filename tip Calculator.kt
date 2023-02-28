package com.example.tipcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tipcalculator.ui.theme.TipCalculatorTheme
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TipCalculator()
                }
            }
        }
    }
}

@Composable
fun TipCalculator() {
    var amountInput by remember{mutableStateOf("") }
    var amount=amountInput.toDoubleOrNull()?:0.0
    var tip= calculateAmount(amount)

    Column(modifier = Modifier.padding(30.dp)){
        Text(text = "Tip Calculator",
                fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(20.dp))
        InputField(value = amountInput, onValueChange = {amountInput=it})
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Total Amount $tip",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
@Composable
fun InputField(value:String,onValueChange:(String)->Unit){
    TextField(
        value = value,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        singleLine = true,
        label = {
            Text("Enter Amount",
            modifier= Modifier.fillMaxWidth(),

            )
        }
    )
}
private  fun calculateAmount(amount:Double,tipPercent:Double=15.0):String{
    val tip=tipPercent/100 * amount
    return  NumberFormat.getCurrencyInstance().format(tip)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TipCalculatorTheme {
        TipCalculator()
    }
}