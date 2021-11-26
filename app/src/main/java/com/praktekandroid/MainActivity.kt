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

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val handphoneEditText = findViewById<EditText>(R.id.handphoneEditText)
        val tanggalLahirEditText = findViewById<EditText>(R.id.tanggalLahirEditText)
        val jumlahMataKuliahEditText = findViewById<EditText>(R.id.jumlahMataKuliahEditText)

        simpanButton.setOnClickListener {
            Toast.makeText(this,"Data disimpan !!! ",Toast.LENGTH_SHORT).show()

            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            val handphone = handphoneEditText.text.toString()
            val tanggalLahir = tanggalLahirEditText.text.toString()
            val jumlahMataKuliah = jumlahMataKuliahEditText.text.toString().toInt()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("handphone", handphone)
            intent.putExtra("tanggalLahir", tanggalLahir)
            intent.putExtra("jumlahMataKuliah", jumlahMataKuliah)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}