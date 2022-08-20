import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int day, month;
        Scanner k = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay:");
        month = k.nextInt();
        if (month <= 12 && month > 0) {
            System.out.print("Doğduğunuz Gün:");
        } else System.out.println("Geçerli Bir Sayı Giriniz");
        day = k.nextInt();
        if (day <= 31 && day > 0)
            if (month == 1 && day < 22)
                System.out.println("Oğlak Burcu");
            else if (month == 1 && day > 22)
                System.out.println("Kova Burcu");
        if (month == 2 && day < 20)
            System.out.println("Kova Burcu");
        else if (month == 2 && day > 29)
            System.out.println("Geçerli Bir Tarih Değildir");
        else if (month == 2 && day > 20)
            System.out.println("Balık Burcu");
        if (month == 3 && day < 21)
            System.out.println("Balık Burcu");
        else if (month == 3 && day > 20)
            System.out.println("Koç Burcu");
        if (month == 4 && day < 21)
            System.out.println("Koç Burcu");
        else if (month == 4 && day > 30)
            System.out.println("Geçerli Değildir");
        else if(month == 4 && day > 20)
            System.out.println("Boğa Burcu");
        if(month==5 && day<22)
            System.out.println("Boğa Burcu");
        else if(month==5 && day>21)
            System.out.println("İkizler Burcu");
        if (month == 6 && day < 23)
            System.out.println("İkizler Burcu");
        else if (month == 6 && day > 30)
            System.out.println("Geçerli Değildir");
        else if(month == 6 && day > 22)
            System.out.println("Yengeç Burcu");
        if(month==7 && day<23)
            System.out.println("Yengeç Burcu");
        else if(month==7 && day>22)
            System.out.println("Aslan Burcu");
        if(month==8 && day<23)
            System.out.println("Aslan Burcu");
        else if(month==8 && day>22)
            System.out.println("Başak Burcu");
        if (month == 9 && day < 23)
            System.out.println("Başak Burcu");
        else if (month == 9 && day > 30)
            System.out.println("Geçerli Değildir");
        else if(month == 9 && day > 22)
            System.out.println("Terazi Burcu");
        if(month==10 && day<23)
            System.out.println("Terazi Burcu");
        else if(month==10 && day>22)
            System.out.println("Akrep Burcu");
        if (month == 11 && day < 22)
            System.out.println("Akrep Burcu");
        else if ( month == 11 &&day > 30)
            System.out.println("Geçerli Değildir");
        else if(month == 11 && day > 21)
            System.out.println("Yay Burcu");
        if(month==12 && day<22)
            System.out.println("Yay Burcu");
        else if(month==12 && day>21)
            System.out.println("Oğlak Burcu");

    }
}











