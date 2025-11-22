package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.domain.model.HardSkill
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.Gray300
import com.example.portfolioapp.ui.theme.Gray500
import com.example.portfolioapp.ui.theme.Gray600
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize

@Composable
fun MoleculeCoreTechItem(hardSkill: HardSkill){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
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
                .height(70.dp)
                .width(70.dp)
                .padding(6.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            AtomImage(
                painter = painterResource(hardSkill.icon),
                modifier = Modifier
                    .padding(top = 5.dp)
                    .width(50.dp)
                    .height(50.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }

        AtomText(
            text = hardSkill.name,
            fontSize = PortfolioFontSize.fontSize_14sp,
            color = Gray300
        )
    }
}

@Composable
@Preview
private fun MoleculeCoreTechItemPreview(){
    val hardSkill: HardSkill = HardSkill(id = 1, name = "Kotlin", score = 90, icon = R.drawable.ic_kotlin)
    PortfolioAppTheme {
        MoleculeCoreTechItem(hardSkill)
    }
}