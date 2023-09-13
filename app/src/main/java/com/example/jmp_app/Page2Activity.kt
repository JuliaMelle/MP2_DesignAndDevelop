package com.example.jmp_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.net.Uri

import android.widget.MediaController
import android.widget.VideoView

class Page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page2activity)

        val videoView = findViewById<VideoView>(R.id.videoView)

        // Set the video path or URI
        val videoPath = "android.resource://" + packageName + "/" + R.raw.r101
        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)

        // Add media controller for play, pause, etc. (optional)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Start playing the video
        videoView.start()
    }
    fun navigateToSecondActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }





}