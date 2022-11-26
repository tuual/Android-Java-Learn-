package tual.gokmen.androidlearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class IcerikActivity extends AppCompatActivity{
    RecyclerView.LayoutManager layoutManager;
    List<CardModel> list;
    RecyclerView recyclerView;
    CardAdapter adp;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icerik);
        tanimla();
        loadCards();
        setSearchView();
    }

    public void tanimla() {
        searchView = findViewById(R.id.searchView1);
        searchView.clearFocus();
        recyclerView = (RecyclerView) findViewById(R.id.RecylerView1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    private void loadCards() {
        list = new ArrayList<>();

        //add Items
         list.add(new CardModel(
                "Temel Bileşenler"
                ,"1.1","Mobil uygulama kavramı, taşınabilir cihazlar için kodlanmış yazılımlardır. Taşınabilir cihazlar veya \n" +
                 "mobil işletim sistemi kullanılan cihazlar denildiğinde ilk akla gelenler şunlardır:\n\n\n" +
                 "• Akıllı telefonlar\n\n" +
                 "• Tabletler\n\n" +
                 "• E-kitap okuyucu\n\n" +
                 "• Akıllı televizyonlar\n\n" +
                 "• Otomobiller\n\n" +
                 "• Akıllı saatler\n\n\n" +
                 "Taşınabilir cihazlarda yaygın olarak kullanılan işletim sistemleri Android ve IOS’tur. Mobil uygula\u0002ma geliştirilirken tercih edilebilecek yöntemler şunlardır:\n\n" +
                 "• Native (Yerel) Uygulama: Belirli bir işletim sistemi veya cihaz için geliştirilen uygulama\u0002lardır. Bu uygulamalar, yazılımın tasarlandığı işletim sistemi ve cihazda çalışır, farklı işletim \n" +
                 "sistemi ve cihazda çalışmaz.\n\n" +
                 "•\b Cross Platform (Çapraz Platform) Uygulama: Birden fazla işletim sistemi veya cihazda ça\u0002lışabilecek şekilde geliştirilen uygulamalardır.\n\n" +
                 "Android işletim sistemi, Linux çekirdeğini kullanır ve açık kaynak kodludur. Bu işletim sistemi; \n" +
                 "taşınabilir cihazlarda, akıllı televizyonlarda ve oyun konsollarında yaygın kullanımı nedeniyle Java \n" +
                 "programlama diliyle birlikte tercih edilir.\n\n" +
                 "Android işletim sisteminde Java programlama diliyle mobil uygulama geliştirmek için Java \n" +
                 "Software Development Kit ve Android Studio + SDK olmak üzere iki temel programın bilgisayara \n" +
                 "kurulması gerekir"));
        list.add(new CardModel(
                "Java Software Development Kit (JDK) Kurulumu"
                ,"1.1.1","Java Runtime Environment (JRE) ve Java Software Development Kit (JDK) olmak üzere iki farklı \n" +
                "Java paketi vardır. JRE, Java programlama dilinde yazılmış programları çalıştırmak için kullanılır\u0002ken JDK ise yazılımcıların Java programları geliştirmesinde kullanılır. \n\n" +
                "Herhangi bir web tarayıcının adres çubuğunda\n https://www.oracle.com/java/technologies/" +
                "downloads/ \n adresine gidildiğinde en güncel JDK sürümüne ulaşılır ve kurulum programı bilgisa\u0002yara indirilir\n\n"+
                "işletim sistemine uygun JDK kurulum dosyası seçildikten sonra indirme bağlantısı tıklanır\n\n"+
                 "Dosya indirildikten sonra dosyanın üzerine tıklanarak çalıştırılır. JDK kurulum dosyası çalıştırılınca \n" +
                "ilk olarak bir karşılama penceresi gelir. Bu pencerede kullanıcıya kurulum boyunca rehberlik ya\u0002pılacağına dair bir bilgi verilir. Bu pencere Next (İleri) düğmesine tıklanarak geçilir\n\n"));
      /*  list.add(new CardModel(
                "Android Studio ve Software Development Kit (SDK) Kurulumu"
                ,"1.1.2"));
         list.add(new CardModel(
                 "EMÜLATÖR KURULUMU"
                ,"1.2"));
        list.add(new CardModel(
                "EMÜLATÖR KURULUMU"
                ,"1.2"));*/






        adp = new CardAdapter(this, list);
        recyclerView.setAdapter(adp);

    }

    public void setSearchView(){
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                filterList(newText);
                return true;
            }
        });
    }

    private void filterList(String text) {
        List<CardModel> filteredList = new ArrayList<>();
        for (CardModel cardModel : list){
            if (cardModel.getBaslik().toLowerCase().contains(text.toLowerCase()) ||
                    cardModel.getNumara().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(cardModel);

            }
        }
        if (filteredList.isEmpty())
        {
            Toast.makeText(this, "Sonuç Bulunamadı", Toast.LENGTH_SHORT).show();
        }
        else {
            adp.setFilteredList(filteredList);
        }
    }



}