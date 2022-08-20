package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This kotline file is where were going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //Display customize text to show 'Hello from {name}' complete.
        //user can tap a button to change the text color of the label
            //{ 1. add a button to our layout
        //Second ref to button2
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Stan","Tapped on button2")
            findViewById<Button>(R.id.button2).setBackgroundColor(getResources().getColor(R.color.orange))
        }
        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles button tap
            //2 change the color of the text when user has tapped on button.
            Log.i("Stan","tapped on button")
            // 1.Get a reference to the text view
            // 2.Set the color of the text view.
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        }
            //2. set up logic to know when user has tapped on button
        //input text
 



    }
}