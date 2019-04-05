package com.infrontofthenet.lesson12kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf("Fish and Chips", "Bubble Gum Ice Cream", "Peanut Butter and Pretzels", "Poutine")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val foodIndex = random.nextInt(foodList.size)
            selectedFoodTextView.text = foodList[foodIndex]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodEditText.text.toString()
            foodList.add(newFood)
            addFoodEditText.text.clear()
        }

        newestButton.setOnClickListener {
            val newestFood = foodList.last()
            selectedFoodTextView.text = newestFood
        }

        alphaButton.setOnClickListener {
            val sortedArray = foodList.sortedWith(compareBy { it.toLowerCase() })
            val firstFood = sortedArray[0]
            selectedFoodTextView.text = firstFood
        }
    }
}
