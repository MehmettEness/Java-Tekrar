package DERSLER;

import java.util.Scanner;

public class A21_SORU {
    //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
    //        Girilen sayinin pozitif tam bolenleri sayisini bulup
    //        bize donduren bir method olusturun.
    //   ornek : 20  pozitif tam bolenleri : 1,2,4,5,10,20 ptbs : 6

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("tamsayi gir");
        int kullaniciSayisi = scan.nextInt();
        System.out.println(bolenler(kullaniciSayisi));
    }

    public static int bolenler (int sayi){
        int sayac =0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i ==0){
                sayac++;
            }

        }
        return sayac;

    }






}
