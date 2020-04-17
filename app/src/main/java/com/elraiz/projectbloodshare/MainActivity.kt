package com.elraiz.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//NIM   10117163
//Nama  Muhamad El Raiz
//Kelas IF5
//Rabu,15 April 2020   : Pembuatan halaman utama dan form registrasi
//Kamis,16 April 2020    : Pembuatan halaman hampir dan verify,serta penambahan fungsi fungsi tombol
//Jum'at,17 April 2020 : Pembuatan halaman profile dan merapihkan tampilan halaman yg lain
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clicktext = findViewById<TextView>(R.id.txt_homeregister)
        clicktext.setOnClickListener{
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }
    }
}
