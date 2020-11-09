package com.zainpradana.kotlinintent

import android.app.Person
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USERNAME_KEY = "username_key"
    val UMUR_KEY = "umur_key"
    val SISWA_KEY = "siswa_key"
    lateinit var username: String
    var umur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = intent.getStringExtra(USERNAME_KEY).toString()
        umur = intent.getIntExtra(UMUR_KEY, 0)

        if (username != "null"){
            tv_hello_world.text = "Hello $username umur saya $umur"
        } else {
            tv_hello_world.text = "Hello World!"
        }

        var siswaBlk = intent.getParcelableExtra<Siswa>(SISWA_KEY)
        if (siswaBlk != null){
            tv_hello_world.text = "Hello ${siswaBlk.nama} ( Umur ${siswaBlk.umur} ) dengan Parcelable"
        }

    }

    fun goToMenuActivity(view: View) {
        // Intent Explicit ( Tanpa Mengirim Data )
        val goToMenuAct = Intent(this, MenuActivity::class.java)
        startActivity(goToMenuAct)
    }
}