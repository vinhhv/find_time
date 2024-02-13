package com.misterjvm.compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog

@Composable
actual fun AddTimeDialogWrapper(
    onDismiss: OnDismissType,
    content: @Composable () -> Unit,
) {
    Dialog(onDismissRequest = onDismiss) {
        content()
    }
}
