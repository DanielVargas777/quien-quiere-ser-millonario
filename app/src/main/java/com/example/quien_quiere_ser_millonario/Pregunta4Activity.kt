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

class Pregunta4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta4)
        var optionLock = false
        val opt : ImageButton =findViewById(R.id.imageButton20)
        val opt2 : ImageButton =findViewById(R.id.imageButton38)
        val respuesta: TextView =findViewById(R.id.textView29)
        val call : ImageView =findViewById(R.id.imageView5)
        opt.setOnClickListener{
            if (!optionLock) {
            opt.visibility = View.INVISIBLE
            opt2.visibility = View.VISIBLE
            respuesta.visibility = View.VISIBLE
            call.visibility = View.INVISIBLE
                optionLock = true

            }
        }

        opt2.setOnClickListener{
            opt.visibility = View.VISIBLE
            opt2.visibility = View.INVISIBLE
            respuesta.visibility = View.INVISIBLE
            call.visibility = View.VISIBLE

            opt.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
        }

        var optionLocked = false

        val option : ImageButton =findViewById(R.id.imageButton21)
        val option2 : ImageButton =findViewById(R.id.imageButton39)
        val respuesta2 : TextView =findViewById(R.id.textView30)
        val public : ImageView =findViewById(R.id.imageView7)
        option.setOnClickListener{
            if (!optionLocked) {
            option.visibility = View.INVISIBLE
            option2.visibility = View.VISIBLE
            respuesta2.visibility = View.VISIBLE
            public.visibility = View.INVISIBLE
                optionLocked = true
            }
        }

        option2.setOnClickListener{

            option.visibility = View.VISIBLE
            option2.visibility = View.INVISIBLE
            respuesta2.visibility = View.INVISIBLE
            public.visibility = View.VISIBLE

            option.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)

        }
        val btn : ImageButton = findViewById(R.id.imageButton22)
        btn.setOnClickListener{
            btn.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent: Intent = Intent(this,MainActivity :: class.java)
                startActivity(intent)
            }, 1000)
        }

        val btn2 : ImageButton = findViewById(R.id.imageButton23)
        btn2.setOnClickListener{
            btn2.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent: Intent = Intent(this,MainActivity :: class.java)
                startActivity(intent)
            }, 1000)

        }

        val btn3 : ImageButton = findViewById(R.id.imageButton24)
        btn3.setOnClickListener{
            btn3.backgroundTintList = ContextCompat.getColorStateList(this, R.color.rojo)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent: Intent = Intent(this,MainActivity :: class.java)
                startActivity(intent)
            }, 1000)

        }

        val btn4 : ImageButton = findViewById(R.id.imageButton25)
        btn4.setOnClickListener{
            btn4.backgroundTintList = ContextCompat.getColorStateList(this, R.color.verde)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent: Intent = Intent(this,Pregunta5Activity :: class.java)
                startActivity(intent)
            }, 1000)
        }
    }
}