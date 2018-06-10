package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class Player extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
    }
//    Figure out how to set OnClickListener on ImageViews below to show TOAST when clicked
//    ImageView playSong = (ImageView)findViewById(R.id.play);
//    ImageView rewSong = (ImageView)findViewById(R.id.rewind);
//    ImageView fwSong = (ImageView)findViewById(R.id.forward);
//    ImageView stopSong = (ImageView)findViewById(R.id.stop);
}
