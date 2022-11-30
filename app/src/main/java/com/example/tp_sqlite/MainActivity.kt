package com.example.tp_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var nom_prenom : EditText
    lateinit var datenaissance : EditText
    lateinit var email: EditText
    lateinit var classe: EditText
    lateinit var btn_submit: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom_prenom = findViewById(R.id.nom_prenom)
        datenaissance = findViewById(R.id.datenaissance)
        email = findViewById(R.id.email)
        classe = findViewById(R.id.classe)
        btn_submit = findViewById(R.id.submit)

        btn_submit.setOnLongClickListener()
    }
}