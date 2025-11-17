package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.domain.repository.PortfolioRepository


class GetPersonalProjectsUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): List<PersonalProject> {
        return repository.getPersonalProjects()
    }
}
