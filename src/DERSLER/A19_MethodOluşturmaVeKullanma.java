package DERSLER;

import java.sql.SQLOutput;

public class A19_MethodOluşturmaVeKullanma {
    //Soru 1- Kullanicidan input olarak verilen bir String,
    //        baslangic ve bitis indexlerine gore
    //        baslangic index'i dahil, bitis index'i haric olacak sekilde
    //        aradaki harfleri yazdiran bir method olusturun.
    //
    //          - kullanici baslangic degeri olarak,
    //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
    //          hata mesaji yazdirin.

    public static void main(String[] args) {

        altString("Java güzel", 3, 7);
        altString("enesmehmet mahmut", 2, 6);
    }

    public static void altString(String metin, int basIndx, int bitisIndex) {

        if (basIndx > bitisIndex) {
            System.out.println("BAşindeksi , bitiş indexten büyük olamaz");
        } else if (basIndx >= metin.length() || bitisIndex >= metin.length()) {
            System.out.println("Geçersiz index");
        } else {
            for (int i = basIndx; i < bitisIndex; i++) {
                System.out.print(metin.charAt(i));
            }
            System.out.println("");
        }


    }

    }

