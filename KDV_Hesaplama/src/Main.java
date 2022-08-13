import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tutar;
        double kdvliTutar;
        double kdvliTutar1;
        double kdvOran=0.18;
        double kdvOran1=0.08;

        Scanner k = new Scanner(System.in);
        tutar = k.nextInt();
        if((tutar<=1000)&&(tutar>0)){
            kdvliTutar=tutar*kdvOran;
            System.out.println(kdvliTutar);
        }
        else if(tutar>1000){
            kdvliTutar1=tutar*kdvOran1;
            System.out.println(kdvliTutar1);
        }
       else
            System.out.println("Geçerli bir değer giriniz!");


    }
}