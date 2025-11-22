package com.example.portfolioapp.ui.atomic_design.template

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.organisms.OrganismsCoreThec
import com.example.portfolioapp.ui.atomic_design.organisms.OrganismsInfo
import com.example.portfolioapp.ui.atomic_design.organisms.OrganismsPerfil
import com.example.portfolioapp.ui.atomic_design.organisms.OrganismsProjects
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.ui_state.PortfolioUiState
import com.example.portfolioapp.ui.viewModel.PortfolioViewModel

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun TemplatePortfolio(viewModel: PortfolioViewModel){
    val uiState by viewModel.uiState.collectAsState()
    when (uiState) {
        is PortfolioUiState.Loading -> {
            // loading UI
        }
        is PortfolioUiState.Error -> {
            // error UI
        }
        is PortfolioUiState.Success -> {
            val data = uiState as PortfolioUiState.Success
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .verticalScroll(rememberScrollState())
                ) {
                    OrganismsPerfil(
                        profile = data.profile,
                        qtdProjects = data.projectCount,
                        years = data.totalExperienceYears
                    )

                    Column(
                        modifier = Modifier.padding(15.dp)
                    ) {
                        OrganismsCoreThec(data.hardSkills)
                        Spacer(Modifier.height(15.dp))
                        OrganismsInfo(
                            titleInfo = stringResource(R.string.job_title),
                            iconInfo = painterResource(R.drawable.ic_work),
                            subTitleInfo = data.mostRecentExperience?.title.toString(),
                            iconSub = painterResource(R.drawable.ic_storm),
                            descrition = data.mostRecentExperience?.responsibilities.toString()
                        )
                        Spacer(Modifier.height(15.dp))
                        OrganismsProjects(
                            projects = data.latestProjectsUseCase,
                            titleInfo = "Labs & Projects",
                            iconInfo = painterResource(R.drawable.ic_phone),
                            excessProjects = data.excessProjectsCountUseCase
                        )
                        Spacer(Modifier.height(15.dp))
                        OrganismsInfo(
                            titleInfo = stringResource(R.string.voluntter_title),
                            iconInfo = painterResource(R.drawable.ic_heart),
                            subTitleInfo = "MBA Mobile Eng.",
                            iconSub = painterResource(R.drawable.ic_trophy),
                            descrition = "Especialização mais recente (2025)"
                        )
                        Spacer(Modifier.height(15.dp))
                        OrganismsInfo(
                            titleInfo = stringResource(R.string.education_title),
                            iconInfo = painterResource(R.drawable.ic_graduation),
                            subTitleInfo = data.mostRecentEducation?.title.toString(),
                            iconSub = painterResource(R.drawable.ic_trophy),
                            descrition = data.mostRecentEducation?.level.toString()
                        )

                    }
                }
            }
        }
    }
}

/*@Composable
@Preview
private fun TemplatePortfolioPreview(){
    PortfolioAppTheme {
        TemplatePortfolio()
    }
}*/