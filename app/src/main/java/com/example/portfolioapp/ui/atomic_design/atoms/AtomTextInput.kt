package com.example.portfolioapp.ui.atomic_design.atoms

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolioapp.R
import com.example.portfolioapp.ui.theme.Danger
import com.example.portfolioapp.ui.theme.Gray100
import com.example.portfolioapp.ui.theme.Gray300
import com.example.portfolioapp.ui.theme.Gray500
import com.example.portfolioapp.ui.theme.PortfolioFontSize
import com.example.portfolioapp.ui.theme.White

@Composable
fun AtomTextInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    placeholder: String? = null,
    isError: Boolean = false,
    textStyle: TextStyle = TextStyle(fontSize = PortfolioFontSize.fontSize_16sp, color = White),
    singleLine: Boolean = true,
    maxLines: Int = 1,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(
        keyboardType = KeyboardType.Text,
        imeAction = ImeAction.Done
    ),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,

    backgroundColor: Color = Gray500,

    focusedBorderColor: Color = Gray100,
    unfocusedBorderColor: Color = Gray300,
    errorBorderColor: Color = Danger
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { if (label != null) Text(text = label) },
        placeholder = { if (placeholder != null) Text(text = placeholder) },
        textStyle = textStyle,
        singleLine = singleLine,
        maxLines = maxLines,
        isError = isError,
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,

        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = backgroundColor,
            unfocusedContainerColor = backgroundColor,
            errorContainerColor = backgroundColor,

            focusedBorderColor = focusedBorderColor,
            unfocusedBorderColor = unfocusedBorderColor,
            errorBorderColor = errorBorderColor,

            focusedLabelColor = focusedBorderColor,
            unfocusedLabelColor = unfocusedBorderColor,
            errorLabelColor = errorBorderColor
        )
    )
}


@Composable
@Preview
private fun AtomTextInputPreview(){
    var taskName by remember { mutableStateOf("") }

    AtomTextInput(
        value = taskName,
        onValueChange = { taskName = it },
        label = stringResource(R.string.add_info),
        placeholder = "Type your task...",
    )
}