package com.zalocoders.fashionapp.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.zalocoders.fashionapp.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoLauncher launcher = new logoLauncher();
        launcher.start();
    }


    class logoLauncher extends Thread{

        @Override
        public void run() {
            try{
                sleep(1000);

            }
            catch (Exception e){
                e.printStackTrace();
            }

            Intent main = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(main);
            SplashScreen.this.finish();



        }
    }

}
