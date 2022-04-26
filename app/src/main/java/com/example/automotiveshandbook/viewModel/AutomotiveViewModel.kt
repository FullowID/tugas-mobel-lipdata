package com.example.automotiveshandbook.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.automotiveshandbook.model.Automotive

class AutomotiveViewModel : ViewModel() {

    private val _title: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val title: LiveData<String>
        get() = _title

    private val _description: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val description: LiveData<String>
        get() = _description

    private val _imageDrawable: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val imageDrawable: LiveData<Int>
        get() = _imageDrawable


    fun setAutomotive(automotive: Automotive, context: Context) {
        _title.value = context.resources.getString(automotive.titleResourceId)
        _description.value = context.resources.getString(automotive.descriptionResourceId)
        _imageDrawable.value = automotive.imageResourceId
    }
}