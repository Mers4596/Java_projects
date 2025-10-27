package oop2;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Oyuncu karakter = new Oyuncu();

        Scanner input = new Scanner(System.in);
        System.out.println("Karakter Adinizi Giriniz: ");
        karakter.karakter_adi = input.nextLine();

        karakter.bilgiGoster();
        karakter.saldiri(10);
        karakter.bilgiGoster();

        karakter.dinlenme(5);
        karakter.bilgiGoster();


        input.close();
    }
    
}
