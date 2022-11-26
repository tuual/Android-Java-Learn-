package tual.gokmen.androidlearn;

public class CardModel {
    String baslik, numara,aciklama;

    public CardModel(String baslik, String numara,String aciklama) {
        this.baslik = baslik;
        this.numara = numara;
        this.aciklama = aciklama;

    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }



}
