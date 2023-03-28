package com.example.quien_quiere_ser_millonario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PreguntaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)
        val btn : ImageButton = findViewById(R.id.imageButton7)
        btn.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }
        val btn2 : ImageButton = findViewById(R.id.imageButton8)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }
        val btn3 : ImageButton = findViewById(R.id.imageButton6)
        btn3.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }
        val btn4 : ImageButton = findViewById(R.id.imageButton5)
        btn4.setOnClickListener{
            val intent: Intent = Intent(this,Pregunta2Activity :: class.java)
            startActivity(intent)
        }
    }
}