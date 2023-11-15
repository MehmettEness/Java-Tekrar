package DERSLER;

public class A9_Switch_StringManipulation_Equals {
    public static void main(String[] args) {

        String str = "Java Candır";
        //str nin ilk harfini yazdırın
        System.out.println(str.charAt(0));

        //str nin tüm harflerini büyük olacak şeklinde yazdır
        System.out.println(str.toUpperCase());

        //str tmam küçük harflerden olusan metne cevir

        str= str.toLowerCase();
        System.out.println(str);

        System.out.println("-------------------------------------------------------------------------------------");

        //equals

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";

        System.out.println(str1==str2); //false

        System.out.println(str3 == str4.toLowerCase()); //false

        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str3.equals(str4.toLowerCase())); //true

    }

}
