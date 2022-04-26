package com.example.automotiveshandbook.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Automotive(
    @StringRes val descriptionResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val titleResourceId: Int)