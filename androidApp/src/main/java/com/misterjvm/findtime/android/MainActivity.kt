package com.misterjvm.findtime.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.misterjvm.compose.ui.MainView
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Napier.base(DebugAntilog())
            setContent {
                com.misterjvm.compose.ui.MainView {
                    TopAppBar(
                        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
                        title = {
                            when (it) {
                                0 -> Text(text = stringResource(R.string.world_clocks))
                                else -> Text(text = stringResource(R.string.findmeeting))
                            }
                        },
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    com.misterjvm.compose.ui.MyApplicationTheme {
    }
}
