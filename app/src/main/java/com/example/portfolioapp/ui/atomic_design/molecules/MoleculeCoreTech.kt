package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun MoleculeCoreTech(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(start = 15.dp)
    ) {
        AtomImage(
            painter = painterResource(R.drawable.ic_core),
            modifier = Modifier
                .height(30.dp)
                .width(30.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        AtomText(
            text = stringResource(R.string.core_title),
            fontSize = PortfolioFontSize.fontSize_16sp,
            color = White
        )
    }
}

@Composable
@Preview
private fun MoleculeCoreTechPreview(){
    PortfolioAppTheme {
        MoleculeCoreTech()
    }
}