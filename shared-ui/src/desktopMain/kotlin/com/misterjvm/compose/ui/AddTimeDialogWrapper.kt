package com.misterjvm.compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.DialogWindow
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberDialogState

@Composable
actual fun AddTimeDialogWrapper(
    onDismiss: OnDismissType,
    content: @Composable () -> Unit,
) {
    DialogWindow(
        onCloseRequest = { onDismiss() },
        state = rememberDialogState(position = WindowPosition(Alignment.Center)),
        title = "Add Timezones",
        content = {
            content()
        },
    )
}
