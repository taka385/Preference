package com.example.preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preference = PreferenceManager.getDefaultSharedPreferences(this)

        putButton.setOnClickListener{
            val editer = preference.edit()
            editer.putString("TEXT", editText.text.toString())
            editer.commit()
        }

        getButton.setOnClickListener {
            editText.setText(preference.getString("TEXT", "まだ保存されていません"))
        }
    }
}
