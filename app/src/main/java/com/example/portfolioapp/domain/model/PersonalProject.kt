package com.example.portfolioapp.domain.model

import com.example.portfolioapp.domain.model.enums.Domain

data class PersonalProject(
    val id: Int,
    val title: String,
    val startYear: Int,
    val endYear: Int,
    val domain: Domain,
    val techStack: String,
    val about: String
)

