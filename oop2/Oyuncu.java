package oop2;

public class Oyuncu {
    String karakter_adi;
    int enerji_seviyesi = 100;
    int giden_enerji =5;
    int gelen_enerji = 5;
    int verilen_hasar;
    int alinan_hasar;
    int saglik_seviyesi = 100;
    
    public void dinlenme(int dinlenme_suresi){
        if(enerji_seviyesi == 100){
            System.out.println("Karakterin Enerji Seviyesi Tam Saldirmaya Baslaaaa lannnnnn");

        }
        else{
            enerji_seviyesi = enerji_seviyesi + (gelen_enerji * dinlenme_suresi);
            System.out.println("kalan enerji-> " + enerji_seviyesi);
            if(enerji_seviyesi == 100){
                System.out.println("Yeteri Kadar Dinlendi");
            }

        }

    }

    public void saldiri(int yapilan_saldiri_miktari){
        if(enerji_seviyesi==0)
        {
            System.out.println("Karakterin dinlenmesi lazim.");
            
        }
        else
        {
            enerji_seviyesi = enerji_seviyesi - (giden_enerji * yapilan_saldiri_miktari);
            System.out.println("kalan enerji-> " + enerji_seviyesi);
            if(enerji_seviyesi == 0){
                System.out.println("Karakter cok saldiri yapti. Hemen Dinlen..");
            }
        }
    }

    public void bilgiGoster(){
        System.out.println("Karakter Adi: " + karakter_adi );
        System.out.println("Enerji Seviyesi: " + enerji_seviyesi);
        System.out.println("Saglik Seviyesi: " + saglik_seviyesi);

    }


}
