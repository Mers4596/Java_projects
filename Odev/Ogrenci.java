package Odev;

public class Ogrenci {
    int ogrNo;
    String ogrAd;
    String ogrSoyad;
    int ogrYas;
    Kitap oduncKitap;

    public Ogrenci(int ogrNo, String ogrAd, String ogrSoyad, int ogrYas)
    {
        this.ogrNo = ogrNo;
        this.ogrAd = ogrAd;
        this.ogrSoyad = ogrSoyad;
        this.ogrYas = ogrYas;
    }

    public void kitapOduncAl(Kitap kitap) 
    {
        if (kitap.odunc) 
        {
            System.out.println("Üzgünüm, '" + kitap.kitapAdi + "' zaten başka biri tarafından ödünç alınmış.");
        } 
        else 
        {
            kitap.oduncAlindi();
            oduncKitap = kitap;
            System.out.println(ogrAd + " " + ogrSoyad + " adlı öğrenci kitabı aldı: " + kitap.kitapAdi);
        }
    }

    public void kitapIadeEt() 
    {
        if (oduncKitap == null) 
        {
            System.out.println(ogrAd + " " + ogrSoyad + " henüz kitap ödünç almamış.");
        } 
        else 
        {
            oduncKitap.iadeEdildi();
            System.out.println(ogrAd + " " + ogrSoyad + " kitabı iade etti: " + oduncKitap.kitapAdi);
            oduncKitap = null;
        }
    }

    public void ogrenciBilgisi() 
    {
        System.out.println("Öğrenci No: " + ogrNo);
        System.out.println("Ad Soyad: " + ogrAd + " " + ogrSoyad);
        System.out.println("Yaş: " + ogrYas);
        System.out.println("Ödünç Kitap: " + (oduncKitap != null ? oduncKitap.kitapAdi : "Yok"));
        System.out.println("-------------------------");
    }
}


