package com.PureLink.Catalog.cluelin;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        Thread logoTimer = new Thread() {
            public void run() {
                try {

                    //1초 후에 Main으로 넘어감.
                    sleep(1000);
                    Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(mainIntent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    finish();
                }
            }

        };
        logoTimer.start();


    }

}
