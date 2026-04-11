package com.example.lingo


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.cardview.widget.CardView





class MainActivity : ComponentActivity() {


    private var showingFront = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashcard = findViewById<CardView>(R.id.flashcard)
        val flashcardFront = findViewById<View>(R.id.flashcard_front)
        val flashcardBack = findViewById<View>(R.id.flashcardBack)

        flashcard.setOnClickListener {
            showingFront = !showingFront
            if (showingFront) {
                flashcardFront.visibility = View.VISIBLE
                flashcardBack.visibility = View.GONE
            } else {
                flashcardFront.visibility = View.GONE
                flashcardBack.visibility = View.VISIBLE
            }
        }
    }
}
