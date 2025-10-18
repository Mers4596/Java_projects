package harf_Notu_Bulma_Uygulamasi;
import java.util.Scanner;

public class harf_Notu_Bulma_Uygulamasi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much will you enter notes: ");
        int grade_count = input.nextInt();
        int[] grades = new int[grade_count];

        int total = 0;   
        for(int i = 0; i<grade_count; i++){
            System.out.println((i+1)+".th(nd,rd) Enter your note: ");
            grades[i] = input.nextInt();
            total = total + grades[i];
        }
        double mean = total / grade_count;
        System.out.println("Your grades's means are: "+ mean);

        if(mean >= 80) System.out.println("AA");
        else if(mean >= 70) System.out.println("BA");
        else if(mean >= 50) System.out.println("CC");
        else if(mean >= 36) System.out.println("DD");
        else System.out.println("FF");
        input.close();
    }
}
