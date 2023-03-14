package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(
                        massage = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.signature_text)
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(massage: String, from: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = massage,
            fontSize = 33.3.sp,
            modifier = Modifier.padding(top = 16.dp))
        Text(
            text = from,
            fontSize = 22.2.sp,
            modifier = Modifier
                .padding(top = 16.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(massage: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
        BirthdayGreetingWithText(massage = massage, from = from)
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(stringResource(R.string.happy_birthday_text),
            stringResource(R.string.signature_text))
    }
}