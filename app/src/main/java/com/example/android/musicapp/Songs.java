package com.example.android.musicapp;

import android.content.Context;

/**
 * Created by Stelios on 3/3/2018.
 */

public class Songs {

    /**
     * Song name
     */
    private String mSongName;

    /**
     * Song artist
     */
    private String mSongArtist;

    /**
     * Song album name
     */
    private String mAlbumName;

    /**
     * Album image
     */
    private String mAlbumImage;

    /**
     * Song list image
     */
    private int mListImage = R.drawable.track;

    /**
     * Song list image
     */
    private Context mContext;

    /**
     * Create a new Word object.
     *
     * @param songName   is the title of the song
     * @param songArtist is the artist of the song
     * @param albumName  is the title of the album
     * @param albumImage is the cover of the album
     */
    public Songs(Context context, String songName, String songArtist, String albumName, String albumImage) {
        mContext = context;
        mSongName = songName;
        mSongArtist = songArtist;
        mAlbumName = albumName;
        mAlbumImage = albumImage;
    }

    /**
     * Get the previous Context.
     */
    public Context getContext() {
        return mContext;
    }

    /**
     * Get the song title.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the song artist.
     */
    public String getSongArtist() {
        return mSongArtist;
    }

    /**
     * Get the album title.
     */
    public String getalbumName() {
        return mAlbumName;
    }

    /**
     * Get the album cover.
     */
    public String getAlbumImage() {
        return mAlbumImage;
    }

    /**
     * Get the image for the song list.
     */
    public int getListImage() {
        return mListImage;
    }

}
