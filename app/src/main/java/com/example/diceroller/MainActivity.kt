package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.R.id
import com.example.diceroller.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val myDice = Dice(6)
        val rollButton: Button = findViewById(id.button)
        val imageId: ImageView = findViewById(id.dieImage)
        rollButton.setOnClickListener {
            when (myDice.roll()) {
                1 -> imageId.setImageResource(R.drawable.dice_1)
                2 -> imageId.setImageResource(R.drawable.dice_2)
                3 -> imageId.setImageResource(R.drawable.dice_3)
                4 -> imageId.setImageResource(R.drawable.dice_4)
                5 -> imageId.setImageResource(R.drawable.dice_5)
                6 -> imageId.setImageResource(R.drawable.dice_6)
            }
            imageId.contentDescription = myDice.roll().toString()
        }
    }
}

