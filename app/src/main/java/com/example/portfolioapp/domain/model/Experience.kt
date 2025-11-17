package com.example.portfolioapp.domain.model

import com.example.portfolioapp.domain.model.enums.ExperienceType

data class Experience(
    val id: Int,
    val title: String,
    val type: ExperienceType,
    val startYear: Int,
    val endYear: Int,
    val company: String,
    val responsibilities: String
)

