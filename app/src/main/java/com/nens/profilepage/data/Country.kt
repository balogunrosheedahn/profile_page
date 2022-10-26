package com.nens.profilepage.data

import com.nens.profilepage.R

data class Country(val image: Int, val name: String)

object Countries {

    private val images = intArrayOf(
        R.drawable.all_countries,
        R.drawable.australia,
        R.drawable.china,
        R.drawable.nigeria
    )

    private val countries = arrayOf(
        "All",
        "+555",
        "+123",
        "+234"
    )

    var list: ArrayList<Country>? = null
        get() {
            if (field != null)
                return field

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images[i]
                val countryName = countries[i]

                val country = Country(imageId, countryName)
                field!!.add(country)
            }
            return field
        }
}
