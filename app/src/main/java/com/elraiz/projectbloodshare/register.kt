package com.elraiz.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button = findViewById<Button>(R.id.btn_register)
        button.setOnClickListener{
            val intent = Intent(this,hampir::class.java)
            startActivity(intent)
        }
    }
}
