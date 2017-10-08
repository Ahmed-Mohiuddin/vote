package com.example.ahmed.vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class thanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(4000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent i=new Intent(getApplicationContext(),loginpage.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
