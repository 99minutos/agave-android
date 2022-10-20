package com.minutos.agave_xml.components

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.chip.Chip
import com.minutos.agave_xml.R

class Chip99 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null, defStyleAttr: Int = 0
) :
    ConstraintLayout(context, attrs, defStyleAttr) {

    private val chipMaterial: Chip

    init {
        inflate(context, R.layout.component_chip_material_99, this)
        chipMaterial = findViewById(R.id.chip_custom)

        val res = context.obtainStyledAttributes(attrs, R.styleable.ChipMaterial99, defStyleAttr, 0).also {
            chipMaterial.text = it.getString(R.styleable.ChipMaterial99_textChip)
            val colorDefaultChip = ContextCompat.getColor(context, R.color.primary500)
            val colorChip = it.getColor(R.styleable.ChipMaterial99_colorChip, colorDefaultChip)

            chipMaterial.chipBackgroundColor = ColorStateList.valueOf(colorChip).withAlpha(25)
            chipMaterial.setTextColor(colorChip)
            chipMaterial.typeface = ResourcesCompat.getFont(context, R.font.barlowsemibold)
            chipMaterial.rippleColor = ColorStateList.valueOf(colorChip).withAlpha(50)
        }

        res.recycle()
    }

    fun setOnClickListener(onClick:()-> Unit) {
        chipMaterial.setOnClickListener {
            onClick()
        }
    }

    fun setText(text: String) {
        chipMaterial.text = text
    }

    fun setColorChip(color: Int) {
        val colorDefaultChip = ContextCompat.getColor(context, color)
        chipMaterial.chipBackgroundColor = ColorStateList.valueOf(colorDefaultChip).withAlpha(25)
        chipMaterial.setTextColor(colorDefaultChip)
        chipMaterial.typeface = ResourcesCompat.getFont(context, R.font.barlowsemibold)
        chipMaterial.rippleColor = ColorStateList.valueOf(colorDefaultChip).withAlpha(50)
    }
}