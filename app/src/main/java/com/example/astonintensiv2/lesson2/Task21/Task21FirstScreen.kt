package com.example.astonintensiv2.lesson2.Task21

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.databinding.ActivityTask21FirstScreenBinding

class Task21FirstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityTask21FirstScreenBinding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTask21FirstScreenBinding
            .inflate(layoutInflater)
            .also { setContentView(it.root) }

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY)
            binding.showCount.text = count.toString()
        }

        with(binding) {
            showCount.text = count.toString()
            buttonCount.setOnClickListener {
                count++
                showCount.text = count.toString()
            }
            buttonHello.setOnClickListener {
                val intent = Intent(
                    this@Task21FirstScreen,
                    Task21SecondScreen::class.java
                )
                intent.putExtra(KEY_EXTRA, count)
                startActivity(intent)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY, count)
        super.onSaveInstanceState(outState)
    }

    companion object {
        private const val KEY = "KEY"
        private const val KEY_EXTRA = "KEY_EXTRA"
    }
}
