import java.util.Scanner;
public class DaireAvC {
    public static void main(String[]args){

        int r;
        double pi=3.14;

        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin Yarı Çapını Giriniz: ");
        r=input.nextInt();

        double alan = pi * r * r;
        double cevre= 2 * pi * r;

        System.out.println("Alan " + alan + " Olarak Hesaplanmıştır.");
        System.out.println("Çevre " + cevre + " Olarak Hesaplanmıştır. ");
    }
}
