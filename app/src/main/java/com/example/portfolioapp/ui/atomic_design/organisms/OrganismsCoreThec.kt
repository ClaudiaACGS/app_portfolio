package com.example.portfolioapp.ui.atomic_design.organisms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.portfolioapp.domain.model.HardSkill
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeCoreTech
import com.example.portfolioapp.ui.atomic_design.molecules.MoleculeCoreTechItem

@Composable
fun OrganismsCoreThec(hardSkill: List<HardSkill>) {
    Column {
        MoleculeCoreTech()

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(hardSkill) { item ->
                MoleculeCoreTechItem(item)
            }
        }
    }
}
