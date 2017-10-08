package com.example.ahmed.vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class chapters extends AppCompatActivity {

    ImageButton csi,ieee,ecell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);

        final String rollno = getIntent().getStringExtra("rollno");
        csi= (ImageButton) findViewById(R.id.ibCSI);
        ieee= (ImageButton) findViewById(R.id.ibIEEE);
        ecell= (ImageButton) findViewById(R.id.ibEcell);

        csi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csiIntent = new Intent(chapters.this, csiv.class);
                csiIntent.putExtra("rollno",rollno);
                startActivity(csiIntent);
            }
        });

        ieee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csiIntent = new Intent(chapters.this, ieeev.class);
                csiIntent.putExtra("rollno",rollno);
                startActivity(csiIntent);
            }
        });

        ecell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csiIntent = new Intent(chapters.this, ecellv.class);
                csiIntent.putExtra("rollno",rollno);
                startActivity(csiIntent);
            }
        });
    }
}
