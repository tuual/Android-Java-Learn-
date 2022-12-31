package tual.gokmen.androidlearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        ClickEvents();


    }
    void tanimla(){
        layout1 = (LinearLayout) findViewById(R.id.MainLayout1);


    }
    public void ClickEvents(){
        Intent intent = new Intent(this,IcerikActivity.class);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}