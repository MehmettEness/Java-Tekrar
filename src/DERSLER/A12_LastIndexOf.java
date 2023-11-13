package DERSLER;

public class A12_LastIndexOf {
    public static void main(String[] args) {

        String str = "Javayı ogrenecegiz baska yolu yok";

        //a harfinin ilk kullanım indexi
        System.out.println(str.indexOf("a")); //1

        //a harfinin son kullanımın indexi
        System.out.println(str.lastIndexOf("a"));//23

        //J harfinin son indexini bulunuz.
        System.out.println(str.lastIndexOf("J")); //0

        //Metine bakmadan e harfinin 2 kere kullanılıp kullanılmadığını yazdırın
        int ilkIndex =str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex ==-1){
            System.out.println("Hiç kullanılmamış");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Sadece 1 kez kullanılmış");
        } else{
            System.out.println("e harfi 2 veya 2 den fazla kullanılmıştır.");

        }


    }
}
