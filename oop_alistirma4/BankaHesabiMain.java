package oop_alistirma4;

public class BankaHesabiMain {

    public static void main(String[] args)
    {
        BankaHesabi hesap1 = new BankaHesabi("Mehmet Bey", 10000);
        BankaHesabi hesap2 = new BankaHesabi("Büşra Hanim", 5000);

        hesap1.bilgiGoster();
        hesap2.bilgiGoster();


        hesap1.paraCek(1000);
        hesap2.paraYatirma(2000);

        hesap1.bilgiGoster();
        hesap2.bilgiGoster();

        hesap1.paraTransfer(hesap2, 500);
        
        hesap1.bilgiGoster();
        hesap2.bilgiGoster();

    }

}
