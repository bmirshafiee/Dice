package com.example.bitamirshafiee.dice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBotton: Button = findViewById(R.id.button_id)
        val diceOne: ImageView = findViewById(R.id.first_dice)
        val secondDice: ImageView = findViewById(R.id.second_dice)

        rollBotton.setOnClickListener(){
            val randomNumber = Random().nextInt(6) + 1

            val resourceDrawable1 = when (randomNumber){
                1 ->R.drawable.dice1
                2 ->R.drawable.dice2
                3 ->R.drawable.dice3
                4 ->R.drawable.dice4
                5 ->R.drawable.dice5
                6 ->R.drawable.dice6
                else ->R.drawable.dice6
            }

            diceOne.setImageResource(resourceDrawable1)

            val randomNumber2 = Random().nextInt(6) + 1

            val resourceDrawable2 = when (randomNumber2){
                1 ->R.drawable.dice1
                2 ->R.drawable.dice2
                3 ->R.drawable.dice3
                4 ->R.drawable.dice4
                5 ->R.drawable.dice5
                6 ->R.drawable.dice6
                else ->R.drawable.dice6
            }

            secondDice.setImageResource(resourceDrawable2)

        }
    }
}
