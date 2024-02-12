package com.misterjvm.findtime.android.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.misterjvm.findtime.android.MyApplicationTheme

sealed class Screen(val title: String) {
  object TimeZonesScreen : Screen("Timezones")
  object FindTimeScreen : Screen("Find Time")
}

data class BottomItem(
  val route: String,
  val icon: ImageVector,
  val iconContentDescription: String
)

val bottomNavigationItems = listOf(
  BottomItem(
    Screen.TimeZonesScreen.title,
    Icons.Filled.Language,
    "Timezones"
  ),
  BottomItem(
    Screen.FindTimeScreen.title,
    Icons.Filled.Place,
    "Find Time"
  )
)

@Composable
fun MainView(actionBarFun: topBarFun = { EmptyComposable() }) {
  val showAddDialog = remember { mutableStateOf(false) }
  val currentTimezoneStrings = remember { SnapshotStateList<String>() }
  val selectedIndex = remember { mutableIntStateOf(0) }
  MyApplicationTheme {
    // TODO: Add Scaffold
  }
}
