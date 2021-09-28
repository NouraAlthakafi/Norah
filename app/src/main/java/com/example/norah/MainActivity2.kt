package com.example.norah

import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout
import java.util.concurrent.Executor

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var finalsh= findViewById<TextView>(R.id.textView2)
        val sentToSecond= intent.getStringExtra("in")
        finalsh.text= sentToSecond
    }
}