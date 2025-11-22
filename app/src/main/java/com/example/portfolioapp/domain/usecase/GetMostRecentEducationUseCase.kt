package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.Education
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetMostRecentEducationUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): Education? {
        return repository
            .getEducationList()
            .maxByOrNull { it.endYear }
    }
}
