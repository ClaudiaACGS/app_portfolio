package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.Gray300
import com.example.portfolioapp.ui.theme.Gray400
import com.example.portfolioapp.ui.theme.Gray600
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun MoleculePerfilInfo(title:String, subTitle:String){
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Gray600
        ),
        border = BorderStroke(
            width = 1.dp,
            color = Gray400
        ),
        modifier = Modifier
            .height(80.dp)
            .width(80.dp)
            .padding(6.dp)
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AtomText(
                text = title,
                fontSize = PortfolioFontSize.fontSize_20sp,
                color = White,
                fontWeight = FontWeight.Bold
            )
            AtomText(
                text = subTitle,
                fontSize = PortfolioFontSize.fontSize_14sp,
                color = Gray300,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
@Preview
private fun MoleculePerfilInfoPreview(){
    PortfolioAppTheme {
        MoleculePerfilInfo(
            title = "6+",
            subTitle = "Anos"
        )
    }
}