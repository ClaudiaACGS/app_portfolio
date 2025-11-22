package com.example.portfolioapp.data.repository

import com.example.portfolioapp.R
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
            address = "Rio de Janeiro",
            seniority = Seniority.JUNIOR
        )
    }

    override suspend fun getEducationList(): List<Education> {
        return listOf(
            Education(
                id = 1,
                title = "MBA Mobile Eng.",
                level = EducationLevel.MASTER,
                startYear = 2024,
                endYear = 2025,
                institution = "University Example"
            ),
            Education(
                id = 2,
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
                type = ExperienceType.FULL_TIME,
                startYear = 2025,
                endYear = 2024,
                company = "Self-employed",
                responsibilities = "Building Android apps with Compose."
            ),
            Experience(
                id = 2,
                title = "Android Developer",
                type = ExperienceType.FREELANCE,
                startYear = 2021,
                endYear = 2023,
                company = "Self-employed",
                responsibilities = "Building Android apps with Compose."
            ),
            Experience(
                id = 3,
                title = "Mobile Developer",
                type = ExperienceType.PART_TIME,
                startYear = 2018,
                endYear = 2020,
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
            HardSkill(id = 1, name = "Kotlin", score = 90, icon = R.drawable.ic_kotlin),
            HardSkill(id = 2, name = "Android", score = 95, icon = R.drawable.ic_android,),
            HardSkill(id = 3, name = "TypeScript", score = 95, icon = R.drawable.ic_typescript,),
            HardSkill(id = 4, name = "React Native", score = 95, icon = R.drawable.ic_react_native,),
        )
    }

    override suspend fun getPersonalProjects(): List<PersonalProject> {
        return listOf(
            PersonalProject(
                id = 1,
                title = "Finance App",
                startYear = 2024,
                endYear = 2025,
                domain = Domain.BUSINESS,
                techStack = "Kotlin, Compose, Firebase",
                about = "Mobile Development about Kotlin and Compose",
                image = R.drawable.img_app_financas
            ),
            PersonalProject(
                id = 2,
                title = "Market Space App",
                startYear = 2023,
                endYear = 2022,
                domain = Domain.BUSINESS,
                techStack = "Kotlin, Compose, Firebase",
                about = "Mobile Development about Kotlin and Compose",
                image = R.drawable.img_marketspace
            ),
            PersonalProject(
                id = 3,
                title = "Daily Diet App",
                startYear = 2021,
                endYear = 2020,
                domain = Domain.HEALTH,
                techStack = "Kotlin, Compose, Firebase",
                about = "Mobile Development about Kotlin and Compose",
                image = R.drawable.img_app_financas
            )
        )
    }
}
