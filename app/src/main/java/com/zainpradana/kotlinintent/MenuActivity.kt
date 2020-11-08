package com.zainpradana.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity() {
    val USERNAME_KEY = "username_key"
    val UMUR_KEY = "umur_key"
    val SISWA_KEY = "siswa_key"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun intentTanpaData(view: View) {
        val goToMainActivity = Intent(this, MainActivity::class.java)
        startActivity(goToMainActivity)
    }
    fun intentDenganData(view: View) {
        val goToMainActivityWithData = Intent(this, MainActivity::class.java)

        goToMainActivityWithData.putExtra(USERNAME_KEY, "BLK BEKASI")
        goToMainActivityWithData.putExtra(UMUR_KEY, 12)
        startActivity(goToMainActivityWithData)
    }

    fun intentDenganParcelable(view: View) {
        val siswaBlk = Siswa(
                "Fulan",
                12
        )

        val goToMainActivityWithData = Intent(this, MainActivity::class.java)

        goToMainActivityWithData.putExtra(SISWA_KEY, siswaBlk)
        startActivity(goToMainActivityWithData)
    }
}