package com.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val jenis = intent.getStringExtra("jenis")
        val warna = intent.getStringExtra("warna")
        val ukuran = intent.getStringExtra("ukuran")
        val berat = intent.getStringExtra("berat")
        val harga = intent.getIntExtra("harga", 0)

        val jenisTextView = findViewById<TextView>(R.id.jenisTextView)
        val warnaTextView = findViewById<TextView>(R.id.warnaTextView)
        val ukuranTextView = findViewById<TextView>(R.id.ukuranTextView)
        val beratTextView = findViewById<TextView>(R.id.beratTextView)
        val hargaTextView = findViewById<TextView>(R.id.hargaTextView)

        jenisTextView.setText(jenis)
        warnaTextView.setText(warna)
        ukuranTextView.setText(ukuran)
        beratTextView.setText(berat)
        hargaTextView.setText(harga.toString())

    }
}