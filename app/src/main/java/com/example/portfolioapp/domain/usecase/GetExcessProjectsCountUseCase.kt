package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetExcessProjectsCountUseCase(private val repository: PortfolioRepository) {

    suspend operator fun invoke(): Int {
        val projects = repository.getPersonalProjects()
        return (projects.size - 6).coerceAtLeast(0)
    }
}
