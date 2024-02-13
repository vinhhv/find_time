package com.misterjvm.compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog

@Composable
actual fun MeetingDialogWrapper(
    onDismiss: OnDismissType,
    content: @Composable () -> Unit,
) {
    Dialog(onDismissRequest = onDismiss) {
        content()
    }
}
