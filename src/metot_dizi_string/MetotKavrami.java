package metot_dizi_string;

public class MetotKavrami {


    public static void main(String[] args) {

        menuGoster();
        sayilariTopla(5, 6);
        sayilariTopla(23, 2);
        sayilariTopla(69, 7);

        System.out.println("Sayıların Farkı = " + sayilarinFarkiniBul(10, 6, 23, 40));
        int donulenDeger = sayilarinFarkiniBul(10, 6, 14, 40);
        System.out.println("İki sayının farkı = " + donulenDeger);


        //Parametre almayan , değer döndüren metot.
        double rastgeleSayi = Math.random();
        System.out.println("Rastgele üretilen değer : " + rastgeleSayi);

    }

    //Değer döndüren parametre alan metot
    public static int sayilarinFarkiniBul(int a, int b, int c, int d) {

        return (a - b - c - d);

    }


    //Parametre almayan ve değer döndürmeyen metot
    public static void menuGoster() {

        System.out.println("***** MENU *****");
        System.out.println("1- İki sayının toplamını bul");
        System.out.println("2- İki sayının farkını bul");
        System.out.println("3- İki sayının çarpımını bul");
        System.out.println("4- İki sayının bölümünü bul");
    }

    //Parametre alan metot
    public static void sayilariTopla(int birinciSayi, int ikinciSayi) {
        System.out.println("Toplam = " + (birinciSayi + ikinciSayi));

    }


}
