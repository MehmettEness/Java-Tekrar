package DERSLER;

import java.util.Scanner;

public class A17_ForLoops {
    public static void main(String[] args) {

  //     /*
  //     Kullanıcıdan pozitif bir tamsayi alın
  //     1 den başlayarak tüm sayilari yazdırın
  //     -3 ile bölünebilen bir sayiya gelirse fizz
  //     -5 ile bölünene bir sayıya gelirse buzz
  //     -hem 3 hem 5 ile bölünebilen bir sdayiya gelirse sayi gelirse fiizBuzz yazdırın

  //      */

  //     Scanner scan = new Scanner(System.in);
  //     System.out.println("Pozitif tam sayi giriniz");
  //     int sayi = scan.nextInt();


  //     for (int i = 1; i <=sayi ; i++) {

  //         if (i%3==0 && i%5==0){
  //             System.out.print("fizzBuzz");
  //         } else if (i%3==0) {
  //             System.out.print("fizz");
  //         } else if (i%5==0) {
  //             System.out.print("Buzz");
  //         }else {
  //             System.out.print(i +" ");
  //         }
  //     }

  //     System.out.println("------------------------------------------------------");

  //     //Kullanıcıdan bir String isteyin ve tersten yazdırın
  //     Scanner scan1 = new Scanner(System.in);
  //     System.out.println("Bir string giriniz");
  //     String str = scan1.nextLine();

  //     for (int i = str.length()-1; i >=0 ; i--) {
  //         System.out.print(str.charAt(i));
  //     }


        //Kullanıcıdan bir tamsayi isteyiniz ve bu tam sayının asal olup olmadığını kontrol ediniz.
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int girilenSayi = scan2.nextInt();

        boolean asal = true;

        for (int i = 2; i < girilenSayi ; i++) {
            if (girilenSayi % i ==0){
                System.out.println("Sayi asal değil");
                asal = false;
                break;
            }

        }
        if (asal){
            System.out.println("Sayi asaldır");
        }





    }
}
