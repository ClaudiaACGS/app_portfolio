package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.Education
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetEducationListUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): List<Education> {
        return repository.getEducationList()
    }
}
