package DERSLER;

import java.util.Scanner;

public class A7_nestedIfElseTernary {
    public static void main(String[] args) {

/*
Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
kullaniciya musteri karti olup olmadigini sorun.
Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
 */

    Scanner scan = new Scanner(System.in);
        System.out.println("ürün adedini giriniz");
        int urunSayisi = scan.nextInt();

        System.out.println("Liste fiyatını girinizi.");
        double listeFiyati = scan.nextDouble();

        System.out.println("Müsteri kartınız var mı \n E: Evet || H:Hayır ");
        char varMI = scan.next().toUpperCase(). charAt(0);

        if (varMI == 'E' ){

            if (urunSayisi>10){
                System.out.println("%20 indirimli fiyat :" + urunSayisi*listeFiyati*80/100);
            }else {
                System.out.println("%15 indirimli fiyat :" + urunSayisi*listeFiyati*85/100);
            }

        } else if (varMI == 'H') {

            if (urunSayisi>10){
                System.out.println("%15 indirimli fiyat :" + urunSayisi*listeFiyati*85/100);
            }else{
                System.out.println("%10 indirimli fiyat :" + urunSayisi*listeFiyati*90/100);
            }

        }else {
            System.out.println("Kart bilgisi hatalı");
        }

//Ternary
        //bir sayi alın cift mi tek mi olduğunu yazdırın
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int girilenSayi = scan1.nextInt();

        System.out.println(girilenSayi % 2== 0 ? "Çift sayi  " : "Tek Sayi");





    }
}
