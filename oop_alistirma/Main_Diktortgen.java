package oop_alistirma;

import java.util.Scanner;

public class Main_Diktortgen {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Diktortgen diktortgen = new Diktortgen();
        
        System.out.println("Kisa kenar uzunluğunu: ");
        diktortgen.kisaKenar = input.nextInt();

        System.out.println("Uzun kenar uzunluğunu: ");
        diktortgen.uzunKenar= input.nextInt();

        diktortgen.alanHesapla();
        diktortgen.cevreHesapla();

        input.close();


    }

}
