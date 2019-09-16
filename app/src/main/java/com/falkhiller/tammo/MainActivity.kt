package com.falkhiller.tammo


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

import org.jetbrains.anko.browse

class MainActivity : AppCompatActivity() {
    fun onClick(v: View) {
           browse("https://abfahrten.hvv.de/a83fc459-51ed-485d-a761-e622c3a5e906")
    }

    fun onClick1(v: View) {
          browse("https://abfahrten.hvv.de/84d21a58-6d1e-4b06-a094-a8512cdedb4e")

    }

    fun onClick2(v: View) {
          browse("https://abfahrten.hvv.de/a8fc1cf4-b3a6-489f-9879-f3baeef01fa7")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
