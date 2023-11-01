package DERSLER;

import java.util.Scanner;

public class A4_Mat_Increment_Dicrement {

    public static void main(String[] args) {
        //Kullanıcıdan 3 basamaklı bir sayi alıp, sayının rakamlarını alıp yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("3 basamaklı sayi girinizi");

        int girilendeger= scan.nextInt();

        int birler = 0;
        int toplam = 0;

        birler= girilendeger %10;
        toplam = toplam +birler;

        girilendeger = girilendeger /10;

        birler = girilendeger % 10;
        toplam = toplam+birler;

        girilendeger = girilendeger / 10;

        birler = girilendeger % 10;
        toplam = toplam+birler;



        System.out.println("rakamlar toplamı :" + toplam);


        System.out.println("-------------------------------------------------------------------------");

        //Increment : değer arttırma

        //sayi*=3
        //sayi++

        int sayi = 10;
        //sayi variable değerini 2 katının 5 fazladı yap
        sayi*=2;
        sayi+=5;
        System.out.println(sayi); //25


        //Decrement : değer azaltma

        //sayı-=5

        //sayi--


        //once a değerini arttırım sonra b ye atatyın
        int a = 10;
        int b =0;

        b = ++a;
        System.out.println("a :" + a + " b : " + b);

        //once a degerine b ye atayıp sonra arttırın
        int a1 = 10;
        int b1 =0;
        b1=a1++;

        System.out.println("a :" + a1 + " b : " + b1);


    }

}
