package com.example.assignment1tyricsinghst10479817

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val rbGroup = findViewById<RadioGroup>(R.id.rbGroup)
        val rbBreakfast = findViewById<RadioButton>(R.id.rbEarlyMorning)
        val rbLightSnack = findViewById<RadioButton>(R.id.rbMidMorning)
        val rbLunch = findViewById<RadioButton>(R.id.rbAfternoon)
        val rbQuickBite = findViewById<RadioButton>(R.id.rbLateAfternoon)
        val rbMainCourse = findViewById<RadioButton>(R.id.rbEvening)
        val rbDessert = findViewById<RadioButton>(R.id.rbNightTime)
        val mainLayout = findViewById<ViewGroup>(R.id.main)

        mainLayout.setBackgroundResource(R.drawable.background_image) //The background image.

        btnCompute.setBackgroundColor(Color.MAGENTA)   //Colours of the buttons.
        btnClear.setBackgroundColor(Color.RED)

        btnClear.visibility = Button.GONE  //At the beginning of the program the button will not appear.

        btnCompute.setOnClickListener {

            txtResult.text = "Please can you ensure that you have selected one of the available options."



            if (rbBreakfast.isChecked)
            {
                txtResult.text = "You may consider having Eggs in the Early Morning for your Breakfast."
                mainLayout.setBackgroundResource(R.drawable.eggs_image)
                rbGroup.visibility = Button.GONE  //Hiding the entire RadioGroup.
                btnCompute.visibility = Button.GONE
                btnClear.visibility = Button.VISIBLE
            }
            else if (rbLightSnack.isChecked)
            {
                txtResult.text = "Some fruits would be a suitable choice in the Mid-Morning for a Light Snack."
                mainLayout.setBackgroundResource(R.drawable.fruit_image)
                rbGroup.visibility = Button.GONE
                btnCompute.visibility = Button.GONE
                btnClear.visibility = Button.VISIBLE
            }
            else if (rbLunch.isChecked)
            {
                txtResult.text = "A Sandwich would be an appropriate meal for your Afternoon."
                mainLayout.setBackgroundResource(R.drawable.sandwich_image)
                rbGroup.visibility = Button.GONE
                btnCompute.visibility = Button.GONE
                btnClear.visibility = Button.VISIBLE
            }
            else if (rbQuickBite.isChecked)
            {
                txtResult.text = "A slice of Cake is a good quick bite for the Late Afternoon. "
                mainLayout.setBackgroundResource(R.drawable.cake_image)
                rbGroup.visibility = Button.GONE
                btnCompute.visibility = Button.GONE
                btnClear.visibility = Button.VISIBLE
            }
            else if (rbMainCourse.isChecked)
            {
                txtResult.text = "A pasta dish is a great choice for Dinner in the Evening."
                mainLayout.setBackgroundResource(R.drawable.pasta_image)
                rbGroup.visibility = Button.GONE
                btnCompute.visibility = Button.GONE
                btnClear.visibility = Button.VISIBLE
            }
            else if (rbDessert.isChecked)
            {
                txtResult.text = "Ice cream would be a delightful treat for Dessert at Night."
                mainLayout.setBackgroundResource(R.drawable.icecream_image)
                rbGroup.visibility = Button.GONE
                btnCompute.visibility = Button.GONE
                btnClear.visibility = Button.VISIBLE
            }
        }

        //The clear button.
        btnClear.setOnClickListener {

            txtResult.text = "Please can you select one of the available options about what time of day it is."

            rbGroup.visibility = Button.VISIBLE //Brings back the RadioGroup.
            btnCompute.visibility = Button.VISIBLE //Brings back the Compute button.
            btnClear.visibility = Button.GONE

            mainLayout.setBackgroundResource(R.drawable.background_image)

            rbGroup.clearCheck() //Clears your previous option.

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}