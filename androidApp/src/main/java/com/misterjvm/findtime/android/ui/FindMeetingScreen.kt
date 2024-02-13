package com.misterjvm.findtime.android.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.misterjvm.findtime.TimeZoneHelper
import com.misterjvm.findtime.TimeZoneHelperImpl

@Composable
fun FindMeetingScreen(timezoneStrings: List<String>) {
  val listState = rememberLazyListState()
  val startTime = remember { mutableIntStateOf(8) }
  val endTime = remember { mutableIntStateOf(17) }
  val selectedTimeZones = remember {
    val selected = SnapshotStateMap<Int, Boolean>()
    for (i in timezoneStrings.indices) selected[i] = true
    selected
  }

  val timezoneHelper: TimeZoneHelper = TimeZoneHelperImpl()
  val showMeetingDialog = remember { mutableStateOf(false) }
  val meetingHours = remember { SnapshotStateList<Int>() }

  if (showMeetingDialog.value) {
    MeetingDialog(
      hours = meetingHours,
      onDismiss = {
        showMeetingDialog.value = false
      }
    )
  }
  // TODO: Add content
}

// TODO: Add getSelectedTimeZones
