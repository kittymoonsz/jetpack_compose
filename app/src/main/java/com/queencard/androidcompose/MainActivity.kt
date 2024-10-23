package com.queencard.androidcompose

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                BusinessCardInfo()
                ContactInfo()
            }
        }
    }
}

@Composable
fun BusinessCardInfo() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFd2e8d4))
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .padding(4.dp)
                .background(Color(0xFF073042))
                .size(width = 120.dp, height = 125.dp)
        )
        Text(
            text = stringResource(R.string.nameText),
            fontSize = 36.sp,
            modifier = Modifier
                .padding(4.dp)
        )
        Text(
            text = stringResource(R.string.titleText),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = (Color(0xFF1d7b4d)),
            modifier = Modifier
                .padding(2.dp)
        )
        Spacer(Modifier.padding(50.dp))
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .padding(start = 100.dp, bottom = 30.dp)
            .fillMaxHeight()
    ) {
        Row(Modifier.padding(bottom = 10.dp)) {
            Image(
                painter = painterResource(R.drawable.phone_24dp_5f6368),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )
            Text(
                text = stringResource(R.string.phoneText),
                modifier = Modifier
                    .padding(top = 5.dp, start = 10.dp)
            )
        }
        Row(Modifier.padding(bottom = 10.dp)) {
            Image(
                painter = painterResource(R.drawable.share_24dp_5f6368),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )
            Text(
                text = stringResource(R.string.shareText),
                modifier = Modifier
                    .padding(top = 5.dp, start = 10.dp)
            )
        }
        Row(Modifier.padding(bottom = 10.dp)) {
            Image(
                painter = painterResource(R.drawable.email_24dp_5f6368),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )
            Text(
                text = stringResource(R.string.mailText),
                modifier = Modifier
                    .padding(top = 5.dp, start = 10.dp)
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardInfo()
    ContactInfo()
}


