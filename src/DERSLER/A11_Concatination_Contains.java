package DERSLER;

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



    }
}
