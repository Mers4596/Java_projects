package oop_alistirma3;

public class Kitap_Yazar_Main {
    public static void main(String[] args)
    {
        Yazar yazar1 = new Yazar("Mehmet", "ERSOLAK");
        Kitap kitap1 = new Kitap("Mehmet Ag", 38, yazar1);

        kitap1.kitapBilgisi();
    }

}
