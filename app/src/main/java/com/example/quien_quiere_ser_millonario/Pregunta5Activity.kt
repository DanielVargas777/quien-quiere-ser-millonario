package com.example.quien_quiere_ser_millonario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Pregunta5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta5)

        val btn : ImageButton = findViewById(R.id.imageButton28)
        btn.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)


        }

        val btn2 : ImageButton = findViewById(R.id.imageButton29)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)


        }
        val btn3 : ImageButton = findViewById(R.id.imageButton30)
        btn3.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)


        }
        val btn4 : ImageButton = findViewById(R.id.imageButton31)
        btn4.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)


        }
    }
}