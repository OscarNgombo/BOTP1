package com.gmail.botp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final Button a = findViewById(R.id.btnSave);
    a.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent y = new Intent(MainActivity.this,home.class);
            startActivity(y);
        }
    });
    }
}
