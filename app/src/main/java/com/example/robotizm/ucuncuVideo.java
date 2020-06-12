package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ucuncuVideo extends AppCompatActivity {

    Button btn;
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucuncu_video);

        btn=(Button)findViewById(R.id.baslatUc);
        videoView=(VideoView)findViewById(R.id.videoViewUc);
        mediaController=new MediaController(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.introuc);
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.start();

            }
        });
    }
}
