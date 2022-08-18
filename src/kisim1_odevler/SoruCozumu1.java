package kisim1_odevler;

import java.util.Scanner;

public class SoruCozumu1 {

    public static void main(String[] args) {


        Scanner konsoldanyaziokuyankontrolcu = new Scanner(System.in);


        System.out.println("Bir kelime girin: ");
        String kelime = konsoldanyaziokuyankontrolcu.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;
        boolean palindromeMu = true;
        while (altSinir < ustSinir ){
            if(kelime.charAt(altSinir) != kelime.charAt(ustSinir)){
                palindromeMu = false;
                break;
            }
            altSinir++;
            ustSinir--;
        }
        if (palindromeMu){
            System.out.println(kelime + " kelimesi palindromedur");
        }else {
            System.out.println(kelime + " kelimesi palindrome değildir.");
        }

   /*

        System.out.print("Lütfen sayınızı giriniz: ");
        int kullanicidanAlinanSayi = konsoldanyaziokuyankontrolcu.nextInt();
        for (int x = 2; x < kullanicidanAlinanSayi; x++) {
            boolean flag = true;
            for (int i = 2; i < x; i++) {

                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(x + ",");

        }


    }
}






        // SORU 10
        int kullanicidanAlinanSayi1 = 1;
        int kullanicidanAlinanSayi2 = 1;
        int sonuc = 1;
        int sonuc2 = 1;

        System.out.print("1. Sayıyı giriniz: ");
        kullanicidanAlinanSayi1 = konsoldanyaziokuyankontrolcu.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        kullanicidanAlinanSayi2 = konsoldanyaziokuyankontrolcu.nextInt();
        if (kullanicidanAlinanSayi1 > kullanicidanAlinanSayi2) {
            for (int i = kullanicidanAlinanSayi2; i > 0; i--) {
                sonuc = kullanicidanAlinanSayi1 % i;
                sonuc2 = kullanicidanAlinanSayi2 % i;
                if (sonuc == 0 && sonuc2 == 0) {
                    System.out.println("İki sayının ebobu: " + i);
                    return;
                }
            }
        }
        if (kullanicidanAlinanSayi1 < kullanicidanAlinanSayi2) {
            for (int i = kullanicidanAlinanSayi1; i > 0; i--) {
                sonuc = kullanicidanAlinanSayi2 % i;
                sonuc2 = kullanicidanAlinanSayi1 % i;
                if (sonuc == 0 && sonuc2 == 0) {
                    System.out.println("İki sayının ebobu: " + i);
                    return;
                }
            }
        } else {
            System.out.println("İki sayının ebobu: " + kullanicidanAlinanSayi1);
        }





        // SORU 9
        int kullanicidanAlinanSayi = 1;
        int sonuc = 1;

       while (kullanicidanAlinanSayi!=0) {
            System.out.print("Lütfen sayınızı giriniz: ");
            kullanicidanAlinanSayi = konsoldanyaziokuyankontrolcu.nextInt();
            if (kullanicidanAlinanSayi == 0) break;
            sonuc = kullanicidanAlinanSayi * sonuc;
        }
        System.out.println("Tüm sayıların çarpımı: " + sonuc);

        for (;kullanicidanAlinanSayi!=0;){
            System.out.print("Lütfen sayınızı giriniz: ");
            kullanicidanAlinanSayi = konsoldanyaziokuyankontrolcu.nextInt();
            if (kullanicidanAlinanSayi == 0) break;
            sonuc = kullanicidanAlinanSayi * sonuc;
        }
        System.out.println("Tüm sayıların çarpımı: " + sonuc);



        // SORU 8

        int rastgeleUretilecekSayi = (int)(Math.random() * 100);
        int kullanicininSayisi =0;

        do {
            System.out.print("Tahmin ettiğiniz sayı: ");
            kullanicininSayisi = konsoldanyaziokuyankontrolcu.nextInt();

            if (kullanicininSayisi < rastgeleUretilecekSayi){
                System.out.println("Sayıyı arttır.");

            } else if (kullanicininSayisi > rastgeleUretilecekSayi) {
                System.out.println("Sayıyı azalt.");

            } else System.out.println("Sayıyı bildiniz");

        }while (rastgeleUretilecekSayi != kullanicininSayisi);

        // -----------------------------------

        while(true){

            System.out.print("Tahmin ettiğiniz sayı: ");
            kullanicininSayisi = konsoldanyaziokuyankontrolcu.nextInt();

            if (kullanicininSayisi < rastgeleUretilecekSayi){
                System.out.println("Sayıyı arttır.");

            } else if (kullanicininSayisi > rastgeleUretilecekSayi) {
                System.out.println("Sayıyı azalt.");

            } else {System.out.println("Sayıyı bildiniz");
                break;
            }


        }







        // SORU 7

        int sonuc = 0;
        for (int i = 1; i < 10 ; i++){
            for (int x = 1; x<10 ; x++){
                sonuc = i * x;
                System.out.println(i + "x" + x + "=" + sonuc);
            }
        }





        // SORU 6

        System.out.print("X değerini giriniz: ");
        int xDegeri = konsoldanyaziokuyankontrolcu.nextInt();
        System.out.print("Y değerini giriniz: ");
        int yDegeri = konsoldanyaziokuyankontrolcu.nextInt();
        int sonuc = 1;

        if (xDegeri > 0 && yDegeri < 0) {
            sonuc = (4 * xDegeri) + (2 * yDegeri) + 4;
            System.out.println("1.fonksiyon çalıştı, sonucunuz: " + sonuc);

        } else if (xDegeri > 0 && yDegeri == 0) {
            sonuc = (2 * xDegeri) - yDegeri + 3;
            System.out.println("2.fonksiyon çalıştı, sonucunuz: " + sonuc);

        } else if (xDegeri < 0 && yDegeri > 0) {
            sonuc = (3 * xDegeri) + (4 * yDegeri) + 3;
            System.out.println("3.fonksiyon çalıştı, sonucunuz: " + sonuc);

        } else
            System.out.println("Lütfen kriterlere uygun sayı giriniz");
            return;


        // SORU 5


        for( int i = 1 ; i <=10 ; i++){

            System.out.print(i + ",");

        }



        // SORU 4

        int sonuc = 0;
        for (int i = 1; i <= 100; i++){
            sonuc = sonuc + i;
        }
        System.out.println("1'den 100'e kadar olan sayıların toplamı: " + sonuc);



        // SORU 3
        for (byte i = 1; i <= 5; i++) {

            System.out.println("For Nihat Berk Koşal");
        }
        byte sayi1 = 1;
        while (sayi1 <= 5) {
            System.out.println("While Nihat Berk Koşal");
            sayi1++;
        }

        byte sayi2 = 1;
        do {
            System.out.println("Do while Nihat Berk Koşal");
            sayi2++;
        } while (sayi2 <= 5);





        // SORU 2
        System.out.print("Vize notunuzu giriniz: ");
        double vize = konsoldanyaziokuyankontrolcu.nextDouble();
        System.out.print("Final notunuzu giriniz: ");
        double finall = konsoldanyaziokuyankontrolcu.nextDouble();
        double sonuc = ((vize * 2) / 5) + ((finall * 3)/ 5);

        if (sonuc >= 50){
            System.out.println("Tebrikler geçtiniz. ");

        } else System.out.println("Maalesef geçemediniz. ");




        // SORU 1
        System.out.print("1.sayıyı giriniz: ");
        double kullaniciSayi1 = konsoldanyaziokuyankontrolcu.nextDouble();
        System.out.print("2.sayıyı giriniz: ");
        double kullaniciSayi2 = konsoldanyaziokuyankontrolcu.nextDouble();
        System.out.print("3.sayıyı giriniz: ");
        double kullaniciSayi3 = konsoldanyaziokuyankontrolcu.nextDouble();

        double ortalama = (kullaniciSayi1 + kullaniciSayi2 + kullaniciSayi3) / 3;

        System.out.println("Ortalama: " + ortalama);


        System.out.print("Kaç sayının ortalaması alınacak ? ");
        int kacSayiAlinacak = konsoldanyaziokuyankontrolcu.nextInt();

        double kullanicidanAlinanSayiToplami = 0;

        for (int i = 1; i <= kacSayiAlinacak; i++) {
            System.out.print(i + ". sayıyı giriniz: ");

            kullanicidanAlinanSayiToplami += konsoldanyaziokuyankontrolcu.nextDouble();


        }

        double ort = kullanicidanAlinanSayiToplami / kacSayiAlinacak;
        System.out.println("Ortalamanız " + ort);


*/

    }

}