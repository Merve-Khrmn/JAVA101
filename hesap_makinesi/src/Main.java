import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1 , sayi2 , select;
        Scanner k=new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
                sayi1=k.nextInt();
        System.out.print("2.sayıyı giriniz:");
            sayi2=k.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
            select=k.nextInt();
        if(sayi2!=0){
            switch (select){
                case 1:
                    System.out.println("Toplam"+(sayi1+sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarma"+(sayi1-sayi2));
                    break;
                case 3:
                    System.out.println("Çarpma"+(sayi1*sayi2));
                    break;
                case 4:
                    System.out.println("Bölme"+(sayi1/sayi2));
                    break;
         
}
        }else{
            switch(select){
                case 4:
                    System.out.println("Sayıyı 0 ile bölemezsiniz!");
                    break;
            }
        }

    }
}
