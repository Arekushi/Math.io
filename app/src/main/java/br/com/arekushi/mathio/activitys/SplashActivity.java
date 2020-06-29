package br.com.arekushi.mathio.activitys;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import br.com.arekushi.mathio.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splash();
    }

    private void splash() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                showActivity();
            }
        };

        new Handler().postDelayed(run, 2000);
    }

    private void showActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}