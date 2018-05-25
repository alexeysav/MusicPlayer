package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an array of words
        ArrayList<Media> songs = new ArrayList<Media>();
        songs.add(new Media("AC/DC", "T.N.T", "Rock"));
        songs.add(new Media("AC/DC", "War Machine", "Rock"));

        MediaAdapter adapter = new MediaAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
