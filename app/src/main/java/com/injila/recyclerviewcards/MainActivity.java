package com.injila.recyclerviewcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Movie> listMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        listMovie = new ArrayList<>();

        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.apple));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.avater));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.mango));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.mango));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.orange));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.pinapple));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.mango));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.apple));
        listMovie.add(new Movie("Mr. Robot","Tech Movie","A hacking movie",R.mipmap.avater));

        RecyclerView myRecycler = findViewById(R.id.recycler_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,listMovie);
        myRecycler.setLayoutManager(new GridLayoutManager(this,3));
        myRecycler.setAdapter(myAdapter);
    }
}
