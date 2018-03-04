package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <Songs> songLit = new ArrayList<>();

        songLit.add(new Songs("Song Name 1", "Artist 1", "Album name 1", R.drawable.album));
        songLit.add(new Songs("Song Name 2", "Artist 2", "Album name 2", R.drawable.album));
        songLit.add(new Songs("Song Name 3", "Artist 3", "Album name 3", R.drawable.album));
        songLit.add(new Songs("Song Name 4", "Artist 4", "Album name 4", R.drawable.album));
        songLit.add(new Songs("Song Name 5", "Artist 5", "Album name 5", R.drawable.album));
        songLit.add(new Songs("Song Name 6", "Artist 6", "Album name 6", R.drawable.album));
        songLit.add(new Songs("Song Name 7", "Artist 7", "Album name 7", R.drawable.album));
        songLit.add(new Songs("Song Name 8", "Artist 8", "Album name 8", R.drawable.album));
        songLit.add(new Songs("Song Name 9", "Artist 9", "Album name 9", R.drawable.album));
        songLit.add(new Songs("Song Name 10", "Artist 10", "Album name 10", R.drawable.album));
        songLit.add(new Songs("Song Name 11", "Artist 11", "Album name 11", R.drawable.album));
        songLit.add(new Songs("Song Name 12", "Artist 12", "Album name 12", R.drawable.album));
        songLit.add(new Songs("Song Name 13", "Artist 13", "Album name 13", R.drawable.album));
        songLit.add(new Songs("Song Name 14", "Artist 14", "Album name 14", R.drawable.album));
        songLit.add(new Songs("Song Name 15", "Artist 15", "Album name 15", R.drawable.album));
        songLit.add(new Songs("Song Name 16", "Artist 16", "Album name 16", R.drawable.album));

        SongsAdapter itemsAdapter = new SongsAdapter(this, songLit);

        ListView listView = (ListView) findViewById(R.id.song_List);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick (AdapterView <?> adapter, View view,int position, long arg){
                                                // TODO Auto-generated method stub
                                                Intent ColorsIntent = new Intent(MainActivity.this, Splash.class);
                                                startActivity(ColorsIntent);
                                            }
                                        }
        );

    }
}
