package com.example.astonintensiv2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.databinding.ActivityMainBinding
import com.example.astonintensiv2.lesson1.Task11
import com.example.astonintensiv2.lesson1.Task12
import com.example.astonintensiv2.lesson1.Task13
import com.example.astonintensiv2.lesson1.Task14
import com.example.astonintensiv2.lesson2.Task21.Task21FirstScreen
import com.example.astonintensiv2.lesson2.task22.CodingChallenge221
import com.example.astonintensiv2.lesson2.task22.Task22
import com.example.astonintensiv2.lesson2.task23.Task23

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        with(binding) {
            buttonTask11.setOnClickListener {
                val intent = Intent(this@MainActivity, Task11::class.java)
                startActivity(intent)
            }
            buttonTask12.setOnClickListener {
                val intent = Intent(this@MainActivity, Task12::class.java)
                startActivity(intent)
            }
            buttonTask13.setOnClickListener {
                val intent = Intent(this@MainActivity, Task13::class.java)
                startActivity(intent)
            }
            buttonTask14.setOnClickListener {
                val intent = Intent(this@MainActivity, Task14::class.java)
                startActivity(intent)
            }
            buttonTask21.setOnClickListener {
                val intent = Intent(this@MainActivity, Task21FirstScreen::class.java)
                startActivity(intent)
            }
            buttonTask22.setOnClickListener {
                val intent = Intent(this@MainActivity, Task22::class.java)
                startActivity(intent)
            }
            buttonTask23.setOnClickListener {
                val intent = Intent(this@MainActivity, Task23::class.java)
                startActivity(intent)
            }
            buttonCoddingChallenge22.setOnClickListener {
                val intent = Intent(this@MainActivity, CodingChallenge221::class.java)
                startActivity(intent)
            }

        }
    }
}
