package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetTotalExperienceYearsUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): Int {
        val list = repository.getExperienceList()

        return list.sumOf { exp ->
            (exp.endYear - exp.startYear).coerceAtLeast(0)
        }
    }
}
