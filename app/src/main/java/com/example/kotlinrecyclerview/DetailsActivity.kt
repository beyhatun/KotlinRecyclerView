package com.example.kotlinrecyclerview

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinrecyclerview.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view =binding.root
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            val intent = intent
            //val selectedLandmark = intent.getSerializableExtra("landmark") as LandMark
        val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)
        }

    }
}