package oop_alistirma;

public class Diktortgen {
    double uzunKenar;
    double kisaKenar;
    double alan;
    double cevre;

    public  void alanHesapla()
    {
        alan = uzunKenar * kisaKenar;
    }
    public void cevreHesapla()
    {
        cevre = 2 * (uzunKenar + kisaKenar);
    }
    
}
