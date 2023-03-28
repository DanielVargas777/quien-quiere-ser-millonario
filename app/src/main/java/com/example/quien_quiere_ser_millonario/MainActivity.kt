package com.example.quien_quiere_ser_millonario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : ImageButton = findViewById(R.id.imageButton4)
        btn.setOnClickListener{
            val intent: Intent = Intent(this,PreguntaActivity :: class.java)
            startActivity(intent)
        }
    }
}