package com.example.ahmed.vote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class loginpage  extends AppCompatActivity {
    EditText rollno;
    Button b1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        b1= (Button) findViewById(R.id.loginb);
        rollno= (EditText) findViewById(R.id.rollnos);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String roll = rollno.getText().toString();
                String[] data=roll.split("-");
                if (data[0].length()==4 && data[1].length()==2 && data[2].length()==3 && data[3].length()==3)
                {
                    Toast.makeText(loginpage.this,"Roll no is valid",Toast.LENGTH_LONG).show();
                    Intent j= new Intent(loginpage.this,chapters.class);
                    j.putExtra("rollno",roll);
                    startActivity(j);
                }
                else
                {
                    Toast.makeText(loginpage.this, "Invalid rollno", Toast.LENGTH_SHORT).show();
                    rollno.setError("Invalid Rollno");
                }
            }
        });
    }
}