package com.example.bigb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val home = findViewById<Button>(R.id.button2)
        val frag=findViewById<Button>(R.id.button3)


        // getting the recyclerview by its id

        home.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()

        }
             val f=Fragment2()
        frag.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,f)
                commit()
            }



        }




        // This will pass the ArrayList to our Adapter





    }
}