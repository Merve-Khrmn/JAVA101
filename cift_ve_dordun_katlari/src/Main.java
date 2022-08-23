import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int toplam = 0;
        Scanner k = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz:");
            a = k.nextInt();

            if (a % 4 == 0 || a == (4 * 0.5))
                toplam += a;
        }
        while (a % 2 == 0);

        System.out.println("Toplam:" + toplam);
    }

}

