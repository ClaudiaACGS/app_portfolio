package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun MoleculeTitleInfo(
    icon: Painter,
    title: String,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier.fillMaxWidth(),
    ){
        AtomImage(
            painter = icon,
            modifier = Modifier
                .padding(
                    start = 5.dp,
                    end = 5.dp,
                    top = 7.dp,
                    bottom = 5.dp
                )
                .width(15.dp)
                .height(15.dp)
        )
        AtomText(
            text = title,
            fontSize = PortfolioFontSize.fontSize_12sp,
            color = White,
            modifier = Modifier.padding(top = 2.dp)
        )
    }
}

@Composable
@Preview
private fun MoleculeTitleInfoPreview(){
    PortfolioAppTheme {
        MoleculeTitleInfo(
            icon = painterResource(R.drawable.ic_trophy),
            title = "MBA Mobile Eng."
        )
    }
}