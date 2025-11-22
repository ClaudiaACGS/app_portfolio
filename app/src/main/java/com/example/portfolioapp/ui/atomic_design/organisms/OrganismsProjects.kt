package com.example.portfolioapp.ui.atomic_design.organisms

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.domain.model.PersonalProject
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeInfo
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculePerfilInfo
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeProjectItem
import com.example.portfolioapp.ui.theme.Gray400
import com.example.portfolioapp.ui.theme.Gray500

@Composable
fun OrganismsProjects(
    titleInfo: String,
    iconInfo: Painter,
    projects: List<PersonalProject>,
    excessProjects: Int
) {
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
        modifier = Modifier.padding(6.dp)
    ) {
        Column {
            MoleculeInfo(
                title = titleInfo,
                icon = iconInfo
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                items(projects) { item ->
                    MoleculeProjectItem(item)
                }

                item {
                    if (excessProjects > 0) {
                        MoleculePerfilInfo(
                            title = "+$excessProjects",
                            subTitle = "Projetos"
                        )
                    }
                }
            }
        }
    }
}
