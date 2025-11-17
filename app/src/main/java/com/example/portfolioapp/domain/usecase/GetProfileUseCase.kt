package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.Profile
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetProfileUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): Profile {
        return repository.getProfile()
    }
}
