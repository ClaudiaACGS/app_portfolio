package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.Experience
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetMostRecentExperienceUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): Experience? {
        return repository
            .getExperienceList()
            .maxByOrNull { it.endYear }
    }
}
