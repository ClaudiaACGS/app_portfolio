package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.Experience
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetExperienceListUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): List<Experience> {
        return repository.getExperienceList()
    }
}
