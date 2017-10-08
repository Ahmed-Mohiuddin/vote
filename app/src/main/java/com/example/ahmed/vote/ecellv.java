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

public class ecellv extends AppCompatActivity {


    DatabaseReference database;
    ImageButton ethu,muni,rafu,mudu;
    String rollno;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecellv);
        rollno = getIntent().getStringExtra("rollno");
        database = FirebaseDatabase.getInstance().getReference();
        ethu=(ImageButton) findViewById(R.id.ibetti);
        muni= (ImageButton) findViewById(R.id.ibmunu);
        rafu= (ImageButton) findViewById(R.id.ibrafi);
        mudu = (ImageButton)findViewById(R.id.ibmuddu);

        ethu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ecellv.this, "YOU VOTED EHTESHAM", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("ECELL/EHTESHAM/").updateChildren(data);
                Intent ahm=new Intent(ecellv.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
        muni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ecellv.this, "YOU VOTED MUNAWAR", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("ECELL/MUNAWAR/").updateChildren(data);
                Intent ahm=new Intent(ecellv.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
       rafu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ecellv.this, "YOU VOTED RAFI", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("ECELL/RAFI/").updateChildren(data);
                Intent ahm=new Intent(ecellv.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });
        mudu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ecellv.this, "YOU VOTED MUDDASSIR", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("ECELL/MUDDASSIR/").updateChildren(data);
                Intent ahm=new Intent(ecellv.this,thanks.class);
                startActivity(ahm);
                finish();
            }
        });

    }
}
