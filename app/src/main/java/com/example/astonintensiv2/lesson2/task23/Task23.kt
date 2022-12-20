package com.example.astonintensiv2.lesson2.task23

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import com.example.astonintensiv2.databinding.ActivityTask23Binding

class Task23 : AppCompatActivity() {

    private lateinit var binding: ActivityTask23Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask23Binding
            .inflate(layoutInflater)
            .also { setContentView(it.root) }

        with(binding) {
            openWebsiteButton.setOnClickListener {
                val url = websiteEdittext.text.toString()
                val webpage = Uri.parse(url)
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intent)

            }
            openLocationButton.setOnClickListener {
                val location = locationEdittext.text.toString()
                val addresUri = Uri.parse("geo:0,0?q=$location")
                val intent = Intent(Intent.ACTION_VIEW, addresUri)
                startActivity(intent)
            }
            shareTextButton.setOnClickListener {
                val txt = shareEdittext.text.toString()
                val mimeType = "text/plain"
                ShareCompat.IntentBuilder(this@Task23)
                    .setType(mimeType)
                    .setChooserTitle("Share this text with: ")
                    .setText(txt)
                    .startChooser()
            }
            takeAPhotoButton.setOnClickListener {
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intent)
            }
        }
    }

}
