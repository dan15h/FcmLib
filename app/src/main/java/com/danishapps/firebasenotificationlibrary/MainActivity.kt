package com.danishapps.firebasenotificationlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danishapps.firebasenotificationlib.FcmLib

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FcmLib.setupFCM(this, "topicname")
    }
}