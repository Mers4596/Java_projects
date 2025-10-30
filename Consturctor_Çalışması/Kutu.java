package Consturctor_Çalışması;

public class Kutu {
    Renk renk;
    String sekil;
    double en; 
    double boy;

    public void sekilBul(){
        if(this.en == this.boy){
            this.sekil = "Kart";
        }
        else{
            this.sekil = "Diktörgen";
        }
    }
    

    public Kutu(double en, double boy, Renk renk){
        this.boy = boy;
        this.en = en;
        sekilBul();
        this.renk = renk;
    }


    public void bilgiGoster()
    {
        System.out.println("Kutunun Rengi: "+ this.renk.R + "," + this.renk.G + "," + this.renk.B + "," + "Kutunun Şekli: "+ this.sekil + "Kutunun Eni: " + this.en + "Kutunun Boyu: "+ this.boy);
    }
    
}
