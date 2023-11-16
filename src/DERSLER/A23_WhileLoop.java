package DERSLER;

public class A23_WhileLoop {
    public static void main(String[] args) {
        //1 den 100 (dahil) olan sayıların toplamını veriniz.
    int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;
        }
        System.out.println("FORLOOP TOPLAM : " + toplam);



        int toplam2 =0;

        int i =1;
        while(i<=100) {
            toplam2+=i;
            i++;
        }
        System.out.println("whileLoop :" +  toplam2);


    }



}
