package DERSLER;

import java.util.Scanner;

public class A15_Replace {
    public static void main(String[] args) {
        String str = "Javayı anlıyorum ama yazamıyorum";

        System.out.println(str.replace("J", "T")); //Tavayı anlıyorum ama yazamıyorum

        System.out.println(str.replace("ama", "artık")); //Javayı anlıyorum artık yazamıyorum

        System.out.println(str.replace("a" , "*")); //J*v*yı *nlıyorum *m* y*z*mıyorum

        String str1 = "1Ja4va 8C9a2n5d1i4r";

        System.out.println(str1.replaceAll("\\d", ""));//Java Candir sayilardan kurtulur.

        //Kullacıdan bir metin isteyin
        //Mewtindeki tüm sayilari ve space dısındaki özel karakterleri temizleyin.
        //ornek : M55/*-e3+*h3--me21/?5t E345/*n43/e-s234/

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String metin = scan.nextLine();

        metin=metin.replaceAll("\\d" , "");

        metin=metin.replaceAll("\\S " , "1");

        metin=metin.replaceAll("\\W" , "");

        metin=metin.replaceAll("1" , " ");

        System.out.println(metin);//Mehmet Enes


    }
}
