package DERSLER;

public class A14_nullPointer {
    public static void main(String[] args) {

        String str1;

        String str2 =null; //null bir deger değil pointerdir.

        System.out.println(str2); //null

        System.out.println(str2 + " bant");//null bant

        System.out.println(str2.concat(" bant")); //null pointer exception


    }
}
