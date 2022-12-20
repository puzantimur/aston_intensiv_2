package com.example.astonintensiv2.lesson2.task22

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.databinding.ActivityTask22Binding

class Task22 : AppCompatActivity() {

    private lateinit var binding: ActivityTask22Binding

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask22Binding
            .inflate(layoutInflater)
            .also { setContentView(it.root) }

        if(savedInstanceState != null){
            counter = savedInstanceState.getInt(KEY)
            binding.textViewCount.text = counter.toString()
        }

        with(binding){
            textViewCount.text = counter.toString()
            buttonCount.setOnClickListener {
                counter++
                textViewCount.text = counter.toString()
            }
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY, counter)
        super.onSaveInstanceState(outState)
    }

    companion object {
        private const val KEY = "KEY"
    }

}
