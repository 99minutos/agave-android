package com.minutos.agave_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import com.minutos.agave_compose.components.Chip99
import com.minutos.agave_compose.components.MaterialButton99
import com.minutos.agave_compose.components.TypeMaterialButton99
import com.minutos.agave_compose.ui.theme.Primary500

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val buttonCompose = findViewById<ComposeView>(R.id.buttonCompose)
        buttonCompose.setContent { 
            MaterialButton99(text = "Primary button", type = TypeMaterialButton99.Primary) {}
        }

    }
}