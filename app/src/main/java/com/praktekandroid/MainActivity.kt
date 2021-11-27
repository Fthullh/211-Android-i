package com.praktekandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val jenisEditText = findViewById<EditText>(R.id.jenisEditText)
        val warnaEditText = findViewById<EditText>(R.id.warnaEditText)
        val ukuranEditText = findViewById<EditText>(R.id.ukuranEditText)
        val beratEditText = findViewById<EditText>(R.id.beratEditText)
        val hargaEditText = findViewById<EditText>(R.id.hargaEditText)

        simpanButton.setOnClickListener {
            Toast.makeText(this,"Data Batu disimpan !!! ",Toast.LENGTH_SHORT).show()

            val jenis = jenisEditText.text.toString()
            val warna = warnaEditText.text.toString()
            val ukuran = ukuranEditText.text.toString()
            val berat = beratEditText.text.toString()
            val harga = hargaEditText.text.toString().toInt()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("jenis", jenis)
            intent.putExtra("warna", warna)
            intent.putExtra("ukuran", ukuran)
            intent.putExtra("berat", berat)
            intent.putExtra("harga", harga)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}