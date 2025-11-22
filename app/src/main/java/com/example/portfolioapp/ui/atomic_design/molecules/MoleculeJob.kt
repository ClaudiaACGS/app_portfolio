package com.example.portfolioapp.ui.atomic_design.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.theme.Gray400
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun MoleculeJob(job:String){
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Gray400.copy(alpha = 0.7f)
        ),
        modifier = Modifier
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, end = 10.dp, start = 10.dp)
        ) {
            AtomImage(
                painter = painterResource(R.drawable.ic_dev),
                modifier = Modifier
                    .height(20.dp)
                    .width(20.dp)
            )

            Spacer(modifier = Modifier.width(6.dp))

            AtomText(
                text = job,
                color = White,
                textAlign = TextAlign.Center,
                fontSize = PortfolioFontSize.fontSize_16sp,
            )

        }
    }
}

@Composable
@Preview
private fun MoleculeJobPreview(){
    PortfolioAppTheme {
        MoleculeJob("Mobile Developer")
    }
}