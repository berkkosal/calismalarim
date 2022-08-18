package operatorler;

public class IslemOnceligi {

    public static void main(String[] args) {



        int sayi1= 15;
        int sayi2= 5;
        int sonuc = 0;

        sonuc= (sayi1 + sayi2*2 - sayi2) + sayi2 -sayi1*4 + sayi1;
        System.out.println(sonuc);
        sonuc= (sayi1 * sayi2 + 4 / 2)+ sayi1++ *sayi2 + sayi1;
        System.out.println(sonuc);


    }


}
