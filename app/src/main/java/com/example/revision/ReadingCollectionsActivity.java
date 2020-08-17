package com.example.revision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReadingCollectionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_collections);

        Button bookButton = (Button) findViewById(R.id.bookid);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReadingCollectionsActivity.this, AddReading.class);
                startActivity(i);
            }
        });

        Button paperButton = (Button) findViewById(R.id.paperid);
        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReadingCollectionsActivity.this, AddReading.class);
                startActivity(i);
            }
        });
    }
}
