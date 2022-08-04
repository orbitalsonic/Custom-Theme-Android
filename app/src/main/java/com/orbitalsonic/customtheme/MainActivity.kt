package com.orbitalsonic.customtheme

import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPrefsUtils = SharedPrefsUtils(getSharedPreferences("AppSharedPrefs", MODE_PRIVATE))

        findViewById<Button>(R.id.btn_reset).setOnClickListener {
            sharedPrefsUtils.customTheme = 0
            recreate()
        }

        findViewById<View>(R.id.btn_white).setOnClickListener {
            sharedPrefsUtils.customTheme = 1
            recreate()
        }

        findViewById<View>(R.id.btn_black).setOnClickListener {
            sharedPrefsUtils.customTheme = 2
            recreate()
        }

        findViewById<View>(R.id.btn_red).setOnClickListener {
            sharedPrefsUtils.customTheme = 3
            recreate()
        }

        findViewById<View>(R.id.btn_green).setOnClickListener {
            sharedPrefsUtils.customTheme = 4
            recreate()
        }

        findViewById<View>(R.id.btn_blue).setOnClickListener {
            sharedPrefsUtils.customTheme = 5
            recreate()
        }

        findViewById<View>(R.id.btn_yellow).setOnClickListener {
            sharedPrefsUtils.customTheme = 6
            recreate()
        }

    }
}