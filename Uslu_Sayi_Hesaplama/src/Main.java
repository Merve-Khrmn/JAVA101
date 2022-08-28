import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int a;
     int b;
     Scanner k=new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı:");
        a=k.nextInt();
        System.out.print("Üs Olucak Sayı:");
        b=k.nextInt();
        int total=1;
        for(int i=1;i<=b;i++)
            total*=a;
        System.out.println("Sonuç:"+total);
    }
}