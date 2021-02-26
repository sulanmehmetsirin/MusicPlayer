package com.ftmusic.hadise

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class MainDexApp : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
