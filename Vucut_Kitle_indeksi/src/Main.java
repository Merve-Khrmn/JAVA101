import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner k=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy=k.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo=k.nextDouble();
        double indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+indeks);


    }
}