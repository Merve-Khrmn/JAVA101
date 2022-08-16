import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner k = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz:");
        sicaklik = k.nextInt();
        if (sicaklik < 5)
            System.out.println("Kayak Yapabilirsiniz.");
        else if (sicaklik > 10 && sicaklik <= 15)
            System.out.println("Sinemaya yada Pikniğe gidebilirsiniz");
        else if (sicaklik > 5 && sicaklik < 10)
            System.out.println("Sinemaya gidebilirsiniz");
        else if (sicaklik > 15 && sicaklik < 25)
            System.out.println("Pikniğe gidebilirsiniz");
        else
            System.out.println("Yüzmeye Gidebilirsiniz");

    }
}