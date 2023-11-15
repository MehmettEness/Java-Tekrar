package DERSLER;

import java.util.Scanner;

public class A18_NestedForLoop {
    public static void main(String[] args) {

        /*
    Aşağıdaki tabloyu konsolda yazdırın

    1  2  3  4
    2  4  6  8
    3  6  9  12

     */

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i * j + "  " );
            }
            System.out.println("");
        }

        /*
        1
        1 2
        1 2 3
        1 2 3 4
        Bu şekilde yazdır

         */

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }

        //Kullanıcıdan satır sayısı alıp asağıdaki gibi şekil çizdirin

        /*
        *
        * *
        * * *
        * * * *

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Satır sayısını kayıt ediniz");
        int satır = scan.nextInt();

        for (int i = 1; i <satır ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }


    }
}
