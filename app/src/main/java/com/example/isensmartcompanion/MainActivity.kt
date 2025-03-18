package com.example.isensmartcompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.isensmartcompanion.ui.theme.ISENSmartCompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ISENSmartCompanionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF8F6FC) // Fond gris clair
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(50.dp)) // Espace en haut
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "ISEN",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFD32F2F) // Rouge foncé
            )
            Text(
                text = "Smart Companion",
                fontSize = 16.sp,
                color = Color.Gray
            )
        }
        InputSection()
    }
}

@Composable
fun InputSection() {
    var text by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE3E3ED), shape = MaterialTheme.shapes.medium)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        BasicTextField(
            value = text,
            onValueChange = { text = it },
            textStyle = TextStyle(fontSize = 16.sp, color = Color.Black),
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(
            onClick = { /* Action du bouton */ },
            modifier = Modifier
                .size(48.dp)
                .background(Color(0xFFD32F2F), shape = CircleShape)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow), // Ajoute ton icône dans res/drawable
                contentDescription = "Envoyer",
                tint = Color.White
            )
        }
    }
}
