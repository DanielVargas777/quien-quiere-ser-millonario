package com.example.quien_quiere_ser_millonario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class Pregunta5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta5)


        val opt : ImageButton =findViewById(R.id.imageButton26)
        val opt2 : ImageButton =findViewById(R.id.imageButton40)
        val respuesta: TextView =findViewById(R.id.textView31)
        val call : ImageView =findViewById(R.id.imageView5)
        opt.setOnClickListener{
            opt.visibility = View.INVISIBLE
            opt2.visibility = View.VISIBLE
            respuesta.visibility = View.VISIBLE
            call.visibility = View.INVISIBLE
        }

        val option : ImageButton =findViewById(R.id.imageButton27)
        val option2 : ImageButton =findViewById(R.id.imageButton41)
        val respuesta2 : TextView =findViewById(R.id.textView32)
        val public : ImageView =findViewById(R.id.imageView7)
        option.setOnClickListener{
            option.visibility = View.INVISIBLE
            option2.visibility = View.VISIBLE
            respuesta2.visibility = View.VISIBLE
            public.visibility = View.INVISIBLE
        }

        val btn : ImageButton = findViewById(R.id.imageButton28)
        btn.setOnClickListener{
            btn.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)

            }, 1000)
        }

        val btn2 : ImageButton = findViewById(R.id.imageButton29)
        btn2.setOnClickListener{
            btn2.backgroundTintList = ContextCompat.getColorStateList(this, R.color.verde)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)

            }, 1000)
        }
        val btn3 : ImageButton = findViewById(R.id.imageButton30)
        btn3.setOnClickListener{
            btn3.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
            }, 1000)

        }
        val btn4 : ImageButton = findViewById(R.id.imageButton31)
        btn4.setOnClickListener{
            btn4.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
            }, 1000)

        }
    }
}