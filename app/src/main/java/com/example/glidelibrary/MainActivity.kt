package com.example.glidelibrary

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn)
        val ivPhoto: ImageView = findViewById(R.id.imageView)

        btn.setOnClickListener {
            val url = "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/ipwI8jWqfiUQ/v1/-1x-1.jpg"

            Glide.with(this)
                .load(url)
                .into(ivPhoto)

        }
        }
    }