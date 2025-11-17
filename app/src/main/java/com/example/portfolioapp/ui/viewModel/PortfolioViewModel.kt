package com.example.portfolioapp.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.portfolioapp.data.repository.FakePortfolioRepository
import com.example.portfolioapp.domain.usecase.GetEducationListUseCase
import com.example.portfolioapp.domain.usecase.GetExperienceListUseCase
import com.example.portfolioapp.domain.usecase.GetHardSkillsUseCase
import com.example.portfolioapp.domain.usecase.GetPersonalProjectsUseCase
import com.example.portfolioapp.domain.usecase.GetProfileUseCase
import com.example.portfolioapp.domain.usecase.GetSoftSkillsUseCase
import com.example.portfolioapp.ui.ui_state.PortfolioUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class PortfolioViewModel(
    private val getProfile: GetProfileUseCase = GetProfileUseCase(FakePortfolioRepository()),
    private val getEducation: GetEducationListUseCase = GetEducationListUseCase(FakePortfolioRepository()),
    private val getExperience: GetExperienceListUseCase = GetExperienceListUseCase(FakePortfolioRepository()),
    private val getSoftSkills: GetSoftSkillsUseCase = GetSoftSkillsUseCase(FakePortfolioRepository()),
    private val getHardSkills: GetHardSkillsUseCase = GetHardSkillsUseCase(FakePortfolioRepository()),
    private val getProjects: GetPersonalProjectsUseCase = GetPersonalProjectsUseCase(FakePortfolioRepository())
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

                _uiState.value = PortfolioUiState.Success(
                    profile = profile,
                    education = education,
                    experience = experience,
                    softSkills = softSkills,
                    hardSkills = hardSkills,
                    personalProjects = projects
                )

            } catch (e: Exception) {
                _uiState.value = PortfolioUiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}

