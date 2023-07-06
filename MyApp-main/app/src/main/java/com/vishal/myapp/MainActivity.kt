package com.vishal.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    private lateinit var etn : EditText
    private lateinit var etnum : EditText
    private lateinit var eth : EditText
    private lateinit var btnNext : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etn = findViewById(R.id.etn)
        etnum = findViewById(R.id.etnum)
        eth = findViewById(R.id.eth)
        btnNext= findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            if (etn.text.toString().isEmpty()) {
                etn.error = "please enter your valid name"
            } else if (etnum.text.toString().isEmpty()) {
                etnum.error = "please enter your age"
            } else if (eth.text.toString().isEmpty()) {
                eth.error = "enter your height"
            } else {
                Toast.makeText(this, "validation completed", Toast.LENGTH_SHORT)
                    .show()
                  startActivity(Intent(this , MainActivity2::class.java)
                      .putExtra("name",etn.text.toString())
                      .putExtra("age",etnum.text.toString())
                      .putExtra("height",eth.text.toString()))
            }
        }

        }
        override fun onResume() {
            super.onResume()
            Toast.makeText(this, "on Resume called", Toast.LENGTH_SHORT)
                .show()
        }

        override fun onPause() {
            super.onPause()
            Toast.makeText(this, "on Pause called", Toast.LENGTH_SHORT)
                .show()
        }

        override fun onDestroy() {
            super.onDestroy()
            Toast.makeText(this, "on destroy called", Toast.LENGTH_SHORT)
                .show()


    }
}
