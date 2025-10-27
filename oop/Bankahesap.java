package oop;

public class Bankahesap {

    private int  bakiye = 1000;

    public void paraYatir(int miktar){
        bakiye = bakiye + miktar;
    }
    public void paraCek(int miktar){
        bakiye = bakiye - miktar;
    }
    public void bilgiGoster(){
        System.out.println("Guncel Bakiye: " + bakiye);
    }

}
