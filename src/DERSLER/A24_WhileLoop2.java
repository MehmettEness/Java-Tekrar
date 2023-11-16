package DERSLER;

import java.util.Scanner;

public class A24_WhileLoop2 {
    //Soru 4 : Main method'da kullanicidan sifre isteyip,
    //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
    //          ve method'dan true veya false dondurun
    //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
    //         tum sartlari saglanincaya kadar tekrar deger isteyin
    //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
    //         - ilk harf kucuk harf olmali
    //         - son karakter rakam olmali
    //         - sifre bosluk icermemeli
    //         - uzunlugu en az 10 karakter olmali




    public static void main(String[] args) {

        boolean sonuc = false;

        while (sonuc==false){

            Scanner scan = new Scanner(System.in);
            System.out.println("şifre giriniz");
            String kullaniciSifre = scan.nextLine();
            sonuc=sifreKontrolSistemi(kullaniciSifre);
        }
        System.out.println("şifre başarılı");
    }

    public static boolean sifreKontrolSistemi (String sifre){
        int sayac =0;

        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <='z')){
            System.out.println("ilk harf kücük olmalı");
            sayac++;
        }
        int sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')){
            System.out.println("son karakter rakam olmalı");
            sayac++;
        }
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            sayac++;
        }
        if (sifre.length()<10){
            System.out.println("şifre en az 10 karakter olmalı");
            sayac++;
        }
       if (sayac == 0) {
           return true;
       } else {
           return false;
       }

        }
    }



