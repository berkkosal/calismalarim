package kontrol_yapilari;

public class ForDongusuKullanimi {

    public static void main(String[] args) {

            /*
        // for(ilk_atama ; dongu_calismasinin_sarti ; her_calisma_sonrasi_neolacak);

        for (int i = 0; i<10 ; i++) {
            System.out.println("Berk Koşal");
            System.out.println("Java öğreniyorum");
            System.out.println("i'nin değeri: " + i);
        }


        for(int b=0, j=0; (b+j <10 ); b++, j++) {

            System.out.println("dönüyorum");

        }   */

        int sayi1 = 10;
        while (sayi1 <= 20){
            System.out.println("20 olmaya çalışıyorum.");
            System.out.println("Değerim kaç oldu? " + sayi1);
            sayi1++;

        }


        for (int sayi2 = 10; sayi2 <= 20; sayi2++){
            System.out.println("Ben de 20 olacağım.");
            System.out.println("Değerim kaç oldu? " + sayi2);
        }

        int sayi2 = 20;
        do {
            System.out.println("do while deniyorum. ");
            sayi2++;
        }    while (sayi2 <=23);



    }


}
