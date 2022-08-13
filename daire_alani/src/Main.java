import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        double a;
        Scanner k=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        r=k.nextInt();
        System.out.print("Merkez açısı giriniz:");
        a=k.nextDouble();
        double alan=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı:"+alan);


    }
}