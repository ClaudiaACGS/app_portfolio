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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.Gray300
import com.example.portfolioapp.ui.theme.Gray400
import com.example.portfolioapp.ui.theme.Gray500
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize

@Composable
fun MoleculeDownload(){
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Gray500.copy(alpha = 0.6f)
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
            AtomImage(
                painter = painterResource(R.drawable.ic_download),
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
            )
            AtomText(
                text = "SAVE CV",
                fontSize = PortfolioFontSize.fontSize_11sp,
                color = Gray300,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(bottom = 5.dp)
            )
        }
    }
}

@Composable
@Preview
private fun MoleculeDownloadPreview(){
    PortfolioAppTheme {
        MoleculeDownload()
    }
}