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

class PreguntaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)
        val opt : ImageButton =findViewById(R.id.imageButton)
        val opt2 : ImageButton =findViewById(R.id.imageButton32)
        val respuesta: TextView =findViewById(R.id.textView23)
        val call : ImageView =findViewById(R.id.imageView)
        opt.setOnClickListener{
            opt.visibility = View.INVISIBLE
            opt2.visibility = View.VISIBLE
            respuesta.visibility = View.VISIBLE
            call.visibility = View.INVISIBLE
        }


        val option : ImageButton =findViewById(R.id.imageButton3)
        val option2 : ImageButton =findViewById(R.id.imageButton33)
        val respuesta2 : TextView =findViewById(R.id.textView24)
        val public : ImageView =findViewById(R.id.imageView2)
        option.setOnClickListener{
            option.visibility = View.INVISIBLE
            option2.visibility = View.VISIBLE
            respuesta2.visibility = View.VISIBLE
            public.visibility = View.INVISIBLE
        }


        val btn : ImageButton = findViewById(R.id.imageButton7)
        btn.setOnClickListener{
            btn.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
            }, 1000)
        }
        val btn2 : ImageButton = findViewById(R.id.imageButton8)
        btn2.setOnClickListener{
            btn2.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
            }, 1000)
        }
        val btn3 : ImageButton = findViewById(R.id.imageButton6)
        btn3.setOnClickListener{
            btn3.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }, 1000)
        }
        val btn4: ImageButton = findViewById(R.id.imageButton5)
        btn4.setOnClickListener {
            btn4.backgroundTintList = ContextCompat.getColorStateList(this, R.color.verde)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, Pregunta2Activity::class.java)
                startActivity(intent)
            }, 1000)
        }
    }
}