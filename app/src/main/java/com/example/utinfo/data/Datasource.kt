package com.example.utinfo.data

import com.example.utinfo.R
import com.example.utinfo.model.School

class Datasource () {
    fun loadSchools(): List<School>{
        return listOf(
            School(R.string.nurse),
            School(R.string.business),
            School(R.string.pharma),
            School(R.string.fine_arts),
            School(R.string.edu),
            School(R.string.social),
            School(R.string.info),
            School(R.string.geo),
            School(R.string.eng),
            School(R.string.arch),
            School(R.string.lib_arts),
            School(R.string.comm),
            School(R.string.cns)
        )
    }
}
