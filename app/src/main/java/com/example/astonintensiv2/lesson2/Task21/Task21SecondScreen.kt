package com.example.astonintensiv2.lesson2.Task21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.databinding.ActivityTask21SecondScreenBinding

class Task21SecondScreen : AppCompatActivity() {

    private lateinit var binding: ActivityTask21SecondScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask21SecondScreenBinding
            .inflate(layoutInflater)
            .also { setContentView(it.root) }

        val message = intent.getIntExtra(KEY_EXTRA, 0)

        binding.textCount.text = message.toString()

    }

    companion object {
        private const val KEY_EXTRA = "KEY_EXTRA"
    }

}
