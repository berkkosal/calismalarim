package araba_uretim_projesi;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class ArabaUretimi {

    static Scanner kullanicidanAlinanBilgi = new Scanner(System.in);
    static ArrayList<Araba> arabaListesi = new ArrayList<>();

    public static void main(String[] args) {

        menuCagir();


    }

    public static void arabaListele() {

        for (int i = 0; i < arabaListesi.size(); i++) {

            Araba x = arabaListesi.get(i);
            System.out.println("Arabanızın markası: " + x.marka);
            System.out.println("Arabanızın modeli: " + x.model);
            System.out.println("Arabanızın üretim yılı: " + x.uretimYili);

        }

    }

    public static void arabaUret() {
        Araba a1 = new Araba();
        System.out.println("Lütfen arabanızın markasını giriniz.");
        a1.marka = kullanicidanAlinanBilgi.next();
        System.out.println("Lütfen arabanızın modelini giriniz.");
        a1.model = kullanicidanAlinanBilgi.next();
        a1.uretimYili = Year.now().getValue();

        arabaListesi.add(a1);
        System.out.println("Araba başarıyla oluşturuldu");

    }


    public static void menuCagir() {


        while (true) {

            System.out.println("*************MENU*************");
            System.out.println("1-Araba Üret");
            System.out.println("2-Araba Listele");
            System.out.println("3-Çıkış yap.");
            int kullaniciSayisi = kullanicidanAlinanBilgi.nextInt();

            if (kullaniciSayisi == 1) {
                arabaUret();


            } else if (kullaniciSayisi == 2) {

                arabaListele();

            } else if (kullaniciSayisi == 3) {

                break;

            } else {
                System.out.println("Hatalı tuşlama yaptınız, lütfen tekrar deneyin.");


            }

        }

        System.out.println("Çıkış yapılıyor.");
    }


}
