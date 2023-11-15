package DERSLER;

import java.util.Scanner;

public class A20_SORU {

    public static void main(String[] args) {


        //Soru 2- Kullanicidan main method icinde  ayri ayri isim ve soyismini alin

        //        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //        isim bosluk soyisim seklinde bize donduren bir method olusturun
        //        input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz


    Scanner scan= new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim = scan.next();

        System.out.println("soyisim giriniz");
        String soyisim = scan.next();

        System.out.println(isimSoyisimClassi(isim, soyisim));

        String isimYazSoyisimYaz= isimSoyisimClassi(isim , soyisim);

    }
    public static String isimSoyisimClassi (String isim , String soyisim){

        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();

        String isimDuzeni = isim + " " + soyisim;


        return isimDuzeni;
    }

}
