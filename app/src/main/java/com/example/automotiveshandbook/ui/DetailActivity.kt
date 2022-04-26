package com.example.automotiveshandbook.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveshandbook.databinding.ActivityDetailBinding
import com.example.automotiveshandbook.viewModel.AutomotiveViewModel

class DetailActivity : AppCompatActivity() {
    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!

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

        val name = binding.detailTitle
        name.text = intent?.getStringExtra(EXTRA_TITLE).toString()

        val description = binding.detailDescription
        description.text = intent?.getStringExtra(EXTRA_DESCRIPTION).toString()

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

    }
}
