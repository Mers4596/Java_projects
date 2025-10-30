package Ders_NNP;

public class mainDersOgr {

    public static void main(String[] args)
    {
        Ders ders = new Ders(2004, "Yapay Zeka Entegreli Dezenformasyon", 6, 101);
        Ogrenci ogrenci = new Ogrenci(230610015, "Mehmet", "ERSOLAK", "Kayseri / Melikgazi", 20);
        Ogrenci_Ders ogres = new Ogrenci_Ders(ogrenci, ders);
        ogres.bilgiGoster();
    }

}
