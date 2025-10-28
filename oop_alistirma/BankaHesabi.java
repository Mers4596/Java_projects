package oop_alistirma;

public class BankaHesabi {
    private String hesapSahibi;
    private double bakiye;

    public BankaHesabi(String sahip, double ilkBakiye) {
        hesapSahibi = sahip;
        if (ilkBakiye > 0) 
        {
            bakiye = ilkBakiye;
        } 
        else 
        {
            bakiye = 0;
        }
    }


       public double getBakiye()
       {
        return bakiye;
       }
       public String getHesapSahibi()
       {
        return hesapSahibi;
       }



    public void paraCek(int tutar){
        if(bakiye == 0)
        {
            System.out.println("Banka hesabinizda yeterli bakiye yok: ");
        }
        else
        {
            if(bakiye < tutar){
                System.out.println("Banka hesabinizde yeterli para yok" + bakiye);
            }
        }
    }

    public void paraYatir(int tutar)
    {
        bakiye += tutar;
        System.out.println("Bakiyeniz Güncellendi "+ tutar + "Kadar miktar para banka hesabınıza eklenmiştir.");
    }

    public void bilgiGoster(){
        System.out.println("Hesap sahibinin adi: "+ hesapSahibi);
        System.out.println("Güncel bakiyeniz: "+ bakiye);
    }


    

}
