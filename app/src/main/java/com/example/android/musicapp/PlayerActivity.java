package com.example.android.musicapp;

import android.content.Intent;
import android.content.res.Resources;
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
        int drawableId = 0;
        String songName = getIntent().getStringExtra("Song_Name");
        String songArtist = getIntent().getStringExtra("Song_Artist");
        String albumName = getIntent().getStringExtra("Song_Album");
        String albumCover = getIntent().getStringExtra("Album_Cover");

        //find the resource id for the provided image and then set it as a resource to the ImageView
        try {
            Class res = R.drawable.class;
            Field field = res.getField(albumCover);
            drawableId = field.getInt(null);
        }
        catch (Exception e) {
            Log.e("Music Player", "Failure to get drawable id.", e);
        }

        ImageView albumCoverImg = findViewById(R.id.album_cover);
        albumCoverImg.setImageResource(drawableId);
    }
}
