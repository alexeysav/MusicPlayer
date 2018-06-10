package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an array of words
        ArrayList<Media> songs = new ArrayList<Media>();
        songs.add(new Media("AC/DC", "T.N.T", "Rock"));
        songs.add(new Media("AC/DC", "War Machine", "Rock"));
        songs.add(new Media("Duft Punk", "Get Lucky", "Dance"));
        songs.add(new Media("Avicii", "Wake Me Up", "Dance"));
        songs.add(new Media("Robin Schulz", "Waves", "Dance"));
        songs.add(new Media("Cold Play", "Adventure Of A Lifetime", "Alternative Rock"));

        MediaAdapter adapter = new MediaAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SongsActivity.this, "Playing The Song", Toast.LENGTH_SHORT).show();
                Intent play = new Intent(SongsActivity.this, Player.class);
                startActivity(play);
            }
        });
    }
}
