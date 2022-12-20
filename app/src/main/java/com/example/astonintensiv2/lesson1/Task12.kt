package com.example.astonintensiv2.lesson1

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.R
import com.example.astonintensiv2.databinding.ActivityTask12Binding

class Task12 : AppCompatActivity() {

    private lateinit var binding: ActivityTask12Binding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTask12Binding.inflate(layoutInflater).also { setContentView(it.root) }

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY)
            binding.showCount.text = count.toString()
            updateBackgroundColor()
            if (count != 0) {
                binding.buttonZero.setBackgroundColor(Color.CYAN)
            }
        }

        with(binding) {
            updateBackgroundColor()
            showCount.text = count.toString()
            buttonZero.setOnClickListener {
                buttonZero.setBackgroundColor(Color.GRAY)
                count = 0
                showCount.text = count.toString()
            }
            buttonCount.setOnClickListener {
                buttonZero.setBackgroundColor(Color.CYAN)
                count++
                showCount.text = count.toString()
                updateBackgroundColor()
            }
            buttonToast.setOnClickListener {
                Toast.makeText(
                    this@Task12,
                    R.string.toast_in_1_2,
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }

        Log.d("TAG", "onCreate bundle = $savedInstanceState")

    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY, count)
        super.onSaveInstanceState(outState)
        Log.d("TAG", "onSaveInstanceState")
    }


    private fun updateBackgroundColor() {
        with(binding) {
            if (count % 2 != 0) {
                buttonCount.setBackgroundColor(Color.BLACK)
            } else {
                buttonCount.setBackgroundColor(Color.BLUE)
            }
        }
    }

    companion object {
        private const val KEY = "KEY"
    }

}
