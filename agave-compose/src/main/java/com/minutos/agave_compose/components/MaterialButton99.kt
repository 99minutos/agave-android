package com.minutos.agave_compose.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.minutos.agave_compose.ui.theme.*

sealed class TypeMaterialButton99 {
    object Primary : TypeMaterialButton99()
    object Secondary : TypeMaterialButton99()
    object Tertiary : TypeMaterialButton99()
}

@Composable
fun MaterialButton99(
    text: String,
    type: TypeMaterialButton99,
    enable: Boolean = true,
    onClick: () -> Unit = {}
) {
    when (type) {
        TypeMaterialButton99.Primary -> {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Primary500),
                contentPadding = PaddingValues(horizontal = 30.dp),
                modifier = Modifier
                    .padding(3.dp)
                    .height(47.dp),
                shape = RoundedCornerShape(50.dp),
                enabled = true,
                onClick = { onClick() }) {
                Text(text = text, color = White, style = Typography.button)
            }
        }
        TypeMaterialButton99.Secondary -> {
            OutlinedButton(
                colors = ButtonDefaults.buttonColors(backgroundColor = White),
                contentPadding = PaddingValues(horizontal = 30.dp),
                border = BorderStroke(2.dp, Primary500),
                enabled = true,

                modifier = Modifier
                    .padding(3.dp)
                    .height(47.dp),
                shape = RoundedCornerShape(50.dp),
                onClick = { onClick() }) {
                Text(text = text, style = Typography.button)
            }
        }
        TypeMaterialButton99.Tertiary -> {
            TextButton(
                colors = ButtonDefaults.buttonColors(backgroundColor = Transparent),
                contentPadding = PaddingValues(horizontal = 30.dp),
                modifier = Modifier
                    .padding(3.dp)
                    .height(47.dp),
                shape = RoundedCornerShape(50.dp),
                enabled = true,

                onClick = { onClick() }) {
                Text(text = text, color = Primary500, style = Typography.button)
            }
        }
    }

}

