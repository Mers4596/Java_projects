package oop_alistirma5;

public class KarakterMain {

    public static void main(String[] args)
    {
        Karakter karakter1 = new Karakter("Mehmet", 5,5);
        Karakter karakter2 = new Karakter("Büşra", 3, 10);

        karakter1.karakterBilgisi();
        karakter2.karakterBilgisi();

        karakter1.saldiriYap(karakter2);

        karakter1.karakterBilgisi();
        karakter2.karakterBilgisi();

        karakter2.saldiriYap(karakter1);

        karakter1.karakterBilgisi();
        karakter2.karakterBilgisi();
    }
}
