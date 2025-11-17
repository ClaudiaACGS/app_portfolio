package com.example.portfolioapp.data.repository

import com.example.portfolioapp.domain.model.Education
import com.example.portfolioapp.domain.model.Experience
import com.example.portfolioapp.domain.model.HardSkill
import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.domain.model.Profile
import com.example.portfolioapp.domain.model.SoftSkill
import com.example.portfolioapp.domain.model.enums.Domain
import com.example.portfolioapp.domain.model.enums.EducationLevel
import com.example.portfolioapp.domain.model.enums.ExperienceType
import com.example.portfolioapp.domain.model.enums.Seniority
import com.example.portfolioapp.domain.repository.PortfolioRepository


class FakePortfolioRepository : PortfolioRepository {

    override suspend fun getProfile(): Profile {
        return Profile(
            id = 1,
            name = "Ana Gomes",
            role = "Mobile Developer",
            about = "Passionate about Android and Compose.",
            nationality = "Brazilian",
            address = "São Paulo",
            seniority = Seniority.JUNIOR
        )
    }

    override suspend fun getEducationList(): List<Education> {
        return listOf(
            Education(
                id = 1,
                title = "Systems Analysis and Development",
                level = EducationLevel.BACHELOR,
                startYear = 2020,
                endYear = 2023,
                institution = "University Example"
            )
        )
    }

    override suspend fun getExperienceList(): List<Experience> {
        return listOf(
            Experience(
                id = 1,
                title = "Android Developer",
                type = ExperienceType.FREELANCE,
                startYear = 2023,
                endYear = 2024,
                company = "Self-employed",
                responsibilities = "Building Android apps with Compose."
            )
        )
    }

    override suspend fun getSoftSkills(): List<SoftSkill> {
        return listOf(
            SoftSkill(id = 1, name = "Communication", score = 80),
            SoftSkill(id = 2, name = "Teamwork", score = 85)
        )
    }

    override suspend fun getHardSkills(): List<HardSkill> {
        return listOf(
            HardSkill(id = 1, name = "Kotlin", score = 90),
            HardSkill(id = 2, name = "Compose", score = 85)
        )
    }

    override suspend fun getPersonalProjects(): List<PersonalProject> {
        return listOf(
            PersonalProject(
                id = 1,
                title = "English Learning App",
                startYear = 2024,
                endYear = 2025,
                domain = Domain.EDUCATION,
                techStack = "Kotlin, Compose, Firebase",
                about = "Phonetics-based English study app."
            )
        )
    }
}
