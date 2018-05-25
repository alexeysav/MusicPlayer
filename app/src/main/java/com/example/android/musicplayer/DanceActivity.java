package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an array of words
        ArrayList<Media> songs = new ArrayList<Media>();
        songs.add(new Media("Duft Punk", "Get Lucky", "Dance"));
        songs.add(new Media("Avicii", "Wake Me Up", "Dance"));
        songs.add(new Media("Robin Schulz", "Waves", "Dance"));

        MediaAdapter adapter = new MediaAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
