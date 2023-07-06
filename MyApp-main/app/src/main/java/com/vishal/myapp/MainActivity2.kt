package com.vishal.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
   private lateinit var tvn: TextView
   private lateinit var tvo : TextView
    private lateinit var tvh : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvn=findViewById(R.id.tvn)
        tvo=findViewById(R.id.tvo)
        tvh=findViewById(R.id.tvh)
        val name= intent.getStringExtra("name")
        val age= intent.getStringExtra("age")
        val height= intent.getStringExtra("height")

        tvn.text="Hello  " + name
        tvo.text="you are "+ age +" years old"
        tvh.text="your height is "  + height

   }
}
