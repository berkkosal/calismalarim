package metot_dizi_string;

import java.util.Scanner;

public class MetotOrnek {

    public static Scanner kullanicidanAlinanSayi = new Scanner(System.in);

    public static void main(String[] args) {

        int kullaniciSecimi = -1;

        while (kullaniciSecimi != 0) {

            kullaniciSecimi = menuGoster();


            if (kullaniciSecimi == 1) {

                System.out.println("Birinci sayıyı giriniz: ");
                int birinciSayi = kullanicidanAlinanSayi.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int ikinciSayi = kullanicidanAlinanSayi.nextInt();

                carpimiBul(birinciSayi, ikinciSayi);


            } else if (kullaniciSecimi == 2) {
                System.out.println("Birinci sayıyı giriniz: ");
                int birinciSayi = kullanicidanAlinanSayi.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int ikinciSayi = kullanicidanAlinanSayi.nextInt();
                System.out.println("İki sayının toplamı = " + toplamiBul(birinciSayi, ikinciSayi));


            } else if (kullaniciSecimi == 3) {

                kuvvetBul();

            } else if (kullaniciSecimi == 4) {

                System.out.println("Sonuç = " + isaret(2));


            } else System.out.println("Hatalı seçim yaptınız");


        }

        System.out.println("Uygulama kapandı.");

    }


    public static int toplamiBul(int birinciSayi, int ikinciSayi) {
        int toplam = birinciSayi + ikinciSayi;
        return toplam;

    }

    public static double toplamiBul(double birinciSayi, double ikinciSayi) {
        double toplam = birinciSayi + ikinciSayi;
        return toplam;

    }

    public static void carpimiBul(int birinciSayi, int ikinciSayi) {
        System.out.println("Sayıların Çarpımı: " + (birinciSayi * ikinciSayi));

    }

    public static int menuGoster() {

        System.out.println("************ MENU ************ ");
        System.out.println("1 - İki sayının toplamını bul");
        System.out.println("2 - İki sayının çarpımını bul");
        System.out.println("3 - İki sayının kuvvetini bul");
        System.out.println("Çıkmak için 0 tuşlayınız.");


        return kullanicidanAlinanSayi.nextInt();

    }

    public static void kuvvetBul() {

        System.out.println("Birinci sayıyı giriniz: ");
        int birinciSayi = kullanicidanAlinanSayi.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int ikinciSayi = kullanicidanAlinanSayi.nextInt();

        double toplam = Math.pow(birinciSayi, ikinciSayi);
        System.out.println("İki sayının kuvveti bulundu= " + (int) (toplam));

    }

    public static String isaret(int n) {

        if (n > 0) {
            return "Pozitif. ";
        } else if (n == 0) {
            return "Sayı 0. ";
        } else if (n < 0) {
            return "Negatif. ";
        } else
            return "";
    }


}

