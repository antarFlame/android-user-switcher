package com.android.userswitcher

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {

            startActivity(
                Intent(Settings.ACTION_USER_SETTINGS)
            )

        } catch (_: ActivityNotFoundException) {

            startActivity(
                Intent(Settings.ACTION_SETTINGS)
            )

        }

        finish()
    }
}