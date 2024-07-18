package com.example.intentusagedemo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentusagedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().build())

        activityMainBinding.btnShowImage.setOnClickListener {
            val intent = Intent("com.example.action.media.VIEW")
            intent.action = Intent.ACTION_VIEW
            intent.setDataAndType(Uri.parse("file://${activityMainBinding.edtPath.text.toString()}"),"image/png")
            startActivity(intent)
        }
        activityMainBinding.btnPlayAudio.setOnClickListener {
            val intent = Intent("Intent.ACTION_VIEW")
            intent.setDataAndType(Uri.parse("file://${activityMainBinding.edtPath.text.toString()}"),"audio/mp3")
            startActivity(intent)
        }
        activityMainBinding.btnPlayVideo.setOnClickListener {
            val intent = Intent("Intent.ACTION_VIEW")
            intent.setDataAndType(Uri.parse("file://${activityMainBinding.edtPath.text.toString()}"),"video/mp4")
            startActivity(intent)
        }

    }
}