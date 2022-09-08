import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi;
        int basamak=0;
        int toplam=0;
        System.out.print("Sayı Giriniz:");
        sayi=k.nextInt();
        while(sayi !=0){
            toplam+=(sayi%10);
            sayi/=10;
            ++basamak;

        }
        System.out.println("Basamak Değeri:"+basamak);
        System.out.println("Basamak Değerleri Toplamı:"+toplam);


    }
}