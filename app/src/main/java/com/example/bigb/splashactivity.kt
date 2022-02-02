package com.example.bigb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashactivity : AppCompatActivity() {

        lateinit var handler: Handler
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splashactivity)

            handler = Handler()
            handler.postDelayed({

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()


            },3000)

    }
}