package com.example.roboticsortingsystem

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.roboticsortingsystem.ui.theme.InitialScreen

// Enum class holds names of screens in the app
enum class RSSScreen(@StringRes val title: Int) {
    Initial(title = R.string.initial_screen),
    Support(title = R.string.support_screen),
    MachineInfo(title = R.string.machine_info_screen),
    Configuration(title = R.string.configuration_screen)
}

// TODO: Implement top bar

@Composable
fun RSSApp( // Controls navigation between screens
    modifier: Modifier = Modifier // Good practice to pass a default modifier
) {
    // Test: show initial screen
    InitialScreen()
}

// Preview function
@Preview
@Composable
fun RSSAppPreview() {
    RSSApp()
}