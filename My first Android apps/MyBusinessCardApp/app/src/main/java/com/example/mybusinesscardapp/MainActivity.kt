package com.example.mybusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mybusinesscardapp.ui.theme.MyBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeMyBusinessCard()
                }
            }
        }
    }
}

@Composable
fun ComposeMyBusinessCard() {
    MyBusinessCard(
        fullName = stringResource(R.string.my_name),
        currentStatus = stringResource(R.string.my_status),
        telephone = stringResource(R.string.my_telephone),
        telegram = stringResource(R.string.my_telegram),
        mail = stringResource(R.string.my_mail),
        avatar = painterResource(R.drawable.android_logo),
        googleProfile = painterResource(R.drawable.my_qrcode_developers_google_com),
        backgroundColor = Color.Black,
    )
}

@Composable
private fun MyBusinessCard(
    fullName: String,
    currentStatus: String,
    telephone: String,
    telegram: String,
    mail: String,
    avatar: Painter,
    googleProfile: Painter,
    backgroundColor: Color,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = avatar,
            contentDescription = null,
        )
        Text(
            text = fullName,
            fontSize = 40.sp,
            color = Color.White,
//            modifier = Modifier
        )
        Text(
            text = currentStatus,
            fontSize = 25.sp,
            color = Color(0xFF3ddc84),
//            modifier = Modifier
        )
        Text(
            text = telephone,
            fontSize = 17.sp,
            color = Color.Gray
        )
        Text(
            text = telegram,
            fontSize = 17.sp,
            color = Color.Gray
        )
        Text(
            text = mail,
            fontSize = 17.sp,
            color = Color.Gray
        )
        Image(
            painter = googleProfile,
            contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    MyBusinessCardAppTheme {
        ComposeMyBusinessCard()
    }
}