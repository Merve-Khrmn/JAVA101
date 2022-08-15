import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password,newpassword;
        int sec;
        Scanner k = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        username = k.nextLine();
        System.out.print("Şifreniz:");
        password = k.nextLine();
        if (username.equals("patika") && password.equals("java123"))
            System.out.println("Giriş Yaptınız.");
        else{
            System.out.println("Şifre Yanlış!");
            System.out.println("Şifreyi Sıfırlamak ister misiniz? ");
            System.out.print("1-Sıfırla\n2-Çıkış Yap\n");
        }
        sec=k.nextInt();
        switch (sec){
            case 1:
                Scanner m=new Scanner(System.in);
                System.out.print("Yeni Şifre Giriniz:");
                newpassword=m.nextLine();
                if(newpassword.equals(password) || newpassword.equals("java123"))
                    System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                else
                    System.out.println("Şifre oluşturuldu");
                break;
            case 2:
                System.out.println("Çıkış Yaptınız");


        }











    }
}