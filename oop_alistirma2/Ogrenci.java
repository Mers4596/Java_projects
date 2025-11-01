package oop_alistirma2;

public class Ogrenci {

    int ogrNo;
    String ogrAd;
    String ogrSoyad;
    int yas;
    double ortalama;

    public Ogrenci(int ogrNo, String ogrAd, String ogrSoyad, int yas, double ortalama)
    {
        this.ogrNo = ogrNo;
        this.ogrAd = ogrAd;
        this.ogrSoyad = ogrSoyad;
        this.ortalama = ortalama;
        this.yas = yas;
    }
    public void bilgiGoster()
    {
        System.out.println("Ogrencinin Adi: "+ this.ogrAd + "\n"
                          + "Ogrencinin Soyadi: " + this.ogrSoyad + "\n"  
                          + "Ogrencinin Numarasi: " + this.ogrNo + "\n"
                          + "Ogrencinin Yasi: "+ this.yas + "\n"
                          + "Ogrencinin Guncel Ortalamasi: "+ this.ortalama);
    }

}
