package tual.gokmen.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DerslerIcerik extends AppCompatActivity {


    TextView tvBaslik,tvAciklama;
    String baslik,aciklama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dersler_icerik);

        tanimla();
        Bundle bundle = getIntent().getExtras();
        baslik = bundle.getString("Baslik");
        aciklama = bundle.getString("Aciklama");

        tvBaslik.setText(baslik);
        tvAciklama.setText(aciklama);


    }
    public void tanimla(){
        tvBaslik = (TextView) findViewById(R.id.dBaslikTv);
        tvAciklama = (TextView) findViewById(R.id.dIcerikTv);
    }
}