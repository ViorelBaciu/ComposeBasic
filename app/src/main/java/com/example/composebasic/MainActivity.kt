package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasic.ui.theme.ComposeBasicTheme
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingApp()
                }
            }
        }
    }
    @Composable
    fun GreetingApp(){
        GreetingAppCard(
            message = stringResource(R.string.message),
            message2 = stringResource(R.string.message2),
            message3 = stringResource(R.string.message3),
            imagePainter = painterResource(R.drawable.bg_compose_background)
        )
    }
    @Composable
    fun GreetingAppCard(
        message: String,
        message2: String,
        message3: String,
        imagePainter: Painter,
        modifier: Modifier = Modifier){
        Column(modifier = modifier) {
            Image(painter = imagePainter, contentDescription = null)
            Text(
                text = message,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = message2,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = message3,
                modifier =  Modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeBasicTheme {
            GreetingApp()
        }
    }
}
