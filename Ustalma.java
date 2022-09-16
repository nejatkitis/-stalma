import java.util.Scanner;

public class Ustalma {
    public static void main(String[] args) {
        int n,k;
        int total = 1;
        Scanner sayi = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = sayi.nextInt();
        System.out.print("Kaçıncı kuvvetini hesaplamak istersin : ");
        k = sayi.nextInt();

        for (int i=0;i<k;i++){
            total *= n;
        }
        System.out.print("Sonuç : " +total);
    }
}
