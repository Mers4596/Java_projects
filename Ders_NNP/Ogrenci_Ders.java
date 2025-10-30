package Ders_NNP;

public class Ogrenci_Ders {
    Ogrenci ogrenci;
    Ders ders;

    public void bilgiGoster(){
        System.out.println
        (
            "Ogrencinin Bilgileri: " + ogrenci
            + "Ders Bilgileri"+ ders        
        );

    }




    public Ogrenci_Ders(Ogrenci ogrenci, Ders ders){
        this.ogrenci = ogrenci;
        this.ders = ders;
    }
}
