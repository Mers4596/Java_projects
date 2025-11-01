package oop_alistirma3;

public class Kitap {
    String kitapAdi;
    int sayfaSayisi;
    Yazar yazar;

    public Kitap(String kitapAdi, int sayfaSayisi, Yazar yazar)
    {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
    }
    public void kitapBilgisi()
    {
        System.out.println("\n"+"Kitap Adi:" + kitapAdi 
                          +"\n"+"Kitabin Sayfa Sayisi: " + sayfaSayisi
                          +"\n"+"Yazarin Adi: "+ yazar.yazarAdi 
                          +"\n"+"Yazarin Soyadi: "+ yazar.yazarSoyadi);
    }

}
