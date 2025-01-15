package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

class MainActivityfiretv : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {super.onCreate(savedInstanceState)
        setContent {
            Text("fire TV App")
        }
    }
}