package com.android.userswitcher

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intents = listOf(
            Intent().setComponent(
                ComponentName(
                    "com.android.settings",
                    "com.android.settings.Settings\$UserSettingsActivity"
                )
            ),
            Intent().setComponent(
                ComponentName(
                    "com.android.settings",
                    "com.android.settings.users.UserSettingsActivity"
                )
            ),
            Intent("android.settings.SETTINGS")
        )

        for (intent in intents) {
            try {
                startActivity(intent)
                finish()
                return
            } catch (_: Exception) {
            }
        }

        finish()
    }
}