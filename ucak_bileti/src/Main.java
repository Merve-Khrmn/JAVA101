import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, kmUcret = 0.10;
        int yas, yolculuk;
        Scanner k = new Scanner(System.in);
        System.out.print("Mesafe'yi Km Cinsinden Giriniz:");
        mesafe = k.nextDouble();
        System.out.print("Yaşınızı Giriniz:");
        yas = k.nextInt();
        System.out.print("Yolculuk Tipinizi Seçiniz\n1-Tek Yön \n2-Çift Yön\n");
        yolculuk = k.nextInt();
        double normalTutar = mesafe * kmUcret;
        if (yolculuk < 1 || yolculuk > 2 || yas < 0 || mesafe < 1) {
            System.out.println("Hatalı Veri Girdiniz!");}
        if(yolculuk==1 && yas>24 && yas<65){
            System.out.println(normalTutar);}
        if (yas <= 12 && yolculuk == 1) {
            double yasindirim = (normalTutar * 0.50);
            System.out.print("İndirimli Tutar:");
            System.out.println(normalTutar - yasindirim);
        }
        if (yolculuk == 1 && (yas > 12 && yas < 24)) {
            double yasindirim = (normalTutar * 0.10);
            System.out.print("İndirimli Tutar:");
            System.out.println(normalTutar - yasindirim);
        }
        if(yolculuk==1 && yas>65){
            double yasindirim = (normalTutar * 0.30);
        System.out.print("İndirimli Tutar:");
        System.out.println(normalTutar - yasindirim);}
        if(yolculuk==2 && yas>24 && yas<65){
            double yolindirim = (normalTutar * 0.20);
            System.out.println(normalTutar-yolindirim);}
        if (yas <= 12 && yolculuk == 2) {
            double yasindirim = (normalTutar * 0.50);
            System.out.print("İndirimli Tutar:");
            System.out.println(normalTutar - (yasindirim*0.20));}
        if (yolculuk == 2 && (yas > 12 && yas < 24)) {
            double yasindirim = (normalTutar * 0.10);
            System.out.print("İndirimli Tutar:");
            System.out.println(normalTutar - (yasindirim*0.20));
        }
        if(yolculuk==2 && yas>65){
            double yasindirim = (normalTutar * 0.30);
            System.out.print("İndirimli Tutar:");
            System.out.println(normalTutar - (yasindirim*0.20));}

    }
}
