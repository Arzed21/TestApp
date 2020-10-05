package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    Boolean isGhost = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = findViewById(R.id.videoView);
        MediaController mediaControllerALI = new MediaController(this);
        videoView.setMediaController(mediaControllerALI);
        //salam


        Uri uriAparat = Uri.parse("https://as7.cdn.asset.aparat.com/aparat-video/7e08f495e590203ec9b8225b6d27facd24550096-1080p.mp4");
        videoView.setVideoURI(uriAparat);
        videoView.start();



    }



}
