package com.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val handphone = intent.getStringExtra("handphone")
        val tanggalLahir = intent.getStringExtra("tanggalLahir")
        val jumlahMataKuliah = intent.getIntExtra("jumlahMataKuliah", 0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val handphoneTextView = findViewById<TextView>(R.id.handphoneTextView)
        val tanggalLahirTextView = findViewById<TextView>(R.id.tanggalLahirTextView)
        val jumlahMataKuliahTextView = findViewById<TextView>(R.id.jumlahMataKuliahTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        handphoneTextView.setText(handphone)
        tanggalLahirTextView.setText(tanggalLahir)
        jumlahMataKuliahTextView.setText(jumlahMataKuliah.toString())
    }
}