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
import androidx.compose.ui.unit.dp
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyMainInfo(
            fullName = stringResource(R.string.my_name),
            currentStatus = stringResource(R.string.my_status),
            avatar = painterResource(R.drawable.android_logo),
        )
        MyContactInfo(
            telephone = stringResource(R.string.my_telephone),
            telegram = stringResource(R.string.my_telegram),
            mail = stringResource(R.string.my_mail),
            googleProfile = painterResource(R.drawable.my_qrcode_developers_google_com),
        )
    }
}

@Composable
private fun MyMainInfo(
    fullName: String,
    currentStatus: String,
    avatar: Painter,
) {
    Image(
        painter = avatar,
        contentDescription = null,
        modifier = Modifier.height(200.dp).width(200.dp).padding(bottom = 10.dp)
    )
    Text(
        text = fullName,
        fontSize = 40.sp,
        color = Color.White,
    )
    Text(
        text = currentStatus,
        fontSize = 25.sp,
        color = Color(0xFF3ddc84),
    )
}

@Composable
private fun MyContactInfo(
    telephone: String,
    telegram: String,
    mail: String,
    googleProfile: Painter,
) {
    Column(modifier = Modifier) {

    }
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
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    MyBusinessCardAppTheme {
        ComposeMyBusinessCard()
    }
}