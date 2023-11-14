package DERSLER;

import java.util.Scanner;

public class A16_ForLoops {

    public static void main(String[] args) {

        //Kullanıcını verdiği sayıdan sonra ardışık 10 tam sayi yazdırınız

        int input = 20;

        for (int i = input; i < input + 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println("-------------------------");
        //Kullanıcıdan verdiği sayıdan başlayarak 100 e kadar 5 er 5 er arttırın

        for (int i = input; i <= 100; i += 5) {
            System.out.print(i + " , ");
        }
        System.out.println("----------------------------");

        //100den başlayıp 1 e kadar geri geri gidin
        //7 nin katı olan sayıları yazdırın

        for (int i = 100; i >= 1; i--) {

            if (i % 7 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println("----------------------------------------------");
        //Sayılar dahil olarak aranan sayiya tam bölünen sayiları yazdırın

        int basalngıc = 201;
        int bitis = 237;

        int arananSayi = 43;

        for (int i = basalngıc; i <= bitis; i++) {
            if (i % arananSayi == 0) {

                System.out.println("aranan sayi ile tam bölünen sayi var");
                break;

            }
        }

        //Kullanıcıdan 20 den küçük bir tamsayı alıp bu sayının faktoriyel degerini hesaplayınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("20 den küçük bir tamsayı giriniz");
        int sayi = scan.nextInt();

        int carpim = 1;

        if (sayi > 20) {
            System.out.println("20 den küçük bir tamsayı giriniz");

        } else if (sayi < 0) {
            System.out.println("pozitifi bir deger giriniz");

        } else {
            for (int i = 1; i <= sayi; i++) {
                carpim *= i;
            }

            System.out.println("girilen sayi olan " + sayi + "! = " + carpim);
        }

        //Kullanıcıdan bir tam sayi alın. Bu sayiynin değerlerini toplayın

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int girilenSayi = scan1.nextInt();

        int sayim = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <= girilenSayi; i++) {

            birlerBasamagi = sayim % 10;
            rakamlarToplami = rakamlarToplami + birlerBasamagi;
            sayim = sayim / 10;

        }
        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplamı = " + rakamlarToplami);


    }
}
