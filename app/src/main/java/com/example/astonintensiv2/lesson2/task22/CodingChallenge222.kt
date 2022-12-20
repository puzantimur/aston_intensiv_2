package com.example.astonintensiv2.lesson2.task22

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.databinding.CodingChallenge22SecondActivityBinding

class CodingChallenge222 : AppCompatActivity() {

    private lateinit var binding: CodingChallenge22SecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CodingChallenge22SecondActivityBinding.inflate(layoutInflater)
            .also { setContentView(it.root) }

        with(binding) {
            val listOfButton = mutableListOf(
                button2, button10, button1, button3, button4,
                button5, button6, button7, button8, button9
            )
            listOfButton.onEach { button ->
                button.setOnClickListener {
                    setResult(
                        Activity.RESULT_OK,
                        Intent().putExtra(KEY_EXTRA, button.text.toString())
                    )
                    finish()
                }
            }
        }
    }

    companion object {
        const val KEY_EXTRA = "KEY_EXTRA"
    }

}
