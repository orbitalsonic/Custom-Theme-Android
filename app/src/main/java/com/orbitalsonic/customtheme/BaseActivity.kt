package com.orbitalsonic.customtheme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPrefsUtils = SharedPrefsUtils(getSharedPreferences("AppSharedPrefs", MODE_PRIVATE))

        when(sharedPrefsUtils.customTheme){
            0 -> {
                setTheme(R.style.Theme_CustomTheme)
            }

            1 -> {
                setTheme(R.style.WhiteTheme)
            }

            2 -> {
                setTheme(R.style.BlackTheme)
            }

            3 -> {
                setTheme(R.style.RedTheme)
            }

            4 -> {
                setTheme(R.style.GreenTheme)
            }

            5 -> {
                setTheme(R.style.BlueTheme)
            }

            6 -> {
                setTheme(R.style.YellowTheme)
            }
        }
    }
}