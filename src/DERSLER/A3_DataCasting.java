package DERSLER;

import java.util.Scanner;

public class A3_DataCasting {
    public static void main(String[] args) {

        String str = "Java Candir";

        String s1 = str;

        boolean bl2 = true;

        int sayi2 = 'k';

        double dbl1 = sayi2;

        double dbl5 = 4.5;
        int int3 = 3;

        int3 = (int) dbl5;
        System.out.println(int3); //4

        System.out.println("----------------------------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("ascii tablosundan bir karakter giriniz");

        char girilenKarakter = scan.next().charAt(0);
        System.out.println(girilenKarakter);

        String str1 = "Java Candir";

        Integer sayi = 5;

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.SIZE);//32

        System.out.println(Short.MIN_VALUE);//-32768

        String a = "155";
        String b = "100";
        System.out.println(a+b);//155100
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));//255

        //Auto Wedding: geniş kapsamlı olan variablelara dar kapsamlı datayi eklersek java bunu otomatik çevirir
        //Explicir Narrowing : Dar kapsamşlı variablara daha geniş bir data eklersek java bunu kabul etmez bizim onayımızı ister
        // parantez içine variabllari yazdığımızda kabul eder
        //Wrapper Class: primitive data türlerinde hazır method yoktur. Hazır method için wrapper classları oluşturmusutur.
        //Bunlar Integer Byte Float , Double Charecter Booelan Short Long


    }
}
