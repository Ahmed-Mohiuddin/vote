package com.example.ahmed.vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioGroup;

public class signupage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupage);
        final EditText  rollno;
        final Button submit;
        final EditText pass;
        final EditText pswr;

        rollno= (EditText) findViewById(R.id.editText3);
        submit= (Button) findViewById(R.id.button2);
        pass= (EditText) findViewById(R.id.editText4);
        pswr= (EditText) findViewById(R.id.editText5);

        submit.setOnClickListener(new View.OnClickListener() {



            public void onClick(View view) {
                String roll = rollno.getText().toString();
                String[] data=roll.split("-");
                if (data[0].length()==4 && data[1].length()==2 && data[2].length()==3 && data[3].length()==3)
                {
                    Toast.makeText(signupage.this,"Roll no is valid",Toast.LENGTH_LONG).show();
                    if( pass.getText().toString().length()<8)
                    {
                        pass.setError("Must be more than 8 characters");
                    } else {
                        if (! pass.getText().toString().equals(pswr.getText().toString()))
                        {
                            pswr.setError("password doest not match");
                        }
                        else
                        {
                            Toast.makeText(signupage.this,"password matched",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(signupage.this, loginpage.class);
                            startActivity(intent);
                        }
                    }
                }
                else
                {
                    Toast.makeText(signupage.this, "Invalid rollno", Toast.LENGTH_SHORT).show();
                    rollno.setError("Invalid Rollno");
                }
            }
        });

    }



}
