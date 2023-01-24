package com.example.hw_1


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        binding?.btnFirst?.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8005553535"))
            val chooser = Intent.createChooser(intent, "yat")
            startActivity(chooser)
        }
        binding?.btnSecond?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "Hello!")
            intent.type = "text/plan"

            val chooser = Intent.createChooser(intent, "lez' + sat")

            startActivity(chooser)
        }
        binding?.btnThird?.setOnClickListener {
            val webpage: Uri = Uri.parse("http://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            val chooser = Intent.createChooser(intent, "choka")
            startActivity(chooser)
        }
    }
}