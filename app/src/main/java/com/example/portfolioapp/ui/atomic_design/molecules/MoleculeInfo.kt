package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.Gray300
import com.example.portfolioapp.ui.theme.Gray500
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun MoleculeInfo(
    icon: Painter,
    title: String
){
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
            ) {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(0.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Gray500.copy(alpha = 0.6f)
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Gray500
                    ),
                    modifier = Modifier
                        .padding(6.dp)
                ) {
                    AtomImage(
                        painter = icon,
                        modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp, top = 3.dp, bottom = 5.dp)
                            .width(20.dp)
                            .height(20.dp)
                    )
                }
                AtomText(
                    text = title,
                    fontSize = PortfolioFontSize.fontSize_14sp,
                    color = White,
                    modifier = Modifier.padding(top = 7.dp)
                )
            }
            AtomImage(
                painter =  painterResource(R.drawable.ic_right),
                modifier = Modifier
                    .padding(
                        start = 5.dp,
                        end = 5.dp,
                        top = 10.dp,
                        bottom = 5.dp
                    )
                    .width(20.dp)
                    .height(20.dp)
            )
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = Gray300,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
        )
    }
}


@Composable
@Preview
private fun MoleculeInfoPreview(){
    PortfolioAppTheme {
        MoleculeInfo(
            title = "Experiência Profissional",
            icon = painterResource(R.drawable.ic_work)
        )
    }
}