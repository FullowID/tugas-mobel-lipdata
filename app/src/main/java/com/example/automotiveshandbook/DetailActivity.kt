package com.example.automotiveshandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.LiveData
import com.example.automotiveshandbook.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!
    private val viewModel = AutomotiveViewModel()

    companion object {
        const val EXTRA_TITLE = "title"
        const val EXTRA_DESCRIPTION = "description"
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = binding.detailTitle2
        name.text = intent?.getStringExtra(EXTRA_TITLE).toString()

        val description = binding.detailDescription2
        description.text = intent?.getStringExtra(EXTRA_DESCRIPTION).toString()

        val image = binding.detailImage2
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

    }
}
