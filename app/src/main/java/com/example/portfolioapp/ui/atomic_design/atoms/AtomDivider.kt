package com.example.portfolioapp.ui.atomic_design.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.portfolioapp.ui.theme.AzureBlue
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioDimens

@Composable
fun AtomDivider(
    color: Color,
    thickness: Dp = PortfolioDimens.dimen_1dp,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(thickness)
            .background(color)
    )
}

@Composable
@Preview
private fun AtomDividerPreview(){
    PortfolioAppTheme {
        AtomDivider(
            color = AzureBlue,
            thickness = PortfolioDimens.dimen_2dp
        )
    }
}