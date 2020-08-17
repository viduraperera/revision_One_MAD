package com.example.revision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final  String EXTRA_NAME = "com.example.revision.EXTRA_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = findViewById(R.id.okButton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, ReadingCollectionsActivity.class);
                EditText readerName = (EditText) findViewById(R.id.name);
                String rName = readerName.getText().toString();
                i.putExtra(EXTRA_NAME, rName);
                startActivity(i);

                Context context = getApplicationContext();
                CharSequence message = "Welcome " + rName + " please Enter what you read";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            }
        });
    }
}
