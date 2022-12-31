package tual.gokmen.androidlearn;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class IcerikActivity extends AppCompatActivity{
    private RecyclerView.LayoutManager layoutManager;
    List<CardModel> list;
    private RecyclerView recyclerView;
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
                 "mobil işletim sistemi kullanılan cihazlar denildiğinde ilk akla gelenler şunlardır:\n" +"\n"+"\n"+
                 "• Akıllı telefonlar\n"+
                 "• Tabletler\n"+
                 "• E-kitap okuyucu\n"+
                 "• Akıllı televizyonlar\n" +
                 "• Otomobiller\n" +
                 "• Akıllı saatler\n" +  "\n"+  "\n"+
                 "Taşınabilir cihazlarda yaygın olarak kullanılan işletim sistemleri Android ve IOS’tur. Mobil uygula\u0002ma geliştirilirken tercih edilebilecek yöntemler şunlardır:\n" +  "\n"+
                 "• Native (Yerel) Uygulama: Belirli bir işletim sistemi veya cihaz için geliştirilen uygulama\u0002lardır. Bu uygulamalar, yazılımın tasarlandığı işletim sistemi ve cihazda çalışır, farklı işletim \n" +  "\n"+
                 "sistemi ve cihazda çalışmaz.\n" +
                 "• Cross Platform (Çapraz Platform) Uygulama: Birden fazla işletim sistemi veya cihazda ça\u0002lışabilecek şekilde geliştirilen uygulamalardır.\n" +  "\n"+
                 "Android işletim sistemi, Linux çekirdeğini kullanır ve açık kaynak kodludur. Bu işletim sistemi; \n" +
                 "taşınabilir cihazlarda, akıllı televizyonlarda ve oyun konsollarında yaygın kullanımı nedeniyle Java \n" +
                 "programlama diliyle birlikte tercih edilir.\n" +  "\n"+
                 "Android işletim sisteminde Java programlama diliyle mobil uygulama geliştirmek için Java \n" +  "\n"+
                 "Software Development Kit ve Android Studio + SDK olmak üzere iki temel programın bilgisayara \n"+
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
       list.add(new CardModel(
                "Android Studio ve Software Development Kit (SDK) Kurulumu"
                ,"1.1.2","JDK kurulumu tamamlandıktan sonra Java diliyle mobil uygulama geliştirme ortamı olarak And\u0002roid Studio programının kurulması gerekir. Android Studio programının güncel sürümünü htt\u0002ps://developer.android.com/studio web adresinden indirmek mümkündür" + "\n" + "\n" +
               "Android Studio indirme sayfasındaki Download Android Studio düğmesine tıklanır. Yeni gelen \n" +
               "pencerede kullanıcı sözleşmesinin kabul edildiğini ifade eden onay kutusu işaretlendikten sonra \n" +
               "Download Android Studio… düğmesi tıklanarak indirme başlatılır" + "\n" +"\n" +
               "Android Studio kurulum dosyasının indirme işlemi bittikten sonra dosya çalıştırılır. Kurulum dos\u0002yalarının doğruluğu kontrol edilir ve gelen karşılama penceresinde Next düğmesine tıklanarak \n" +
               "kurulum devam ettirilir" +"\n" +"\n" +
               "Kurulumun bir sonraki aşamasında hangi bileşenlerin kurulacağının seçilebileceği onay kutuları\u0002nın bulunduğu pencere gelir. Bu pencerede Android Studio onay kutusu zorunlu olarak seçilidir \n" +
               "ve işaret değiştirilemez ancak Android Virtual Device (Android Sanal Cihaz) isimli ikinci bileşenin \n" +
               "kurulumu isteğe bağlıdır. Bu aşamada her iki onay kutusu da işaretliyken Next düğmesine tıklanır " +"\n" +"\n" +
               "Bir sonraki aşamada ise Android Studio programının kurulacağı dizin ile ilgili bilgilerin girilebile\u0002ceği bir pencere gelir. Bu penceredeki dizin bilgileri zorunlu hâller dışında değiştirilmemelidir. \n" +
               "Next düğmesine tıklanarak bir sonraki aşamaya geçilir" +"\n" +"\n" +
               "Kullanıcı, bu aşamada Android Studio kısayollarının hangi klasörde oluşturulacağını veya yeni bir \n" +
               "isim belirleyerek oluşan klasörde kısayolların yer almasını sağlayabilir. Pencerenin altındaki Do \n" +
               "not create shortcuts (Kısayol oluşturma) onay kutusu işaretlenerek kısayol oluşturulmaması da \n" +
               "seçilebilir. Bu pencerede Install (Yükle) düğmesi tıklanarak kurulum başlatılır" +"\n" +"\n" +
               "Kurulum başlatıldıktan sonra gelen pencerede kurulumun ne kadarının tamamlandığını ifade \n" +
               "eden yeşil renkli yükleme çubuğu ve ayrıntıların gözlemlenebileceği Show details (Ayrıntıları \n" +
               "göster) düğmesi yer alır. Kurulum işlemi bitince yeşil renkli yükleme çubuğunun üzerinde Comp\u0002leted (Tamamlandı) yazısı belirir. Next düğmesine tıklanır" +
               "" +"\n" +"\n" +
               "Gelen son pencerede Android Studio programının kurulumunun bittiğini ifade eden bilgi ve Fi\u0002nish (Bitir) düğmesine tıklandıktan sonra programın başlatılmasını sağlayan Start Android Studio \n" +
               "(Android Studio Başlat) onay kutusu yer alır. Bu onay kutusu işaretli olarak gelir. Finish düğmesi\u0002ne tıklandıktan sonra Android Studio başlatılmayacaksa bu onay kutusundaki işaret kaldırılır. \n" +
               "Android Studio başlatılacaksa onay kutusundaki işaret kaldırılmadan Finish düğmesine tıklanarak \n" +
               "kurulum sonlandırılır "));
         list.add(new CardModel(
                 "EMÜLATÖR KURULUMU"
                ,"1.2","Farklı işletim sistemine ait programları yerel işletim sisteminde çalıştırmak için aracı yazılımlara \n" +
                 "ihtiyaç duyulur. Bu aracı yazılımlara emülatör ismi verilir. Android Studio içinde mobil işletim \n" +
                 "sistemine uygun emülatör programı kurulabilir. Geliştirilen uygulamalar bu emülatörde test edi\u0002lebilir.\n" +  "\n" +
                 "Kurulumdan sonra Android Studio çalıştırıldığında karşılama ekranında More Actions (Ek Eylem\u0002ler) listesindeki Virtual Device Manager (Sanal Cihaz Yöneticisi) seçeneği tıklanır" +"\n" +"\n" +
                 "Açılan Device Manager (Cihaz Yöneticisi) penceresindeki Create device (Cihaz oluştur) düğme\u0002sine tıklanır \n \n" +
                 "Select Hardware (Donanım Seç) penceresi açılır. Bu pencerede Category (Kategori) kısmında TV, \n" +
                 "Phone (Cep telefonu), Wear OS (Giyilebilir cihazlar), Tablet ve Automotive (Otomotiv tabletleri) \n" +
                 "yer alır. Uygulamanın çalıştırılacağı cihaz hangi kategorideyse o kategori seçilerek uygun ekran \n" +
                 "büyüklüğü ve çözünürlük belirlenir. 480 piksel genişliğinde, 854 piksel uzunluğun\u0002da ve 5.4 inch ekran büyüklüğüne sahip bir cep telefonu cihazı seçilmiştir. İhtiyaç duyulması hâlinde New Hardware Profile (Yeni Donanım Profili) düğmesiyle boyut ve çözünürlüğünü kullanı\u0002cının ayarlayabileceği bir cihaz oluşturulabilir. Import Hardware Profiles (Donanım Profili İçe " +
                 "Aktar) düğmesiyle daha önceden dosyaya kaydedilmiş bir donanım profili yüklenebilir. Clone \n" +
                 "Device (Cihazı Kopyala) düğmesi kullanılarak da belirli bir cihazın özellikleri kopyalanır. Kopyala\u0002nan cihazın birkaç özelliğinde değişiklik yapılabilir. Next düğmesi tıklanarak bir sonraki pencereye geçilir.\n \n" +

                 "Select a system image (Sistem imajı seçimi) penceresinde emülatör cihazına bir işletim siste\u0002mi seçilir. Pencerenin üstünde Recommended (Tavsiye edilen), x86 Images (x86 İşlemciler için \n" +
                 "imajlar) ve Other Images (Diğer imajlar) olmak üzere üç adet sekme yer alır\n\n" +
                 "• Recommended: Bu sekme seçiliyken en hızlı çalışacak işletim sistemi imajı kullanıcıya gö\u0002rüntülenir.\n\n" +
                 "• x86 Images: x86 işlemcilerde çalışacak işletim sistemi imajları görüntülenir. 32 bitlik iş\u0002lemciler için listede x86 olarak belirtilmişken 64 bitlik işlemciler için x86_64 olarak işletim \n" +
                 "sistemleri belirtilmiştir.\n\n" +
                 "• Other Images: Diğer işlemcilerde çalışacak işletim sistemi imajları görüntülenir\n\n\n" +
                 "UYARI: Her Android işletim sistemi sürümü için tek bir API düzeyi belirlenmiştir. Application Program\u0002ming Interface (Uygulama Programlama Arayüzü) kelimelerinin baş harfleriyle API isimlendirilmesi \n" +
                 "yapılır. API, yazılımların kendi aralarında iletişim kurmasını sağlayan bir yapıdır. API düzeyi düştükçe \n" +
                 "yazılan uygulamanın çalışacağı cihaz sayısı artar ancak uygulamada kullanılacak özellikler azalır. API \n" +
                 "düzeyi yükseldikçe uygulamada kullanılacak özellikler artar ancak kapsadığı cihaz sayısı azalır.\n\n" +
                 "Recommended sekmesindeki Android işletim sistemlerinin isimlerinin hemen yanında Download \n" +
                 "düğmesi yer alır. Bu düğmeyle o işletim sisteminin imajı indirilir ve işletim sistemi seçime hazır \n" +
                 "hâle getirilir. Penceresinde Marshmallow (Android 6.0) işletim sistemi indirilmiş ve \n" +
                 "seçime hazır hâle getirilmiştir. Bu sürüm seçilir ve Next düğmesine tıklanır.\n" +
                 "Kurulumun son penceresinde oluşturulan ayarların doğruluğu kontrol edilebilir ve bu pencere\u0002den ayarlar değiştirilebilir \n\n" +
                 "• AVD Name (AVD İsmi): Ayarlanan cihazın ismi bu kutuya yeni değer girilerek değiştirilebilir.\n\n" +
                 "• 5.4” FWVGA 5.4 480x854 mdpi: Bu yazının sağ tarafında yer alan Change… (Değiştir) düğ\u0002mesi ile ekran boyutları farklı bir cihaz seçilebilir.\n\n" +
                 "• Marshmallow Android 6.0 x86: Bu yazının sağ tarafında yer alan Change… düğmesi ile \n" +
                 "seçilen işletim sistemi değiştirilebilir.\n\n" +
                 "" +
                 "• Startup Orientation (Başlangıç Yönlendirmesi): Bu bölümde yar alan iki farklı Portrait \n" +
                 "(Portre) ve Landscape (Manzara) simgelerinden biri seçilerek cihazın dikey ve yatay kul\u0002lanılacağı belirlenebilir. Dikey kullanım için Portrait simgesi seçilir, yatay kullanım içinse \n" +
                 "Landscape simgesi seçilir. \n\n" +
                 "• Emulated Performance (Emülasyon Performansı): Bu yazının sağ tarafındaki Graphics: \n" +
                 "(Grafikler) açılır kutusunda üç seçenek yer alır. Automatic (Otomatik), Hardware (Do\u0002nanım) ve Software (Yazılım) isimli seçeneklerden bilgisayarın grafik kartı kullanılacaksa \n" +
                 "emülasyon için Hardware seçilir. Grafik kartıyla problemler yaşanırsa ve grafik kartı yerine \n" +
                 "yazılım kullanılacaksa emülasyon için Software seçilir. Emülasyonun duruma göre otomatik \n" +
                 "olması istenirse Automatic seçilebilir.\n\n" +
                 "• Device Frame (Cihaz Çerçevesi): Bu onay kutusu işaretlenerek sanal cihazın kenarında çe\u0002şitli işlev düğmeleri kullanılabilir hâle getirilir. Bu düğmeler istenmezse bu onay kutusu \n" +
                 "işaretlenmez.\n\n" +
                 "• Show Advanced Settings (Gelişmiş Ayarları Göster): Sanal cihazla ilgili ayrıntılı ayarlar ya\u0002pılması gerektiğinde bu düğme tıklanır. Bu düğme tıklandıktan sonra cihaz ön ve arka ka\u0002mera ayarları, ana bellek miktarı, yardımcı depolama bellek miktarı, SD kart bellek miktarı, \n" +
                 "cihazın işlemci sayısı gibi ayrıntılı ayarların belirlenebileceği kutular pencerede belirir. " +
                 "!\n\n" +
                 "" +
                 "Finish düğmesine tıklandıktan sonra pencerenin ortasında Creating Android Virtual Device \n" +
                 "(Android Sanal Cihaz Oluşturuluyor) ifadesi görüntülenir\n\n" +
                 "Sanal cihaz oluşturulduktan sonra pencerenin en üstünde bilgiler ve simgeler \n" +
                 "görünür.\n\n" +
                 "" +
                 "Bu bilgilerde sanal cihazın ismi, sanal cihazda yüklü olan işletim sistemi, API düzeyi, yardımcı \n" +
                 "depolama biriminde kapladığı alan ve Actions (Eylemler) simgeleri yer alır. Bu simgeler şunlardır:\n\n" +
                 "" +
                 "Launch this AVD in the emulator (Bu Android Sanal Cihazı emülatörde çalıştır): Bu simge \n" +
                 "tıklanarak sanal cihaz çalıştırılır.\n\n" +
                 "Edit this AVD (Bu Android Sanal Cihazı düzenle): Sanal cihazla ilgili değişiklik yapılması ge\u0002rekirse bu simge tıklanır.\n" +
                 "Bu simge tıklandığında açılır bir menü ile karşılaşılır. Bu menüdeki seçenekler \n" +
                 "şunlardır: \n\n" +
                 "" +
                 "• Duplicate (Çoğaltma): Sanal cihazın özelliklerine sahip \n" +
                 "ikinci bir kopya oluşturmak için kullanılır.\n\n" +
                 "• Wipe Data (Verileri Sil): Sanal cihazı fabrika ayarlarına \n" +
                 "döndürmek için kullanılır. Sonradan düzenlenen verileri \n" +
                 "siler ve cihazı ilk açılış durumuna getirir.\n\n" +
                 "• Cold Boot Now (Soğuk Önyükleme Şimdi): Sanal ciha\u0002zın herhangi bir kaydedilmiş durumdan değil, en baştan \n" +
                 "açılmasını sağlar.\n\n" +
                 "• Show on Disk (Disk Üzerinde Göster): Sanal cihazın dos\u0002yalarını bulunduğu klasörde gösterir.\n\n" +
                 "• Delete (Sil): Sanal cihazın silinmesini sağlar.\n\n" +
                 "" +
                 "Emülatörde sanal cihazı başlatmak için oynatma simgesine tıklanır. Her şey doğru ayarlandıysa Android \n" +
                 "işletim sistemi yüklü bir cep telefonu cihaz penceresi ekranda belirir"));
        list.add(new CardModel(
                " TASARIM YAPILARI (ACTIVITY TEMPLATES) \n"
                ,"1.3","Emülatör kurulumu tamamlanıp pencereler kapatıldıktan sonra Android Studio karşılama ekranı\u0002na tekrar dönülür.\n\n" +
                "" +
                "Bu ekrandaki simgeler şunlardır: \n\n" +
                "• New Project (Yeni Proje): En baştan yeni bir proje oluşturulacaksa bu simge tıklanır.\n\n" +
                "• Open (Aç): Daha önce yerel sürücüye proje kaydedildiyse projeyi açmak için kullanılır.\n\n" +
                "• Get from VCS (Sürüm Kontrol Sistemlerinden Yükle): Git, GitHub gibi sitelerde proje geliş\u0002tirilirse buradan proje yüklenebilir.\n\n" +
                "New Project simgesi tıklandıktan sonra Templates (Şablonlar) bölümünden Phone and Tablet \n\n" +
                "seçilir. Uygulamaya Activity Templates (Tasarım Yapıları) eklenebilen seçim penceresi gelir.\n\n" +
                "Bu pencerede uygulama geliştirilecek cihaza göre Phone and Tablet (Telefon ve Tablet), Wear Os \n\n" +
                "(Giyilebilir Cihaz), Android TV (Akıllı Televizyon) ve Automotive (Otomotiv) olarak kategorilere \n" +
                "ayrılmış Activity Templates yer alır.\n\n" +
                "Uygulama geliştirilmek istenen cihaz olarak Phone and Tablet seçilir ve hazır activitylerden Emp\u0002ty Activity (Boş Activity) şablonu seçilir. Next düğmesine basılarak işleme devam edilir"));

        list.add(new CardModel(
                "Activity","1.3.1",
                "Activity, bir Android uygulamasında kullanıcıya gösterilen ve üzerinde kullanıcı arayüz bileşenleri \n" +
                        "(düğmeler, onay kutuları, radyo düğmeleri vb.) yer alan ekran olarak tanımlanabilir. Activity, işle\u0002tim sistemlerinde bulunan pencerelerle benzerlikler taşır. Bir Android uygulaması bir veya daha \n" +
                        "fazla activity içerebilir. Bu durum, uygulamanın bir veya daha fazla ekrana sahip olması anlamına \n" +
                        "gelir. Android uygulaması geliştirilirken bir activity seçilip projeye dâhil edilir çünkü Android uy\u0002gulamaları kullanıcıya göstermek için bir veya daha fazla kullanıcı arayüz bileşeni içerir. Kullanıcı, \n" +
                        "bu bileşenler sayesinde uygulama ile etkileşime girer."));

        list.add(new CardModel(
                "Activity Çeşitleri","1.3.2",
                "Yeni bir proje oluşturulurken hazır activitylerden biri seçilmelidir. Hazır activitylerden bazıları \n" +
                        "şunlardır:\n\n" +
                        "" +
                        "• No Activity (Activity Yok): Yeni bir boş proje oluşturmak anlamına gelir. Bu activity se\u0002çildiğinde ne bir XML dosyası ne de bir Java dosyası oluşturulur. Hiçbir dosya otomatik \n" +
                        "oluşturulmaz.\n\n" +
                        "• Basic Activity (Temel Activity): Temel activity seçildiğinde mobil uygulamada bir menü düğmesi ve kayan bir eylem düğmesi bulunur. Temel activity dosyaları otomatik olarak \n" +
                        "oluşturulur\n\n" +
                        "" +
                        "• Bottom Navigation Activity (Alt Gezinme Activity): Alt gezinme activity seçildiğinde mobil \n" +
                        "uygulamanın alt tarafında üç adet düğme oluşur. Bu düğmelere çoğu sosyal medya uygula\u0002masında yer alan işlevler verilebilir. Bu activity içinde dosyalar otomatik oluşturulur.\n\n" +
                        "• Empty Activity (Boş Activity): En çok kullanılan activitydir. Mobil uygulama geliştirilirken \n" +
                        "bu activity sık sık seçilir ve yeni bir boş activity oluşturulur.\n\n" +
                        "• Fullscreen Activity (Tam Ekran Activity): Genellikle tam ekran çalışması gereken mobil \n" +
                        "uygulamalarda kullanılır. Sistem kullanıcı arabiriminin ve eylem çubuğunun görünürlüğünü \n" +
                        "değiştirir. Birçok uygulama slayt göstermek, video göstermek vb. için ekranın tamamını \n" +
                        "kullanır. Bu activity için uygun dosyalar otomatik olarak oluşturulur.\n\n" +
                        "• Login Activity (Giriş Activity): Oturum açma mobil uygulaması geliştirmek için kullanılan \n" +
                        "activitydir. E-posta ve şifre girmek için alanlar ile bu alanları onaylamak için düğme bileşen\u0002leri ekranda yer alır. Bu activity için uygun dosyalar otomatik olarak oluşturulur."));
        list.add(new CardModel(
                "Activity","1.3.1",
                " "  ));
        list.add(new CardModel(
                "Activity","1.3.1",
                ""));



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