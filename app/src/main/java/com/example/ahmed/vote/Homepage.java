package com.example.ahmed.vote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;

public class Homepage extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                        sleep(3000);
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

