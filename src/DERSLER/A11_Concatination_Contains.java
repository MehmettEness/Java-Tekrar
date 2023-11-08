package DERSLER;

import java.util.Scanner;

public class A11_Concatination_Contains {
    public static void main(String[] args) {
        String str1= "Java";
        String str2 = " ";
        String str3 = "Candır";

        System.out.println(str1.concat(str2).concat(str3)); //concat Stringleri birleştirir. //Java Candır

        System.out.println("-----------------Contains-----------------------");

        String str = "Java nasıl güzel";

        //str java içeriyor mu ?

        boolean içeriyormu = str.contains("Java");
        System.out.println(içeriyormu);

        System.out.println("------------------------startWith ---- endWint---------------------");

        String str5="Java cok güzel";

        //str Java ile mi başlıyor
        System.out.println(str5.startsWith("Java"));//true

        //str Ja ile başlıyor
        System.out.println(str5.startsWith("Ja"));//true

        //str hiçlik ile mi başlıyor
        System.out.println(str5.startsWith(""));//true

        //5.indexten sonrası c ile mi başlar
        System.out.println(str5.startsWith("c" , 5));

        //str el ile mi biter
        System.out.println(str5.endsWith("el"));

        //str hiçlik ile biter
        System.out.println(str5.endsWith(""));

        //kullanicidan bir mail alin-
        // mail @ icermiyorsa "gecersiz mail"-
        // mail @gmail.com icermiyorsa, "mail gmail olmali"-
        // mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir mail adresi yazınız");
        String mailAdresi = scan.nextLine();

        if (!mailAdresi.contains("@")){
            System.out.println("Gçeersiz mail girdiniz");
        } else if (!mailAdresi.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");
        } else if (!mailAdresi.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");
        }

        System.out.println("------------------------------------------------------------------------------------------");

        //indexOf
        String str21= "Ali topu at, at ali at";

        //Alinin indexi nedir.?
        System.out.println(str21.indexOf("Ali")); //0

        //at in indexsi nedir ?
        System.out.println(str21.indexOf("at")); //9

        //op'un indeksi nedir ?
        System.out.println(str21.indexOf("op")); //5

        System.out.println(str21.indexOf("a" , 10)); //10.indexten sonra a yı bul dedik //13

        System.out.println(str21.indexOf("yusuf")); //-1


    }
}
