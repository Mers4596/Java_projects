package oop;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        Araba arac = new Araba();

        arac.hiz = 40;
        arac.kilometre = 120000;
        arac.marka = "Mercedes";
        arac.motorCC = 1600;
        arac.yil = 2014;

        arac.bilgiGöster();

        arac.anlikHizBilgisi();
        arac.hizlan();

        arac.anlikHizBilgisi();
        arac.yavasla();
        arac.anlikHizBilgisi();

        System.out.println("Aracinizin Yil Bİlgisi: "+ arac.yil);


        Kitap kitap = new Kitap();
        Scanner input = new Scanner(System.in);
        System.out.println("Kitap Adini Giriniz: ");
        kitap.baslik = input.nextLine();
        input.close();
        kitap.kitapAc();



        Bankahesap bh = new Bankahesap();

        bh.paraYatir(250);
        bh.paraCek(50);
        bh.bilgiGoster();

    }
    




}
