package com.example.android.musicapp;

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
     * Create a new Word object.
     *
     * @param songName   is the title of the song
     * @param songArtist is the artist of the song
     * @param albumName  is the title of the album
     * @param albumImage is the cover of the album
     */
    public Songs(String songName, String songArtist, String albumName, String albumImage) {
        mSongName = songName;
        mSongArtist = songArtist;
        mAlbumName = albumName;
        mAlbumImage = albumImage;
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
