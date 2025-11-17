package com.example.portfolioapp.domain.repository

import com.example.portfolioapp.domain.model.Education
import com.example.portfolioapp.domain.model.Experience
import com.example.portfolioapp.domain.model.HardSkill
import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.domain.model.Profile
import com.example.portfolioapp.domain.model.SoftSkill

interface PortfolioRepository {

    suspend fun getProfile(): Profile

    suspend fun getEducationList(): List<Education>

    suspend fun getExperienceList(): List<Experience>

    suspend fun getSoftSkills(): List<SoftSkill>

    suspend fun getHardSkills(): List<HardSkill>

    suspend fun getPersonalProjects(): List<PersonalProject>
}
