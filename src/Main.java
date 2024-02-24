import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcı Grişi
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        //Değişkenler
        int number = input.nextInt();
        int b,result = 0;
        //Döngü-Basamak Değer Toplamları
        while (number != 0){
            b=number % 10;
            result +=b;
            number /= 10;

        }
        System.out.println("Sonuç: "+ result);
    }
}