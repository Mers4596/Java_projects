package oop_alistirma5;


public class Karakter {

    String karakterAdi;
    int guc;
    int saglik = 100;
    int saldiriHizi;

    
    public Karakter(String karakterAdi, int guc, int saldiriHizi)
    {
        this.guc = guc;
        this.karakterAdi = karakterAdi;
        this.saglik = 100;
        this.saldiriHizi = saldiriHizi;

    }
    public void karakterBilgisi()
    {
        System.out.println("Karakter Adi: " + this.karakterAdi);
        System.out.println("Karakter Gücü: " + this.guc);
        System.out.println("Karakter Sağlığı: " + this.saglik);
        System.out.println("Karakter Saldiri Hizi: " + this.saldiriHizi);

    }

    public void saldiriYap(Karakter hedefKarakter)
    {
        hedefKarakter.saglik -= (this.guc * this.saldiriHizi);
        System.out.println(this.karakterAdi + " Adli Kullanici " + hedefKarakter.karakterAdi + " Adli Kullaniciya " + this.guc + " Guc Değerinde Saldiri yapti \n"  
                          + "Güncel Sağliği" + hedefKarakter.saglik );
                                

    }
}
