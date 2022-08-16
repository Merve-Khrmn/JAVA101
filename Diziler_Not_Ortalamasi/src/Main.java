import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fzk, trk, kimya, mzk;
        int toplam = 0;
        int sayac = 5;
        Scanner k = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:");
        mat = k.nextInt();
        if ((mat >= 0) && (mat <= 100))
            toplam = toplam + mat;
        else {
            --sayac;
        }

        System.out.print("Fİzik notunu giriniz:");
        fzk = k.nextInt();
        if ((fzk >= 0) && (fzk <= 100))
            toplam = toplam + fzk;
        else {
            --sayac;
        }

        System.out.print("Türkçe notunu giriniz:");
        trk = k.nextInt();
        if ((trk >= 0) && (trk <= 100))
            toplam = toplam + trk;

        else {
            --sayac;
        }
        System.out.print("Kimya notunu giriniz:");
        kimya = k.nextInt();
        if ((kimya >= 0) && (kimya <= 100))
            toplam = toplam + kimya;

        else {
            --sayac;
        }
        System.out.print("Müzik notunu giriniz:");
        mzk = k.nextInt();
        if ((mzk >= 0) && (mzk <= 100))
            toplam = toplam + mzk;

        else {
            --sayac;
        }
        System.out.println(toplam);

        int ort = toplam / sayac;
        if (ort < 55)
            System.out.println("Sınıfta Kaldınız.");
        else
            System.out.println("Sınıfı geçtiniz.");
    }
}
