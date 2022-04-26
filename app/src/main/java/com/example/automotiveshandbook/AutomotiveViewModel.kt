package com.example.automotiveshandbook

import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toDrawable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.automotiveshandbook.model.Automotive

class AutomotiveViewModel: ViewModel() {

    private lateinit var  _title: MutableLiveData<String>
    val title: LiveData<String>
        get() = _title

    private lateinit var _description: MutableLiveData<String>
    val description: LiveData<String>
        get() = _description

    private lateinit var _image: MutableLiveData<Drawable>
    val imageView: LiveData<Drawable>
        get() = _image

    fun onClicked(automotive: List<Automotive>, position: Int) {
        _title.value = automotive[position].titleResourceId.toString()
        _description.value = automotive[position].descriptionResourceId.toString()
        _image.value = automotive[position].imageResourceId.toDrawable()
    }
}