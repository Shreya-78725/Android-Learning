package com.example.shreyaandroidbootcamp.vedioPlayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import androidx.media3.ui.PlayerView
import com.example.shreyaandroidbootcamp.R

class VedioPlayer : AppCompatActivity() {
    lateinit var playerView:PlayerView
    lateinit var player : ExoPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vedio_player)

        val action=supportActionBar
        action!!.title="Vedio Player"

        playerView=findViewById(R.id.player_view)
        val player= ExoPlayer.Builder(this).build()
        playerView.player= player

       val mediaItem= MediaItem.Builder()
           .setUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4 ")
           .setMimeType(MimeTypes.APPLICATION_MP4)
           .build()

        val mediaSource=ProgressiveMediaSource.Factory(
            DefaultDataSource.Factory(this)
        ).createMediaSource(mediaItem)

        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
    }
}