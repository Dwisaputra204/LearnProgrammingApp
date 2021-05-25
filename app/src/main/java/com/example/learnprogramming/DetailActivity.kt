package com.example.learnprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMG = "extra_age"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DESCRIPTION = "extra_description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgPL: ImageView = findViewById(R.id.img_pl)
        val tvTitle: TextView = findViewById(R.id.tv_title)
        val tvDescription: TextView = findViewById(R.id.tv_description)

        val image = intent.getIntExtra(EXTRA_IMG,0)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)

        imgPL.setImageResource(image)
        tvTitle.text = title
        tvDescription.text = description
    }
}