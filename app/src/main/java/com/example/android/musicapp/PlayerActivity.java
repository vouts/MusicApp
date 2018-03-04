package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.lang.reflect.Field;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Get the Variables from the previous activity
        String songName = getIntent().getStringExtra("Song_Name");
        String songArtist = getIntent().getStringExtra("Song_Artist");
        String albumName = getIntent().getStringExtra("Song_Album");
        String albumCover = getIntent().getStringExtra("Album_Cover");

        /* Find the resource id for the provided image and then set it as a resource to the ImageView.
        *  If there is no Image, with that name at the resources it will display a default image
        */
        int drawableId = R.drawable.track;
        try {
            Class res = R.drawable.class;
            Field field = res.getField(albumCover);
            drawableId = field.getInt(null);
        }
        catch (Exception  ignored) {
            Log.e("Music Player", "Failure to get drawable id.");
        }

        ImageView albumCoverImg = findViewById(R.id.album_cover);
        albumCoverImg.setImageResource(drawableId);
    }
}
