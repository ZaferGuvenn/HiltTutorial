package com.hilt.tutorial

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/*
* Hilt için gerekli. Manifest içine de application name olarak eklemeliyiz.
* */
@HiltAndroidApp
class MyApplication: Application() {
}