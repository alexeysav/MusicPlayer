package com.example.android.musicplayer;

import android.content.Context;

public class Media {
    private String mArtist;
    private String mSongName;
    private String mGenre;
    private Context mContext;

    public Media (String artist, String songName, String genre) {
        mArtist = artist;
        mSongName = songName;
        mGenre = genre;
    }
    public String getArtist(){return mArtist;}
    public String getSongName() {return mSongName;}
    public String getGenre() {return mGenre;}
    public Context getContext() {return mContext;}
}
