package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetMostRecentProjectUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): PersonalProject? {
        return repository
            .getPersonalProjects()
            .maxByOrNull { it.endYear }
    }
}
