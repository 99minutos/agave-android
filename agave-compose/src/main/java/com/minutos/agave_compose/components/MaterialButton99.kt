package com.minutos.agave_compose.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.minutos.agave_compose.ui.theme.*

sealed class TypeMaterialButton99 {
    object Primary : TypeMaterialButton99()
    object Secondary : TypeMaterialButton99()
    object Tertiary : TypeMaterialButton99()
}

@Composable
fun MaterialButton99(
    modifier: Modifier = Modifier,
    type: TypeMaterialButton99,
    onClick: () -> Unit = {}
) {
    when (type) {
        TypeMaterialButton99.Primary -> {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Primary500),
                contentPadding = PaddingValues(horizontal = 30.dp),
                onClick = { }) {
                Text(text = "Button2")
            }
        }
        TypeMaterialButton99.Secondary -> {
            OutlinedButton(
                colors = ButtonDefaults.buttonColors(backgroundColor = White),
                contentPadding = PaddingValues(horizontal = 30.dp),
                border= BorderStroke(2.dp, Primary500),
                onClick = { }) {
                Text(text = "Button3")
            }
        }
        TypeMaterialButton99.Tertiary -> {
            TextButton(
                colors = ButtonDefaults.buttonColors(backgroundColor = Transparent),
                contentPadding = PaddingValues(horizontal = 30.dp),
                onClick = { }) {
                Text(text = "Button4", color = Primary500)
            }
        }
    }

}

@Preview
@Composable
fun MaterialButton99Preview() {
    Column() {
        MaterialButton99(type = TypeMaterialButton99.Primary) {

        }
        MaterialButton99(type = TypeMaterialButton99.Secondary) {

        }
        MaterialButton99(type = TypeMaterialButton99.Tertiary) {

        }
    }
}