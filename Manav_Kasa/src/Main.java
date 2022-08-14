import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
        double armutKilo,elmaKilo,domKilo,muzKilo,patKilo;
        Scanner k=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo?:");
        armutKilo=k.nextDouble();
        System.out.print("Elma Kaç Kilo?:");
        elmaKilo=k.nextDouble();
        System.out.print("Domates Kaç Kilo?:");
        domKilo=k.nextDouble();
        System.out.print("Muz Kaç Kilo?:");
        muzKilo=k.nextDouble();
        System.out.print("Patlıcan Kaç Kilo?:");
        patKilo=k.nextDouble();
        double toplam=(armut*armutKilo)+(elma*elmaKilo)+(domKilo*domates)+(muzKilo*muz)+(patKilo*patlıcan);
        System.out.println("Toplam Tutar:"+toplam);


    }
}