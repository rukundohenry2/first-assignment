package com.global.firstassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1: TextView = findViewById(R.id.txt1) as TextView
        val text2: TextView = findViewById(R.id.txt2) as TextView
        val text3: TextView = findViewById(R.id.txt3) as TextView
        val text4: TextView = findViewById(R.id.txt4) as TextView
        val text5: TextView = findViewById(R.id.txt5) as TextView
        val text6: TextView = findViewById(R.id.txt6) as TextView

        text1.setText("Computer and Network  Security")
        text2.setText("Data communications and networks")
        text3.setText("Entrepneurship")
        text4.setText("Mobile Programming")
        text5.setText("Artificial Intelligence")
        text6.setText("Automata,Complexity and Computability")

    }
}