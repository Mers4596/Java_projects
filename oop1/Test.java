package oop1;

public class Test {
    public static void main(String[] args) {

        Araba arac = new Araba(20); 

        arac.sur(150);   
        arac.sur(200);   
        arac.bilgiGoster();

        arac.sur(300);   
        arac.yakitEkle(10); 
        arac.sur(100);   
        arac.bilgiGoster();
    }
}
