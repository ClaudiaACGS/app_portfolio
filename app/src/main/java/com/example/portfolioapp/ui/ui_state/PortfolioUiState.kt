package com.example.portfolioapp.ui.ui_state

import com.example.portfolioapp.domain.model.Education
import com.example.portfolioapp.domain.model.Experience
import com.example.portfolioapp.domain.model.HardSkill
import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.domain.model.Profile
import com.example.portfolioapp.domain.model.SoftSkill

sealed class PortfolioUiState {

    data object Loading : PortfolioUiState()

    data class Success(
        val profile: Profile,
        val education: List<Education>,
        val experience: List<Experience>,
        val softSkills: List<SoftSkill>,
        val hardSkills: List<HardSkill>,
        val personalProjects: List<PersonalProject>
    ) : PortfolioUiState()

    data class Error(val message: String) : PortfolioUiState()
}
