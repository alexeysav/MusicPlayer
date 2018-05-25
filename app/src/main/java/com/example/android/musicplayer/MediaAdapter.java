package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MediaAdapter extends ArrayAdapter<Media> {
    public MediaAdapter (Activity context, ArrayList<Media> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        Media currentSong = getItem(position);

        TextView songsTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songsTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentSong.getArtist());

        TextView genreTextView = (TextView) listItemView.findViewById(R.id.genre_name);
        genreTextView.setText(currentSong.getGenre());

        return listItemView;
    }
}
