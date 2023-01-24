package com.example.hw_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.example.hw_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    var binding : ActivitySecondBinding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        val intent = intent
        if  (intent.action == Intent.ACTION_SEND && intent.categories.contains(Intent.CATEGORY_DEFAULT)) {
            val string = intent.dataString
            binding?.tvMain?.text = "$string"
        }


    }
}