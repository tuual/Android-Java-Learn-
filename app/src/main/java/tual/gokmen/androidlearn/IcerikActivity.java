package tual.gokmen.androidlearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IcerikActivity extends AppCompatActivity {
    RecyclerView.LayoutManager layoutManager;
    List<CardModel> list;
    RecyclerView recyclerView;
    CardAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icerik);
        tanimla();
        loadCards();
    }

    public void tanimla() {
        recyclerView = (RecyclerView) findViewById(R.id.RecylerView1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void loadCards() {
        list = new ArrayList<>();

        //add Items
        CardModel c1 = new CardModel(
                "1.1 Temel Bileşenler"
                ,"1.1");
        CardModel c2 = new CardModel(
                "1.1.1. Java Software Development Kit (JDK) Kurulumu"
                ,"1.1.1");
        CardModel c3 = new CardModel(
                "1.1.2. Android Studio ve Software Development Kit (SDK) Kurulumu"
                ,"1.1.2");
        CardModel c4 = new CardModel(
                "1.2. EMÜLATÖR KURULUMU"
                ,"1.2");

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        adp = new CardAdapter(this, list);
        recyclerView.setAdapter(adp);

    }




}