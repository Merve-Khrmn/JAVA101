import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        int total=1;
        int total1=1;
        int total2=1;

        Scanner k=new Scanner(System.in);
        System.out.print("n sayısı:");
        n=k.nextInt();
        System.out.print("r sayısı:");
        r=k.nextInt();
        for(int i=1;i<n;i++){
            total*=n;}
        for(int i=1;i<r;i++){
        total1*=r;}
        for(int i=1;i<(n-r);i++){
            total2*=(n-r);
        }
        System.out.println("C(n,r):"+total/(total1*total2));


    }
}