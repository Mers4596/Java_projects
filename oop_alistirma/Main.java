package oop_alistirma;

public class Main {

    public static void main(String[] args)
    {
        Ogrenci ogrenci1 = new Ogrenci("Niğde Ömer Halisdemir Üniversitesi"); // Consturctor --> Yapıcı Method
        Ogrenci ogrenci2 = new Ogrenci(); // Boş Consturctor
        Ogrenci ogrenci3 = new Ogrenci("Mehmet", "Ersolak", 230610015, "Erciyes Üniversitesi");


        ogrenci1.bilgiGoster();
        ogrenci2.bilgiGoster();
        ogrenci3.bilgiGoster();
        

    }


    
    

}
