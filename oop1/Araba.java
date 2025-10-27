package oop1;

public class Araba {

    private double depo;
    private double tuketimOrani = 5.0; 
    private double kilometreSayaci;

    public Araba(double baslangicYakiti) {
        depo = baslangicYakiti;
        kilometreSayaci = 0;
    }

    public void sur(double km) {
        if (depo <= 0) {
            System.out.println("Yakit bitti! Lütfen yakit ekleyin.");
            return;
        }

        double harcananYakit = (km / 100) * tuketimOrani;

        if (harcananYakit > depo) {
            System.out.println("Bu kadar yol gidemem! Yakit yetersiz.");
            System.out.println("Yalnizca " + (depo / tuketimOrani * 100) + " km gidebilirsin.");
            depo = 0;
            System.out.println("Yakit bitti! Lütfen yakit ekleyin.");
        } else {
            depo -= harcananYakit;
            kilometreSayaci += km;
            System.out.println(km + " km yol gidildi. Kalan yakit: " + depo + " litre");
        }
    }

    public void yakitEkle(double litre) {
        depo += litre;
        System.out.println(litre + " litre yakit eklendi. Yeni depo seviyesi: " + depo + " litre");
    }

    public void bilgiGoster() {
        System.out.println("Toplam gidilen mesafe: " + kilometreSayaci + " km");
        System.out.println("Depoda kalan yakit: " + depo + " litre");
    }
}

