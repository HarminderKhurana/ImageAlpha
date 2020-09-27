package com.live.harminder.imagex

import android.os.Bundle

class MainActivity : ImagePickerUtility() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImagePickers(this)
    }

    override val contentId: Int
        get() = R.layout.activity_main

    override fun selectedImage(imagePath: String?) {

    }
}