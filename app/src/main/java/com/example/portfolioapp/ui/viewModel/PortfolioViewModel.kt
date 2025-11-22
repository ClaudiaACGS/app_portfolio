package com.example.portfolioapp.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.portfolioapp.data.repository.FakePortfolioRepository
import com.example.portfolioapp.domain.usecase.GetEducationListUseCase
import com.example.portfolioapp.domain.usecase.GetExperienceListUseCase
import com.example.portfolioapp.domain.usecase.GetHardSkillsUseCase
import com.example.portfolioapp.domain.usecase.GetMostRecentEducationUseCase
import com.example.portfolioapp.domain.usecase.GetMostRecentExperienceUseCase
import com.example.portfolioapp.domain.usecase.GetMostRecentProjectUseCase
import com.example.portfolioapp.domain.usecase.GetPersonalProjectsUseCase
import com.example.portfolioapp.domain.usecase.GetProfileUseCase
import com.example.portfolioapp.domain.usecase.GetProjectCountUseCase
import com.example.portfolioapp.domain.usecase.GetSoftSkillsUseCase
import com.example.portfolioapp.domain.usecase.GetTotalExperienceYearsUseCase
import com.example.portfolioapp.ui.ui_state.PortfolioUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class PortfolioViewModel(
    private val getProfile: GetProfileUseCase = GetProfileUseCase(FakePortfolioRepository()),
    private val getEducation: GetEducationListUseCase = GetEducationListUseCase(
        FakePortfolioRepository()
    ),
    private val getExperience: GetExperienceListUseCase = GetExperienceListUseCase(
        FakePortfolioRepository()
    ),
    private val getSoftSkills: GetSoftSkillsUseCase = GetSoftSkillsUseCase(FakePortfolioRepository()),
    private val getHardSkills: GetHardSkillsUseCase = GetHardSkillsUseCase(FakePortfolioRepository()),
    private val getProjects: GetPersonalProjectsUseCase = GetPersonalProjectsUseCase(
        FakePortfolioRepository()
    ),
    private val getMostRecentEducation: GetMostRecentEducationUseCase = GetMostRecentEducationUseCase(
        FakePortfolioRepository()
    ),
    private val getMostRecentExperience: GetMostRecentExperienceUseCase = GetMostRecentExperienceUseCase(
        FakePortfolioRepository()
    ),
    private val getMostRecentProject: GetMostRecentProjectUseCase = GetMostRecentProjectUseCase(
        FakePortfolioRepository()
    ),
    private val getProjectCount: GetProjectCountUseCase = GetProjectCountUseCase(
        FakePortfolioRepository()
    ),
    private val getTotalExperienceYears: GetTotalExperienceYearsUseCase = GetTotalExperienceYearsUseCase(
        FakePortfolioRepository()
    ),
) : ViewModel() {

    private val _uiState = MutableStateFlow<PortfolioUiState>(PortfolioUiState.Loading)
    val uiState = _uiState

    init {
        loadPortfolio()
    }

    private fun loadPortfolio() {
        viewModelScope.launch {
            try {
                val profile = getProfile()
                val education = getEducation()
                val experience = getExperience()
                val softSkills = getSoftSkills()
                val hardSkills = getHardSkills()
                val projects = getProjects()
                val recentEducation = getMostRecentEducation()
                val recentExperience = getMostRecentExperience()
                val recentProject = getMostRecentProject()
                val totalExpYears = getTotalExperienceYears()
                val projectCount = getProjectCount()

                _uiState.value = PortfolioUiState.Success(
                    profile = profile,
                    education = education,
                    experience = experience,
                    softSkills = softSkills,
                    hardSkills = hardSkills,
                    personalProjects = projects,
                    mostRecentEducation = recentEducation,
                    mostRecentExperience = recentExperience,
                    mostRecentProject = recentProject,
                    projectCount = projectCount,
                    totalExperienceYears = totalExpYears
                )

            } catch (e: Exception) {
                _uiState.value = PortfolioUiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}

