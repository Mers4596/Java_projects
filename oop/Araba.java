package oop;

public class Araba 
{
    int hiz;
    String marka;
    int motorCC;
    int yil;
    int kilometre;

    public void bilgiGöster()
    {
    System.out.println("Aracin Hizi: "+ hiz);
    System.out.println("Aracin Markasi: "+ marka);
    System.out.println("Aracin Motor Gucu "+ motorCC);
    System.out.println("Aracin Yili: "+ yil);
    System.out.println("Aracin Kilometre: "+ kilometre);
    }
    public void hizlan(){
        hiz = hiz + 5;
    }
    public void yavasla(){
        hiz = hiz - 3;
    }
    public void anlikHizBilgisi(){
        System.out.println("Aracinizin anlik hiz bilgisi: "+ hiz);
    }
}
