package tual.gokmen.androidlearn;

public class CardModel {
    String baslik,numara;

    public CardModel(String baslik,String numara) {
        this.baslik = baslik;
        this.numara = numara;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
}
