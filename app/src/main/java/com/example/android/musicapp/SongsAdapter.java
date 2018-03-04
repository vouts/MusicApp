package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Stelios on 3/3/2018.
 */

public class SongsAdapter extends ArrayAdapter<Songs> {
    private static final String LOG_TAG = SongsAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param songList A List of AndroidFlavor objects to display in a list
     */
    public SongsAdapter(Activity context, ArrayList<Songs> songList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Songs currentSong = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID listImage
        ImageView listImage = listItemView.findViewById(R.id.list_Image);
        // Get the list Image of the current object and
        // set this image on the List image ImageView
        listImage.setImageResource(currentSong.getListImage());

        // Find the TextView in the list_item.xml layout with the ID album_cover
        TextView albumCover = listItemView.findViewById(R.id.album_cover);
        // Get the list Image of the current object and
        // set this image on the album cover ImageView
        albumCover.setText(currentSong.getAlbumImage());

        // Find the TextView in the list_item.xml layout with the ID song_title
        TextView songName = listItemView.findViewById(R.id.song_title);
        // Get the song name of the current  object and
        // set this text on the name TextView
        songName.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID song_artist
        TextView songArtist = listItemView.findViewById(R.id.song_artist);
        // Get the Artist from the current Songs object and
        // set this text on the Artist TextView
        songArtist.setText(currentSong.getSongArtist());

        // Find the TextView in the list_item.xml layout with the ID song_album
        TextView songAlbum = listItemView.findViewById(R.id.song_album);
        // Get the Album title from the current Songs object and
        // set this text on the Album TextView
        songAlbum.setText(currentSong.getalbumName());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
