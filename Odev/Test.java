package Odev;

public class Test {

    public static void main(String[] args)
    {
        Kitap k1 = new Kitap("Ateşten Gömlek", "Halide Edip Adıvar", 450);
        Kitap k2 = new Kitap("Eylül", "Mehmet Rauf", 600);

        Ogrenci o1 = new Ogrenci(1001, "Mehmet", "Ersolak", 20);
        Ogrenci o2 = new Ogrenci(1002, "Büşra", "Aydın", 21);

        System.out.println("*-*-*-*- Kütüphane Otomasyon Sistemi -*-*-*-*");
        k1.kitapBilgisi();
        k2.kitapBilgisi();

        o1.kitapOduncAl(k1); 
        o2.kitapOduncAl(k1); 

        o1.ogrenciBilgisi();
        o2.ogrenciBilgisi();

        o1.kitapIadeEt(); 
        o2.kitapOduncAl(k1); 

        k1.kitapBilgisi();
        k2.kitapBilgisi();
    }

}
