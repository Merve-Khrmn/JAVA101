import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner k=new Scanner(System.in);
        System.out.print("1.kenarı giriniz : ");
        a=k.nextInt();
        System.out.print("2.kenarı giriniz : ");
        b=k.nextInt();
        System.out.print("3.kenarı giriniz : ");
        c=k.nextInt();
        if((b+c>a)&&(a+c>b)&&(a+b>c)){
        double u,cevre;
        double alan;
        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin çevresi : "+cevre);
        System.out.println("Üçgenin alanı : "+alan);
        }
        else
            System.out.println("Girdiğiniz uzunluklar üçgen oluşturmamaktadır");

    }
}