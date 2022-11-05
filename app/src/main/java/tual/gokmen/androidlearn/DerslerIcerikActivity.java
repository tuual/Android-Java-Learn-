package tual.gokmen.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DerslerIcerikActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dersler_icerik);

        tanimla();
        tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.background,0,0,0);
    }
    public void tanimla(){
        tv = findViewById(R.id.textView);
    }
}