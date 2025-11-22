package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetProjectCountUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): Int {
        return repository.getPersonalProjects().size
    }
}
