package com.example.nov14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(),ButtonFragment.FragmentCommunicationInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    override fun buttonIsClicked(){
        findViewById<TextView>(R.id.textView).text = "The Button Was Clicked"
    }
}