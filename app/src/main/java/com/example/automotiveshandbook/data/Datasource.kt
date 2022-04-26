package com.example.automotiveshandbook.data

import androidx.lifecycle.ViewModel
import com.example.automotiveshandbook.R
import com.example.automotiveshandbook.model.Automotive


class Datasource : ViewModel() {
    fun loadAutomotives(): List<Automotive> {
        return listOf(
            Automotive(R.string.automotive1, R.drawable.vehicle_01, R.string.title1),
            Automotive(R.string.automotive2, R.drawable.vehicle_02, R.string.title2),
            Automotive(R.string.automotive3, R.drawable.vehicle_03, R.string.title3),
            Automotive(R.string.automotive4, R.drawable.vehicle_04, R.string.title4),
            Automotive(R.string.automotive5, R.drawable.vehicle_05, R.string.title5),
            Automotive(R.string.automotive6, R.drawable.vehicle_06, R.string.title6),
            Automotive(R.string.automotive7, R.drawable.vehicle_07, R.string.title7),
            Automotive(R.string.automotive8, R.drawable.vehicle_08, R.string.title8),
            Automotive(R.string.automotive9, R.drawable.vehicle_09, R.string.title9),
            Automotive(R.string.automotive10, R.drawable.vehicle_10, R.string.title10),
        )
    }
}