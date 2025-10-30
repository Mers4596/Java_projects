package oop_alistirma;


public class Ogrenci {
    String ad;
    String soyad;
    int ogrenci_Numarasi;
    String okulAdi;
    
    public Ogrenci(){

    }


    public Ogrenci(String okulAdi){
        this.okulAdi = okulAdi;

    }

    public Ogrenci(String ad, String soyad, int ogrenci_Numarasi, String okulAdi){
        this.ad = ad;
        this.soyad = soyad;
        this.ogrenci_Numarasi = ogrenci_Numarasi;
        this.okulAdi = okulAdi;
    }

    
    public void bilgiGoster()
    {
        System.out.println("Ogrenci Adi: "+ this.ad + "Ogrenci Soyadi: "+ this.soyad + "Ogrenci Numarasi: "+ this.ogrenci_Numarasi + "Ogrencinin Okudgu Okul: "+ this.okulAdi);
    }
    
}



