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

public class csiv extends AppCompatActivity {
    DatabaseReference database;
    ImageButton ahmed,amir,ali,zohaib;
    String rollno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csiv);

        rollno = getIntent().getStringExtra("rollno");
        database = FirebaseDatabase.getInstance().getReference();
        ahmed=(ImageButton) findViewById(R.id.ibahmed);
        amir= (ImageButton) findViewById(R.id.ibamer);
        ali= (ImageButton) findViewById(R.id.ibali);
        zohaib = (ImageButton)findViewById(R.id.ibzohaib);

        ahmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csiv.this, "YOU VOTED AHMED", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("CSI/AHMED/").updateChildren(data);
                Intent ahm=new Intent(csiv.this,thanks.class);
                startActivity(ahm);
                finish();
                System.exit(1);
            }
        });

        amir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csiv.this, "YOU VOTED AAMIR", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("CSI/AMIR").updateChildren(data);
                Intent am=new Intent(csiv.this,thanks.class);
                startActivity(am);
                finish();
                System.exit(1);
            }
        });

        ali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csiv.this, "YOU VOTED ALI", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("CSI/ALI").updateChildren(data);
                Intent al=new Intent(csiv.this,thanks.class);
                startActivity(al);
                finish();
                System.exit(1);
            }
        });

        zohaib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(csiv.this, "YOU VOTED ZOHAIB", Toast.LENGTH_SHORT).show();
                Map<String, Object> data = new HashMap<String, Object>();
                data.put(rollno,"p");
                database.child("CSI/ZOHAIB").updateChildren(data);
                Intent zo=new Intent(csiv.this,thanks.class);
                startActivity(zo);
                finish();
                System.exit(1);
            }
        });
    }
}
