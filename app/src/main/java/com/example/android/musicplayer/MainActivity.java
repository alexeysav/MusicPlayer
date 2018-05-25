package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView genres = (TextView) findViewById(R.id.playlist1);
        genres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(genresIntent);
            }
        });
        TextView lists = (TextView) findViewById(R.id.playlist2);
        lists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listsIntent = new Intent(MainActivity.this, DanceActivity.class);
                startActivity(listsIntent);
            }
        });
        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
    }
}
