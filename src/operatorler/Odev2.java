package operatorler;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {

        int olc = 1444;

        int olculenDakika = olc / 60;
        int olculenSaniye = (olc) - (olculenDakika * 60);
        int olculenSaniye2 = olc % 60;

        System.out.println("Ölçülen dakika:  " + olculenDakika);
        System.out.println("Ölçülen saniye:  " + olculenSaniye);
        System.out.println("Ölçülen saniye2:  " + olculenSaniye2);


    // gün + saat + dakika + saniyeye çevireni yaz.

        double fahrenheit = 100;
        double celcius = (5d / 9) *(fahrenheit - 32);

        System.out.println("Derece ölç: " + celcius);



    // doğum tarihinin gerçekten girilip girilmediğini kontrol et. 50+ giremesin, 18- de giremesin.

        Scanner scn = new Scanner(System.in);
        System.out.print("Lütfen doğum tarihini girin: ");

        int dogumTarihi = scn.nextInt();

        int tarih = Year.now().getValue();

        boolean uygunMu = tarih - dogumTarihi > 18 && tarih - dogumTarihi < 50;

        System.out.println("Doğum tarihi gerçek mi?: " + !uygunMu);




    }

}
