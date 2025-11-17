package com.example.portfolioapp.domain.usecase

import com.example.portfolioapp.domain.model.HardSkill
import com.example.portfolioapp.domain.repository.PortfolioRepository

class GetHardSkillsUseCase(
    private val repository: PortfolioRepository
) {
    suspend operator fun invoke(): List<HardSkill> {
        return repository.getHardSkills()
    }
}
