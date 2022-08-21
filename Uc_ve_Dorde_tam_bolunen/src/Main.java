import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, sayac = 0;
        double total = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        num = k.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                System.out.println(i);
                sayac++;

            }
        }
        System.out.println(total / sayac);


    }
}