package Ders_NNP;

public class Ders {
    int dersKod;
    String projeAdi;
    int dersKredi;
    int akademisyenId;

    public Ders(int dersKod, String projeAdi, int dersKredi, int akademisyenId){
        this.akademisyenId = akademisyenId;
        this.projeAdi = projeAdi;
        this.dersKod = dersKod;
        this.dersKredi = dersKredi;
    }

}
