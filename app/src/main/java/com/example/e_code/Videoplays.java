package com.example.e_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Videoplays extends AppCompatActivity {
    VideoView Videoplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_videoplays);
        Videoplay = (VideoView) findViewById(R.id.videoView2);
        //String videopath = "android.resource://com.example.e_code/"+"/"+R.raw.video;
        String videopath = "android.resource://com.example.e_code/"+R.raw.android_elv;
        Uri uri = Uri.parse(videopath);
        Videoplay.setVideoURI(uri);
        Videoplay.start();



        //create recycler view in this activity and use it to display pdf files.

    }

}
