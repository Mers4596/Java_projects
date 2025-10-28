package oop_alistirma;
public class Main_Banka_Hesap {
    public static void main(String[] args)
    {
        BankaHesabi bankaHesabi = new BankaHesabi("Mehmet ERSOLAK", 10000);

        bankaHesabi.paraCek(2000);
        bankaHesabi.paraYatir(100000);
        bankaHesabi.bilgiGoster();
        

    }

}
