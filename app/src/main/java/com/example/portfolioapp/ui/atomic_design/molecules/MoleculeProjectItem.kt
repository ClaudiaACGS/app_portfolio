package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.domain.model.enums.Domain
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.theme.Gray500
import com.example.portfolioapp.ui.theme.Gray600
import com.example.portfolioapp.ui.theme.PortfolioAppTheme

@Composable
fun MoleculeProjectItem(personalProject: PersonalProject){
    Card(
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Gray600.copy(alpha = 0.6f)
        ),
        border = BorderStroke(
            width = 1.dp,
            color = Gray500
        ),
        modifier = Modifier
            .height(90.dp)
            .width(90.dp)
            .padding(4.dp)
    ) {
        AtomImage(
            painter = painterResource(personalProject.image),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
@Preview
private fun MoleculeProjectItemPreview(){
    val project = PersonalProject(
        id = 1,
        title = "Finance App",
        startYear = 2024,
        endYear = 2025,
        domain = Domain.BUSINESS,
        techStack = "Kotlin, Compose, Firebase",
        about = "Mobile Development about Kotlin and Compose",
        image = R.drawable.img_app_financas
    )
    PortfolioAppTheme {
        MoleculeProjectItem(project)
    }
}