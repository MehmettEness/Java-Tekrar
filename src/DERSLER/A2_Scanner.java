package DERSLER;

import java.util.Scanner;

public class A2_Scanner {
    public static void main(String[] args) {
        int sayi = 25;
        int Sayi = 654; // bu yazım doğru değil. Java case sensitive dir (büyük küçük harf duyarlı)
        //variablelar isimleri küçükle başlar

        System.out.println(sayi+Sayi);

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();

        System.out.println("Girilen sayinin karesi :" + girilenSayi*girilenSayi);

        System.out.println("---------------------------------------------------------------------");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("1. tam sayi giriniz");
        double girilenDouble = scan1.nextDouble();

        System.out.println("2.tamsayi giriniz");
        int girilenInt = scan1.nextInt();

        System.out.println("iki sayinin toplamı :" + (girilenInt + girilenDouble));



        Scanner scan2 = new Scanner(System.in);

        System.out.println("isminizi giriniz");

        String isim = scan2.nextLine();

        System.out.println("soyisim giriniz");

        String soyisim = scan2.nextLine();

        System.out.println("yaşınızı giriniz");

        int yas = scan2.nextInt();

        System.out.println("Kilonuzu giriniz");

        double kilo =scan2.nextDouble();

        System.out.println("İsim :" + isim +"\n"  + "Soyisim :" + soyisim +" \n" + "Yaşınız: " + yas + "\n" + "Kilonuz :" + kilo);


        //Kullanıcıdan iki sayı alın değerlerini değiştirin

        Scanner scan3 = new Scanner(System.in);

        System.out.println("lütfen ilk sayi gir");

        int ilk = scan3.nextInt();

        System.out.println("ikinci syiyi girinizi");

        int iki = scan3.nextInt();

        int temp = ilk;

        ilk = iki;

        iki= temp;

        System.out.println( "ilk sayinni yenbi değeri :" + ilk);
        System.out.println("ikinci sayinin yeni değeri:" + iki);


    }
}
