package com.minutos.agave_xml.components

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.airbnb.paris.extensions.style
import com.google.android.material.button.MaterialButton
import com.minutos.agave_xml.R

class MaterialButton99 @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val buttonMaterial: MaterialButton

    init {
        inflate(context, R.layout.component_button_material_99, this)

        buttonMaterial = findViewById(R.id.material_button_custom)

        val res = context.obtainStyledAttributes(attrs, R.styleable.ButtonMaterial99, defStyleAttr, 0).also {

            when(it.getInteger(R.styleable.ButtonMaterial99_type, 0x00)) {
                0x00 -> {
                    if (!isInEditMode) buttonMaterial.style(R.style.ButtonPrimaryStyle)
                    buttonMaterial.cornerRadius = 50
                    buttonMaterial.setBackgroundColor(ContextCompat.getColor(context, R.color.primary500))

                    when (it.getBoolean(R.styleable.ButtonMaterial99_enable, true)) {
                        true -> {
                            buttonMaterial.isEnabled = true
                        }
                        false -> {
                            buttonMaterial.isEnabled = false
                            buttonMaterial.setBackgroundColor(ContextCompat.getColor(context, R.color.primary200))
                            buttonMaterial.setTextColor(ContextCompat.getColor(context, R.color.light))
                        }
                    }
                }
                0x01 -> {
                    if (!isInEditMode)  buttonMaterial.style(R.style.ButtonSecondaryStyle)
                    buttonMaterial.cornerRadius = 50
                    buttonMaterial.setBackgroundColor(Color.WHITE)
                    buttonMaterial.strokeColor = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.primary500))
                    buttonMaterial.strokeWidth = 3
                    buttonMaterial.rippleColor = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.primary200))
                    buttonMaterial.setTextColor(ContextCompat.getColor(context, R.color.dark))

                    when (it.getBoolean(R.styleable.ButtonMaterial99_enable, true)) {
                        true -> {
                            buttonMaterial.isEnabled = true
                        }
                        false -> {
                            buttonMaterial.isEnabled = false
                            buttonMaterial.strokeColor = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.primary100))
                            buttonMaterial.strokeWidth = 3
                            buttonMaterial.setTextColor(ContextCompat.getColor(context, R.color.primary200))
                        }
                    }
                }

                0x02 -> {
                    if (!isInEditMode) buttonMaterial.style(R.style.ButtonTertiaryStyle)
                    buttonMaterial.cornerRadius = 50
                    buttonMaterial.setBackgroundColor(Color.WHITE)
                    buttonMaterial.setTextColor(ContextCompat.getColor(context, R.color.primary500))
                    buttonMaterial.rippleColor = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.primary200))

                    when (it.getBoolean(R.styleable.ButtonMaterial99_enable, true)) {
                        true -> {
                            buttonMaterial.isEnabled = true
                        }
                        false -> {
                            buttonMaterial.isEnabled = false
                            buttonMaterial.setTextColor(ContextCompat.getColor(context, R.color.primary200))
                        }
                    }
                }
            }
            buttonMaterial.text = it.getString(R.styleable.ButtonMaterial99_text)

        }
        res.recycle()
    }
}