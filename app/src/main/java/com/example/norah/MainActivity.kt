package com.example.norah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var location: EditText
    lateinit var mobile: EditText
    lateinit var toa: Button
    lateinit var tv: Button
    lateinit var go: Button
    lateinit var info: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name= findViewById(R.id.userName)
        location= findViewById(R.id.userLocation)
        mobile= findViewById(R.id.userMobile)
        toa= findViewById(R.id.button)
        tv= findViewById(R.id.button2)
        go= findViewById(R.id.button3)
        info= findViewById(R.id.textView)
        toa.setOnClickListener{
            val allUserInfoInput = listOf("${name.text}\n ${location.text}\n ${mobile.text}.")
            Toast.makeText(applicationContext, allUserInfoInput.toString(), Toast.LENGTH_SHORT).show()
        }
        tv.setOnClickListener{
            val allUserInfoInput = listOf("${name.text}\n ${location.text}\n ${mobile.text}.")
            info.text= allUserInfoInput.toString()
        }
        go.setOnClickListener{
            val allUserInfoInput = listOf("${name.text}\n ${location.text}\n ${mobile.text}.")
            val intent = Intent (this, MainActivity2::class.java)
            intent.putExtra("in", "$allUserInfoInput")
            startActivity(intent)
        }
    }
}