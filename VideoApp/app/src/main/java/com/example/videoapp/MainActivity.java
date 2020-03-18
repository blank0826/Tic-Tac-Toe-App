package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView kny=(VideoView)findViewById(R.id.bc);
        kny.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.cd);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(kny);
        kny.setMediaController(mediaController);
        kny.start();
    }
}
