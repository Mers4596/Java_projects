package Odev;

public class Kitap {
    String kitapAdi;
    String kitapYazari;
    int sayfaSayisi;
    boolean odunc;

    public Kitap(String kitapAdi,String kitapYazari,int sayfaSayisi)
    {
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.sayfaSayisi = sayfaSayisi;
        this.odunc = false;
    }
    public void oduncAlindi() 
    {
        if (odunc) 
        {
            System.out.println("Bu kitap zaten ödünç alınmış: " + kitapAdi);
        } 
        else 
        {
            odunc = true;
            System.out.println(kitapAdi + " adlı kitap ödünç alındı.");
        }
    }
    public void iadeEdildi() 
    {
        if (!odunc) 
        {
            System.out.println("Bu kitap zaten kütüphanede mevcut: " + kitapAdi);
        } 
        else 
        {
            odunc = false;
            System.out.println(kitapAdi + " adlı kitap iade edildi.");
        }
    }
    public void kitapBilgisi() 
    {
        System.out.println("Kitap Adı: " + kitapAdi);
        System.out.println("Yazarı: " + kitapYazari);
        System.out.println("Sayfa Sayısı: " + sayfaSayisi);
        System.out.println("Durum: " + (odunc ? "Ödünçte" : "Kütüphanede"));
    }
}




