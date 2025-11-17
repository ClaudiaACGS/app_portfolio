package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.SoftSkill
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetSoftSkillsUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): List<SoftSkill> {
        return repository.getSoftSkills()
    }
}
