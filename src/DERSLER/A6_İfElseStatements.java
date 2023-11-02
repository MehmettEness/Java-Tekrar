package DERSLER;

import java.util.Scanner;

public class A6_İfElseStatements {
    public static void main(String[] args) {

        int a  =  20;
        int b = 30;

        if (a>0){
            System.out.println("a sayisi pozitif");
        }

        if (a+b>100){
            System.out.println("a+b toplamı 100 den büyüktür");
        }

        if (b % 3 ==0){
            System.out.println("kalan 0 ");
        }

        //Kullanıcıdan bir sayhi isteyin sayiyi kontrol edip 5 e bölünebliyorsa "sayi 5 in katı " yazdırım

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");

        int girilenSayi = scan.nextInt();

        if (girilenSayi % 5 ==0){
            System.out.println("sayi 5 in tam katı");
        }else {
            System.out.println("sayi 5 in tam katı değil");
        }

        //Kuulanıcıdan sayi isteyin 3 e bölünüyorsa 3 e bölünür yazdırın
        //5 e bölünüyorsa 5 bölünür yazdırın

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int girilenDeger = scan1.nextInt();

        if (girilenDeger % 3 ==0){
            System.out.println("3 bölünüyor");
        } else if (girilenDeger%5 ==0) {
            System.out.println("5 bölünüyor");
        }else {
            System.out.println("sayi 3 ve 5 tam bölünmüyor");
        }


    }

}
