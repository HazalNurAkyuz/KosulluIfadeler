import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int sayi = input.nextInt();
        switch (sayi) {
            case 1 :
                System.out.println("Sayı 1'e Eşittir");
                break;
            case 2 :
                System.out.println("Sayı 2'ye Eşittir");
                break;
            case 3 :
                System.out.println("Sayı 3'e Eşittir");
                break;
            default:
                System.out.println("Geçersiz");

        }

    }

}
