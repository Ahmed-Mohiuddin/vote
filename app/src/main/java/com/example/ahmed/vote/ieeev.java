package com.example.ahmed.vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
import java.util.Map;

public class ieeev extends AppCompatActivity {

    DatabaseReference database;
    ImageButton ismu,sirju,tal,was;
    String rollno;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ieeev);
        rollno = getIntent().getStringExtra("rollno");
        database = FirebaseDatabase.getInstance().getReference();
        ismu=(ImageButton) findViewById(R.id.ibismail);
        sirju= (ImageButton) findViewById(R.id.ibsiraj);
        tal= (ImageButton) findViewById(R.id.ibtalha);
        was = (ImageButton)findViewById(R.id.ibwassay);

        ismu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ieeev.this, "YOU VOTED ISMAIL", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("IEEE/ISMAIL/").updateChildren(data);
                Intent ahm=new Intent(ieeev.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
        was.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ieeev.this, "YOU VOTED WASSAY", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("IEEE/WASSAY/").updateChildren(data);
                Intent ahm=new Intent(ieeev.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
        sirju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ieeev.this, "YOU VOTED SIRAJ", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("IEEE/SIRAJ/").updateChildren(data);
                Intent ahm=new Intent(ieeev.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
        tal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ieeev.this, "YOU VOTED TALHA", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("IEEE/TALHA/").updateChildren(data);
                Intent ahm=new Intent(ieeev.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
    }
}
