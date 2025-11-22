package com.example.portfolioapp.ui.atomic_design.organisms

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeInfo
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeTitleInfo
import com.example.portfolioapp.ui.theme.Gray300
import com.example.portfolioapp.ui.theme.Gray400
import com.example.portfolioapp.ui.theme.Gray500
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize

@Composable
fun OrganismsInfo(
    titleInfo:String,
    iconInfo: Painter,
    subTitleInfo:String,
    iconSub: Painter,
    descrition: String
){
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
            .padding(6.dp)
    ) {
        Column {
            MoleculeInfo(
                title = titleInfo,
                icon = iconInfo
            )
            MoleculeTitleInfo(
                title = subTitleInfo,
                icon = iconSub,
                modifier = Modifier.padding(start = 10.dp)
            )
            AtomText(
                text = descrition,
                color = Gray300,
                maxLines = 3,
                fontSize = PortfolioFontSize.fontSize_12sp,
                modifier = Modifier.padding(start = 20.dp)
            )
        }
    }
}

@Composable
@Preview
private fun OrganismsInfoPreview(){
    PortfolioAppTheme {
        OrganismsInfo(
            titleInfo = stringResource(R.string.job_title),
            iconInfo = painterResource(R.drawable.ic_work),
            subTitleInfo = "MBA Mobile Eng.",
            iconSub = painterResource(R.drawable.ic_trophy),
            descrition = "Especialização mais recente (2025)"
        )
    }
}