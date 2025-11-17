package com.example.portfolioapp.domain.model

import com.example.portfolioapp.domain.model.enums.EducationLevel

data class Education(
    val id: Int,
    val title: String,
    val level: EducationLevel,
    val startYear: Int,
    val endYear: Int,
    val institution: String
)

