package com.example.portfolioapp.domain.model

import com.example.portfolioapp.domain.model.enums.Seniority

data class Profile(
    val id: Int,
    val name: String,
    val role: String,
    val about: String,
    val nationality: String,
    val address: String,
    val seniority: Seniority
)
