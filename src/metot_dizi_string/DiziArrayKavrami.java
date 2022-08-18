package metot_dizi_string;

import java.util.Scanner;

public class DiziArrayKavrami {


    public static void main(String[] args) {


        Scanner kullanicidanAlinanBilgi = new Scanner(System.in);

        System.out.println("Kaç sayının ortalamasını istiyorsunuz?");
        int sayi = kullanicidanAlinanBilgi.nextInt();
        int kullaniciSayilari[] = new int[sayi];
        double ortalama = 0;

        for (int i = 0; i < sayi; i++) {
            System.out.println((i + 1) + "'nci sayıyı giriniz ");
            kullaniciSayilari[i] = kullanicidanAlinanBilgi.nextInt();
            ortalama = ortalama + kullaniciSayilari[i];
        }
        System.out.println("Sayılarınızın ortalaması: " + ortalama / kullaniciSayilari.length);


        //------------------------------------


        String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        System.out.println("Ay değerini rakamla yazınız.");
        int x = kullanicidanAlinanBilgi.nextInt();
        System.out.println(aylar[--x] + " ayındayız.");

        //------------------------------------

        int sayilarDizisi[] = new int[10];

        for (int i = 0; i < sayilarDizisi.length; i++) {

            sayilarDizisi[i] = i * i;
            // sayilarDizisi[i] = (int) Math.pow(i,2);
        }

        for (int i = 0; i < sayilarDizisi.length; i++) {
            System.out.println("Eleman: " + sayilarDizisi[i]);
        }


    }


}
