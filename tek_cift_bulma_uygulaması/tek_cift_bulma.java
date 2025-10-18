package tek_cift_bulma_uygulaması;
public class tek_cift_bulma {

    public static void main(String[] args){


        int cift_sayi_sayisi = 0;
        int tek_sayi_sayisi = 0;


        for(int i = 1; i <= 100; i++){
            
            if(i % 2 == 0){
                cift_sayi_sayisi++;
            }
            else tek_sayi_sayisi++;
        
        }
        
        int [] cift_sayilar = new int[cift_sayi_sayisi];
        int [] tek_sayilar = new int[tek_sayi_sayisi];
        int cift_toplam = 0;
        int tek_toplam = 0;
        int cift_index = 0;
        int tek_index = 0;


        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
            cift_toplam = cift_toplam + i;
            cift_sayilar[cift_index] = i;
            cift_index++;
            } 
            else{
            tek_toplam = tek_toplam + i;
            tek_sayilar[tek_index] = i;
            tek_index++;               
            }       
        }
        System.out.println("Cift Sayilar:");
        for(int i = 0; i <  cift_sayi_sayisi; i++){
            System.out.print(cift_sayilar[i]+" + ");
        }
        System.out.print("="+ cift_toplam);

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("Tek Sayilar:");

        for(int i = 0; i < tek_sayi_sayisi; i++){
            System.out.print(tek_sayilar[i]+" + ");
        }
        System.out.print("="+ tek_toplam);       
    }

}