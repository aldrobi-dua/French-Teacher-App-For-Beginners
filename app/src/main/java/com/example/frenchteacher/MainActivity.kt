package com.example.frenchteacher

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     }public fun SayTheColor(view: View){
        val clicedButton:Button=view as Button
        var mediaPlayer:MediaPlayer=MediaPlayer.create(
            this,
            resources.getIdentifier(
            clicedButton.tag.toString(),
            "raw",
            packageName
        )
        )
        mediaPlayer.start()
    }
}