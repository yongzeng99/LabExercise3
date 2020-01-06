package com.example.labexercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        buttonCalculate.setOnClickListener {
            val age = spinnerAge.selectedItemPosition
            var payment = 0
            if (radioButtonMale.isChecked) {
                when (age) {
                    0 -> payment = 60
                    1 -> payment = 120
                    2 -> payment = 190
                    3 -> payment = 270
                    else -> payment = 350
                }
            } else {
                when (age) {
                    0 -> payment = 60
                    1 -> payment = 70
                    2 -> payment = 90
                    3 -> payment = 120
                    else -> payment = 150
                }
            }
            if (checkBoxSmoker.isChecked) {
                when (age) {
                    1 -> payment += 100
                    2 -> payment += 150
                    3 -> payment += 200
                    4 -> payment += 250
                    5 -> payment += 300
                }
            }
            textViewPremium.text = String.format("Insurance Premium :\nRM%d", payment)
        }

        buttonReset.setOnClickListener {
            spinnerAge.setSelection(0)
            radioGroupGender.clearCheck()
            checkBoxSmoker.isChecked = false
            textViewPremium.text = "Insurance Premium :"
        }
    }
}
