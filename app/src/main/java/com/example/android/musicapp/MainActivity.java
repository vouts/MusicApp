package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Songs> songLit = new ArrayList<>();

        songLit.add(new Songs(this, "Song Name 1", "Artist 1", "Album name 1", "album"));
        songLit.add(new Songs(this, "Song Name 2", "Artist 2", "Album name 2", "album"));
        songLit.add(new Songs(this, "Song Name 3", "Artist 3", "Album name 3", "album"));
        songLit.add(new Songs(this, "Song Name 4", "Artist 4", "Album name 4", "album"));
        songLit.add(new Songs(this, "Song Name 5", "Artist 5", "Album name 5", "album"));
        songLit.add(new Songs(this, "Song Name 6", "Artist 6", "Album name 6", "album"));
        songLit.add(new Songs(this, "Song Name 7", "Artist 7", "Album name 7", "album"));
        songLit.add(new Songs(this, "Song Name 8", "Artist 8", "Album name 8", "album"));
        songLit.add(new Songs(this, "Song Name 9", "Artist 9", "Album name 9", "album"));
        songLit.add(new Songs(this, "Song Name 10", "Artist 10", "Album name 10", "album"));
        songLit.add(new Songs(this, "Song Name 11", "Artist 11", "Album name 11", "album"));
        songLit.add(new Songs(this, "Song Name 12", "Artist 12", "Album name 12", "album"));
        songLit.add(new Songs(this, "Song Name 13", "Artist 13", "Album name 13", "album"));
        songLit.add(new Songs(this, "Song Name 14", "Artist 14", "Album name 14", "album"));
        songLit.add(new Songs(this, "Song Name 15", "Artist 15", "Album name 15", "album"));
        songLit.add(new Songs(this, "Song Name 16", "Artist 16", "Album name 16", "album"));

        SongsAdapter itemsAdapter = new SongsAdapter(this, songLit);

        ListView listView = findViewById(R.id.song_List);

        listView.setAdapter(itemsAdapter);


    }
}
