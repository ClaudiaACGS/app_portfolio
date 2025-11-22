package com.example.portfolioapp.ui.atomic_design.organisms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.atomic_design.atoms.AtomImage
import com.example.portfolioapp.ui.atomic_design.atoms.AtomText
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeDownload
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeJob
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculePerfilInfo
import com.example.portfolioapp.ui.theme.Gray700
import com.example.portfolioapp.ui.theme.PortfolioAppTheme
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun MoleculePerfil(name: String, job: String, years:Int, qtdProjects:Int) {
    Card(
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(330.dp)
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
    ) {
        Box(modifier = Modifier.fillMaxSize()) {

            AtomImage(
                painter = painterResource(R.drawable.profile_dev),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Gray700.copy(alpha = 0.4f))
            ) {

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AtomText(
                        text = name,
                        fontSize = PortfolioFontSize.fontSize_20sp,
                        color = White,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                    )

                    MoleculeJob(job)

                    Row(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        MoleculePerfilInfo(
                            title = "${years}+",
                            subTitle = "Anos"
                        )
                        MoleculePerfilInfo(
                            title = "$qtdProjects",
                            subTitle = "Projetos"
                        )
                        MoleculeDownload()
                    }

                }
            }
        }
    }
}


@Composable
@Preview
private fun MoleculePerfilPreview(){
    PortfolioAppTheme {
        MoleculePerfil(
            name = "Ana Gomes",
            job = "Mobile Developer",
            years = 6,
            qtdProjects = 42
        )
    }
}