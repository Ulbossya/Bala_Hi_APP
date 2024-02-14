package com.example.techcup;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class tolygyraq_it extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tolygyraq_it);
        VideoView videoView = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.roboto);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}