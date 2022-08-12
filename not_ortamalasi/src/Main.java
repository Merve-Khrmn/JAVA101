import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fzk,kmya,trk,trh,mzk;
        Scanner k=new Scanner(System.in);
        System.out.print("Matematik notu:");
        mat=k.nextInt();
        System.out.print("Fizik notu:");
        fzk=k.nextInt();
        System.out.print("Kimya notu:");
        kmya=k.nextInt();
        System.out.print("Türkce notu:");
        trk=k.nextInt();
        System.out.print("Tarih notu:");
        trh=k.nextInt();
        System.out.print("Müzik notu:");
        mzk=k.nextInt();
        double ortalama=((mat+fzk+kmya+trk+trh+mzk)/6);

        boolean kosul=(ortalama >=60);
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);





    }
}