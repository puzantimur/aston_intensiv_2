package com.example.astonintensiv2.lesson2.task22

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.databinding.CodingChallenge22FirstActivityBinding

class CodingChallenge221 : AppCompatActivity() {

    private lateinit var binding: CodingChallenge22FirstActivityBinding

    private val activityForResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val input = result.data?.getStringExtra(CodingChallenge222.KEY_EXTRA) ?: ""
            binding.purchase1.append("\n $input")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CodingChallenge22FirstActivityBinding
            .inflate(layoutInflater)
            .also { setContentView(it.root) }

        if (savedInstanceState != null) {
            binding.purchase1.text = savedInstanceState.getString(KEY)
        }

        with(binding) {
            addPurchasesButton.setOnClickListener {
                activityForResultLauncher.launch(
                    Intent(this@CodingChallenge221, CodingChallenge222::class.java)
                )
            }

            //CODING CHALLENGE 2.3
            buttonFind.setOnClickListener {
                val location = enterShopName.text
                if (location.isEmpty()) {
                    val addressUri = Uri.parse("geo:0,0?q=Walmart")
                    val intent = Intent(Intent.ACTION_VIEW, addressUri)
                    startActivity(intent)
                } else {
                    val addressUri = Uri.parse("geo:0,0?q=$location")
                    val intent = Intent(Intent.ACTION_VIEW, addressUri)
                    startActivity(intent)
                }
            }
            //CODING CHALLENGE 2.3
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(KEY, binding.purchase1.text.toString())
        super.onSaveInstanceState(outState)
    }

    companion object {
        private const val KEY = "KEY"
    }
}
