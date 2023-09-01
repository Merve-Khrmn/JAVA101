import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        double result = 0;
        Scanner k=new Scanner(System.in);
        System.out.print("N değerini giriniz:");
        n=k.nextInt();
        for(double i=1;i<=n;i++){
            result+=(1/i);
        }
        System.out.println(result);
    }
}