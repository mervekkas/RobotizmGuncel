package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class besinciVideo extends AppCompatActivity {

    Button btn;
    VideoView videoView;
    MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besinci_video);

        btn=(Button)findViewById(R.id.baslatBes);
        videoView=(VideoView)findViewById(R.id.videoViewBes);
        mediaController=new MediaController(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.introbes);
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.start();

            }
        });
    }
}
