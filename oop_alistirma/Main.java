package oop_alistirma;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci();

        Scanner input = new Scanner(System.in);

        System.out.println("İlk Ogrencinin Adini Giriniz: ");
        ogrenci1.ad = input.nextLine();
        System.out.println("İkinci Ogrencinin Adini Giriniz: ");
        ogrenci2.ad = input.nextLine();

     
        System.out.println("İlk Ogrencinin Soyadini Giriniz: ");
        ogrenci1.soyad = input.nextLine();
        System.out.println("İkinci Ogrencinin Soyadini Giriniz: ");
        ogrenci2.soyad = input.nextLine();
        

        System.out.println("İlk Ogrencinin Okul Numarasini Giriniz: ");
        ogrenci1.ogrenci_Numarasi = input.nextInt();
        System.out.println("İkinci Ogrencinin Okul Numarasini Giriniz: ");
        ogrenci2.ogrenci_Numarasi = input.nextInt();     
        
        ogrenci1.bilgiGoster();
        ogrenci2.bilgiGoster();
        
        input.close();
    }


    
    

}
