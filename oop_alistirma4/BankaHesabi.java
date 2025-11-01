package oop_alistirma4;

public class BankaHesabi {
    String hesapAdi;
    double bakiye;

    public BankaHesabi(String hesapAdi, double bakiye)
    {
        this.hesapAdi = hesapAdi;
        this.bakiye = bakiye;
    }

    public void bilgiGoster()
    {
        System.out.println("Hesap Adi: "+ this.hesapAdi + "Güncel Bakiye: " + this.bakiye);
    }

    public void paraCek(double miktar)
    {
        if(bakiye <= 0)
        {
            System.out.println("İsleminiz Başarisiz Çekmek İstediğiniz Miktar Mevcut Değil.");
        }
        else
        {
            this.bakiye -= miktar;
            System.out.println(this.hesapAdi + " Adli Kullanicinin Hesabindan " + miktar + " Kadar Bakiye Başaririi Bir Şekilde Çekilmiştir.");

        }
    }

    public void paraYatirma(double miktar)
    {
        if(miktar > 0)
        {
            this.bakiye += miktar;
            System.out.println(this.hesapAdi + " Adli Kullanicinin Hesabina " + miktar + " Kadar Bakiye Başaririi Bir Şekilde Yatirilmiştir");
        }
        else
        {
            System.out.println("İşleminiz Gerçekleştirilmiyor Lütfen Tekrar Tuşlama Yapiniz.");
        }
    }

    public void paraTransfer(BankaHesabi hedefHesap, double transfer_miktari)
    {
        System.out.println("TRANSFER İŞLEMLERİ BAŞLADI");
        if(transfer_miktari > 0 && this.bakiye >= transfer_miktari)
        {
            this.paraCek(transfer_miktari);
            hedefHesap.paraYatirma(transfer_miktari);
            System.out.println(this.hesapAdi + "Adli Kişiden " + hedefHesap.hesapAdi + " Adli Kişiye " + transfer_miktari + " Kadar Para Gönderilmiştir.");
        }
        else
        {
            System.out.println("Transfer Başarisiz Oldu");
        }
        System.out.println("TRANSFER İŞLEMLERİ BİTTİ");

    }


}
