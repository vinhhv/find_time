package com.misterjvm.compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogWindow
import androidx.compose.ui.window.rememberDialogState

@Composable
actual fun MeetingDialogWrapper(
    onDismiss: OnDismissType,
    content: @Composable () -> Unit,
) {
    DialogWindow(
        onCloseRequest = { onDismiss() },
        title = "Meetings",
        state = rememberDialogState(),
        content = { content() },
    )
}
