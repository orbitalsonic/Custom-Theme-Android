package com.orbitalsonic.customtheme

import android.content.SharedPreferences

private const val CUSTOM_THEME_KEY = "custom_theme_key"

class SharedPrefsUtils (private val mSharedPreferences: SharedPreferences){

    var customTheme: Int
        get() = mSharedPreferences.getInt(CUSTOM_THEME_KEY, 0)
        set(theme) {
            mSharedPreferences.edit().apply {
                putInt(CUSTOM_THEME_KEY, theme)
                apply()
            }
        }
}