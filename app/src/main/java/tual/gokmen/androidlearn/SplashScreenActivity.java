package tual.gokmen.androidlearn;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent intent = new Intent(getApplicationContext(),IcerikActivity.class);

        imageView = (ImageView) findViewById(R.id.splashlogo);
        Animation slideanimaton = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        imageView.startAnimation(slideanimaton);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);
                finish();
            }
        },2500);

    }
}