package Consturctor_Çalışması;

public class Kutu_Renk_Main {
    public static void main(String[] args) {
        Renk renk1 = new Renk(150, 234, 223);
        Kutu kutu1 = new Kutu(100, 1000, renk1);

        kutu1.bilgiGoster();
        

    }
}
