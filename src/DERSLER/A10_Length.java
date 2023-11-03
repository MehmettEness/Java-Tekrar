package DERSLER;

import java.util.Scanner;

public class A10_Length {
    public static void main(String[] args) {
        String isim = "Ramazan uzunkavaklaraltındayatarmıacababilemiyorum";

        //son harf yazdır
        System.out.println("isim uzunluğu :" + isim.length()); //50

        System.out.println(isim.charAt(isim.length()-1)); //m

        //sondan5.harfi yazdır

        System.out.println(isim.charAt(isim.length()-5)); //y


        //kullanıcıdan isim alınız
        //tek ise ortaki sayiyi alınız
        //çift ise ortadaki iki harfi alınız

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");

        String girilenIsim = scan.nextLine();

        int isimUzunluk = girilenIsim.length();
        if (isimUzunluk %2 ==0){
            System.out.println( "isim uzunluk : " + girilenIsim.charAt(( isimUzunluk/2 -1)) + (girilenIsim.charAt(isimUzunluk/2)));
        }else {
            System.out.println("isim uzunluk :" + girilenIsim.charAt((isimUzunluk-1 )/ 2));
        }


        System.out.println("-------------------------------------------------------------------------------------------------");

        //substring

        String str = "Java Candır";

        System.out.println(str.substring(6)); //andır

        System.out.println(str.substring(1,8)); //ava Can

        //son 3 harfi yazdır
        System.out.println(str.substring(str.length()-3)   );//dır



    }
}
