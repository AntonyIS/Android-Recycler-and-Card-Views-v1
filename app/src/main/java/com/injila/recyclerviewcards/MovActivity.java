package com.injila.recyclerviewcards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovActivity extends AppCompatActivity {
    private TextView title, category, description;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mov);
        Intent intent = getIntent();

        title = findViewById(R.id.movieTitle);
        category = findViewById(R.id.movieCategory);
        description = findViewById(R.id.movieDescription);
        img = findViewById(R.id.movieThumbnail);

        String Title = getIntent().getExtras().getString("Title");
        String Category = getIntent().getExtras().getString("Category");
        String Description= getIntent().getExtras().getString("Description");
        int Thumbnail = getIntent().getExtras().getInt("Thumbnail");

        title.setText(Title);
        category.setText(Category);
        description.setText(Description);
        img.setImageResource(Thumbnail);



    }
}
